/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;
    private HashMap<String,String> FuncName2Type;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /** String program in ArrayList form*/
    private ArrayList<String> programa;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
        programa = new ArrayList<String>();
    }

    public ArrayList getVector(){
      return programa;
    }
    
    /** Runs the program by calling the main function. */
    public void Run() {
      String main = "  public void main(";
      main += ") throws InterruptedException {";
      programa.add(main);
      programa.add("      TouchSensor touch = new TouchSensor(SensorPort.S1);");      
      executeFunction ("main", null, true);
      programa.add("  }");
      programa.add("}");
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        FuncName2Type = new HashMap<String,String> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(1).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
            FuncName2Type.put(fname, f.getChild(0).getText());
        } 
    }
    
    /**
     * Prepares the functions
     */
    public void prepareFunctions(){
      programa.add("import josx.platform.rcx.*;");
      programa.add("public class NXTLeJOS {");
      int posarbr = 2;
      Set a = FuncName2Tree.keySet();
      String[] stringArray;
      stringArray = (String[]) a.toArray(new String[a.size()]);
      for (int i = 0; i < stringArray.length; i++){
	String fname = stringArray[i];
	String ftype = FuncName2Type.get(fname);
	AslTree f = (AslTree) FuncName2Tree.get(fname);
	if(!fname.equals("main")){
	  int n = f.getChild(posarbr).getChildCount();
	  String aux = "  public "+ftype+" "+fname+"(";
	  for (int j = 0; j < n; j++){
	    String tipus = f.getChild(posarbr).getChild(j).getText();
	    aux += f.getChild(posarbr).getChild(j).getText()+" ";
	    ++j;
	    if(f.getChild(posarbr).getChild(j).getType() == AslLexer.PREF) aux += "& ";
	    if(j < n-1) aux += f.getChild(posarbr).getChild(j).getText()+", ";
	    else aux += f.getChild(posarbr).getChild(j).getText();
	  }
	  aux += "){";
	  programa.add(aux);
	  Data d = executeFunction(fname, f.getChild(posarbr), true);
	  if (ftype != "void" && d == null) throw new RuntimeException ("Missing return statement in: " + fname);
	  programa.add("  }");
	}
      }
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args, boolean prepare) {
        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        int posarbr = 2;
        
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args, prepare);
        
        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);

        // List of parameters of the callee
        AslTree p = f.getChild(posarbr);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
        // Copy the parameters to the current activation record
        for (int i = 1; i < nparam; i += 2) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i/2));
        }
        // Execute the instructions
        Data result = executeListInstructions (f.getChild(posarbr+1), "    ", prepare);
        
        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    
    private String checkStringBoolean (AslTree t){
      String ret = "";
      if(t.getChild(0) != null) ret += (checkStringBoolean(t.getChild(0)) + " ");
      ret += t.getText();
      if(t.getChild(1) != null) ret += (" " + checkStringBoolean(t.getChild(1)));
      return ret;
    }    
        
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t, String ident, boolean prepare) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value
        
        String instruct = ident; // The instructions translated to RoboBasic so far.

        // A big switch for all type of instructions
        switch (t.getType()) {

            // Assignment
            case AslLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                //Here goes the ARRAY
                AslTree tson = t.getChild(0);
                String nom;
                String tipus = "void";
                if(tson.getType() == AslLexer.LBRACK){
                    nom = tson.getChild(0).getText();
                    if(Stack.defineVariable(tson.getChild(0).getText(), value)){
                        switch(value.getType()){
                          case ARRAYB:
                            tipus = "boolean[";
                            break;
                          case ARRAYI:
                            tipus = "int[";
                            break;
                          case ARRAYS:
                            tipus = "String[";
                            break;
                          default: assert false;
                              }
                    }
                    Data d = Stack.getVariable(tson.getChild(0).getText());
                    Data pos = evaluateExpression(tson.getChild(1));
                    int posicio = pos.getIntegerValue();
                    if (value.isBoolean()) d.setValue(posicio, value.getBooleanValue());
                    else d.setValue(posicio, value.getIntegerValue());
                    tipus += pos.getEquivalent()+"]";
                }
                else{
                    nom = t.getChild(0).getText();
                    if(Stack.defineVariable (t.getChild(0).getText(), value)){
                          switch(value.getType()){
                      case BOOLEAN:
                        tipus = "boolean";
                        break;
                      case INTEGER:
                        tipus = "int";
                        break;
                      case STRING:
                        tipus = "String";
                        break;
                      default: assert false;
                          }
                    }
                    else{
                        tipus = "";
                    }
                }
                value.defineString(nom+" = "+ value.getEquivalent());
                if(prepare){
                    if(tipus != "")programa.add(ident+tipus+" "+value.getEquivalent()+";");
                    else programa.add(ident+value.getEquivalent()+";");
                }    
                return null;

            // If-then-else
            case AslLexer.IF:
                instruct += "if (";
                instruct += (checkStringBoolean(t.getChild(0)));
                value = evaluateExpression(t.getChild(0));                
                checkBoolean(value);
                instruct += ") {";
                programa.add(instruct);
                executeListInstructions(t.getChild(1), ident, prepare);
                programa.add(ident + "}");                
                // Is there else statement ?
                if (t.getChildCount() == 3){
                    programa.add(ident + "else {");
                    executeListInstructions(t.getChild(2), ident, prepare);
                    programa.add(ident + "}");
                }
                //if(prepare) programa.add(ident + "endif");
                return null;   

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));                
                    instruct += "while (";
                    instruct += value.getEquivalent();
                    instruct += ") {";                
                    checkBoolean(value);                  
                    programa.add(instruct);                      
                    Data r = executeListInstructions(t.getChild(1), ident, prepare);
                    programa.add(ident + "}");
                    //if(prepare) programa.add(ident + "wend");
                    return null;
                }
/*                
            // If-then-else
            case AslLexer.IF:
                instruct += "if ";
                instruct += (checkStringBoolean(t.getChild(0)));
                value = evaluateExpression(t.getChild(0));                
                checkBoolean(value);
                programa.add(instruct);
                executeListInstructions(t.getChild(1), ident, prepare);
                // Is there else statement ?
                if (t.getChildCount() == 3){
                    programa.add(ident + "else");
                    executeListInstructions(t.getChild(2), ident, prepare);
                }
                if(prepare) programa.add(ident + "endif");
                return null;   

            // While
            case AslLexer.WHILE:
                while (true) {
                    instruct += "while ";
                    instruct += (checkStringBoolean(t.getChild(0)));                
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);                  
                    programa.add(instruct);                      
                    Data r = executeListInstructions(t.getChild(1), ident, prepare);
                    if(prepare) programa.add(ident + "wend");
                    return null;
                }                
*/
                
                
            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case AslLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                /*AslTree tson = t.getChild(0);
                if(tson.getType() == AslLexer.LBRACK){
		  Stack.defineVariable(tson.getChild(0).getText(), val, tson.getChild(1).getIntValue);
                }
                else*/ Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case AslLexer.WRITE:
                instruct += "print ";
                instruct += evaluateExpression(t.getChild(0)).toString();
                if(prepare) programa.add(instruct); 
                return null;
                
	    case AslLexer.INIROBOT:
		instruct = "rLocate ";
		int n = t.getChildCount();
		for(int i = 0; i < n-1; i++){
		  Data number = evaluateExpression(t.getChild(i));
		  String str = number.getEquivalent();
		  checkInteger(number);
		  instruct += str;
		  instruct += ", ";
		}
		Data number = evaluateExpression(t.getChild(t.getChildCount()-1));
		String str = number.getEquivalent();
		checkInteger(number);
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
		
	    case AslLexer.NOBSTACLE:
		instruct = "rInvisible ";
		n = t.getChildCount();
		for (int i = 0; i < n-1; i++) {
		  str = t.getChild(i).getText();
		  instruct += str;
		  instruct += ", ";
		}
		str = t.getChild(t.getChildCount()-1).getText();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
	    case AslLexer.PINTARCOLOR:
		instruct = "rPen ";
		str = t.getChild(0).getText();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
	    case AslLexer.AVAN:
		instruct = "rForward ";
		number = evaluateExpression(t.getChild(0));
		checkInteger(number);
		str = number.getEquivalent();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
	    case AslLexer.GIRA:
		instruct = "rTurn ";
		number = evaluateExpression(t.getChild(0));
		checkInteger(number);
		str = number.getEquivalent();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;

	   case AslLexer.SENTIR:
		instruct = "touch.isPressed()";
		if(prepare) programa.add(ident+instruct+";");
		return null;
	   case AslLexer.INFRA:
		instruct = "rSense()";
		if(prepare) programa.add(ident+instruct+";");
		return null;
	   case AslLexer.CHOCAR:
		instruct = "rBumper()";
		if(prepare) programa.add(ident+instruct+";");
		return null;
	   case AslLexer.ORIENTACION:
		instruct = "rCompass()";
		if(prepare) programa.add(ident+instruct+";");
		return null;
	   case AslLexer.DISTANCIACOLOR:
		instruct = "rBeacon(";
		str = t.getChild(0).getText();
		instruct += str;
		instruct += ")";
		if(prepare) programa.add(ident+instruct+";");
		return null;
           case AslLexer.MIRAR:
		instruct = "rLook( ";
		number = evaluateExpression(t.getChild(0));
		checkInteger(number);
		str = number.getEquivalent();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
	    case AslLexer.OBSTACLE:
		instruct = "CircleWH ";
		n = t.getChildCount();
		str = "";
		for(int i = 0; i < 4; i++){
		  number = evaluateExpression(t.getChild(i));
		  str = number.getEquivalent();
		  checkInteger(number);
		  instruct += str;
		  instruct += ", ";
		}
		for(int i = 4; i < n-1; i++){
		  t.getChild(i).getText();
		  instruct += str;
		}
		str = t.getChild(n-1).getText();
		instruct += str;
		if(prepare) programa.add(ident+instruct+";");
		return null;
            // Function call
            case AslLexer.FUNCALL:
		if(prepare) programa.add(ident+t.getChild(0).getText()+"();");
                executeFunction(t.getChild(0).getText(), t.getChild(1), false);
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }
    
    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t, String ident, boolean prepare) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i), ident+"  ", prepare);
            if (result != null) return result;
        }
        return null;
    }
    
    /**
     * Gets the operator in the form of a string. Translates operator into string.
     */
    
    private String getStringOperator(int type){
      switch (type) {
	// Relational operators
	case AslLexer.EQUAL:
	  return "== ";
	case AslLexer.NOT_EQUAL:
	  return " != ";
	case AslLexer.LT:
	  return " < ";
	case AslLexer.LE:
	  return " <= ";
	case AslLexer.GT:
	  return " > ";
	case AslLexer.GE:
	  return " >= ";

	// Arithmetic operators
	case AslLexer.PLUS:
	  return " + ";
	case AslLexer.MINUS:
	  return " - ";
	case AslLexer.MUL:
	  return " * ";
	case AslLexer.DIV:
	  return " / ";
	case AslLexer.MOD:
	  return " % ";

	// Boolean operators
	case AslLexer.AND:
	  return " && ";
	case AslLexer.OR:
	  return " || ";
	default: assert false; // Should never happen
      }
      return "";
    }
    
    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {  
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();
        String equivalent = "";
        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                value.defineString(t.getText());
                break;
            // An integer literal
            case AslLexer.INT:
                value = new Data(t.getIntValue());
                value.defineString(t.getText());
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                value.defineString(t.getText());
                break;
                
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:
		value.defineString(t.getChild(0).getText()+"()");
		value = executeFunction(t.getChild(0).getText(), t.getChild(1), false);
		assert value != null;
		if (value.isVoid()) {
		    throw new RuntimeException ("function expected to return a value");
		}
		break;
            
            // Array
            case AslLexer.LBRACK:
		value = new Data(Stack.getVariable(t.getChild(0).getText()));
		Data value2 = evaluateExpression(t.getChild(1));
		equivalent = "[";
		equivalent += value2.getEquivalent();
		equivalent += "]";
		if(value.getType() == Data.Type.ARRAYB){
		  value = new Data(value.getArrayBooleanValue(value2.getIntegerValue()));
		}
		else{
		  value = new Data(value.getArrayIntegerValue(value2.getIntegerValue()));
		}
		value.defineString(equivalent);
                break;
            default: break;
        }
        
        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        //Al ser sensors (la majoria no tenen parametres) s'ha de tindre en compte que no tenen parametres.
        if(t.getChildCount() == 0) return new Data(true);
        
        
        // Unary operators       
        value = evaluateExpression(t.getChild(0));        
        if (t.getChildCount() == 1) {
	  String operator = "";
	  switch (type) {
	      case AslLexer.PLUS:
		  checkInteger(value);
		  operator = "+";
		  equivalent = value.toString();
		  value.setValue(-value.getIntegerValue());
		  break;
	      case AslLexer.MINUS:
		  checkInteger(value);
		  operator = "-";
		  equivalent = value.toString();
		  value.setValue(-value.getIntegerValue());
		  break;
	      case AslLexer.NOT:
	      System.out.println("Jaume no mola nada");
		  checkBoolean(value);
		  operator = "!";
		  equivalent = value.toString();
		  System.out.println(equivalent);
		  value.setValue(!value.getBooleanValue());
		  break;
	      case AslLexer.LPAREN:
		  operator = "(";
		  value.setData(evaluateExpression(t.getChild(0)));
		  equivalent = value.getEquivalent();
		  equivalent += ")";
		  break;
	      default: assert false; // Should never happen
	  }
	  value.defineString(operator+equivalent);
	  setLineNumber(previous_line);
	  return value;
        }

        // Two operands
        Data value2 = null;
        String operator = getStringOperator(type);
        
        switch (type) {
            // Relational operators
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkInteger(value); checkInteger(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        value.defineString(value.getEquivalent()+operator+value2.getEquivalent());
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is String and raises an exception if it is not. */
    private void checkString (Data b) {
        if (!b.isString()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical expression");
        }
    }

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args, boolean prepares) {
        if (args != null) setLineNumber(args);
	int posarbr = 2;
        AslTree pars = AstF.getChild(posarbr);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if ((!prepares && n/2 != nargs) || (prepares && n != nargs)) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(posarbr).getText());
        }
        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
	if (prepares){
	  for (int i = 1; i < n; i += 2) {
	      AslTree p = pars.getChild(i); // Parameters of the callee
	      AslTree a = args.getChild(i); // Arguments passed by the caller
	      setLineNumber(a);
	      String tipus = pars.getChild(i-1).getText();
	      Data val = new Data(1);
	      if(tipus.equals("string")) val = new Data ("A");
	      else if(tipus.equals("bool")) val = new Data (false);
	      if (p.getType() == AslLexer.PVALUE) {
		  // Pass by value: evaluate the expression
		  Params.add(i/2, val);
	      } else {
		  // Find the variable and pass the reference
		  Params.add(i/2,val);
	      }
	  }
        }
        else{
	  for (int i = 0; i < n/2; i++) {
	      AslTree p = pars.getChild(i); // Parameters of the callee
	      AslTree a = args.getChild(i); // Arguments passed by the caller
	      setLineNumber(a);
	      if (p.getType() == AslLexer.PVALUE) {
		  // Pass by value: evaluate the expression
		  Params.add(i, evaluateExpression(a));
	      } else {
		  // Pass by reference: check that it is a variable
		  if (a.getType() != AslLexer.ID) {
		      throw new RuntimeException("Wrong argument for pass by reference");
		  }
		  // Find the variable and pass the reference
		  Data v = Stack.getVariable(a.getText());
		  Params.add(i,v);
	      }
	  }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }
}
