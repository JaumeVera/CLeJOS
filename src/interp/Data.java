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

/**
 * Class to represent data in the interpreter.
 * Each data item has a type and a value. The type can be integer
 * or Boolean. Each operation asserts that the operands have the
 * appropriate types.
 * All the arithmetic and Boolean operations are calculated in-place,
 * i.e., the result is stored in the same data.
 * The type VOID is used to represent void values on function returns.
 */

import parser.*;

public class Data {
    /** Types of data */
    public enum Type {VOID, BOOLEAN, INTEGER, STRING, ARRAYI, ARRAYB, ARRAYS;}

    /** Type of data*/
    private Type type;

    /** Value of the data */
    private int value; 

    /** Content of the array */
    private int[] content;

    /** Word if it's a string */
    private String word;
    
    /** Word if it's a string */
    private String[] words;
    
    /** String equivalent */
    private String written;
    
    /** Constructor for integers */
    Data(int v) {type = Type.INTEGER; value = v; }

    /** Constructor for Booleans */
    Data(boolean b) {type = Type.BOOLEAN; value = b ? 1 : 0; }

    /** Constructor for String */
    Data(String s) {type = Type.STRING; word = s; }
    
    /** Constructor for array of int */
    Data(int av, int pos) {
      type = Type.ARRAYI;
      value = pos;
      content = new int[pos+1];
      for (int i = 0; i < pos; i++) content[i] = 0;
      content[pos] = av;
    }
    
    /** Constructor for array of bool */
    Data(boolean ab, int pos) {
      type = Type.ARRAYB;
      value = pos;
      content = new int[pos+1];
      for (int i = 0; i < pos; i++) content[i] = 0;
      content[pos] = ab ? 1 : 0;
    }
    
    /** Constructor for array of string */
    Data(String s, int pos) {
      type = Type.ARRAYS;
      value = pos;
      words = new String[pos+1];
      for (int i = 0; i < pos; i++) words[i] = "";
      words[pos] = s;
    }
    
    /** Constructor for void data */
    Data() {type = Type.VOID; }

    /** Copy constructor */
    Data(Data d) {
      type = d.type;
      value = d.value;
      word = d.word;
      if (type == Type.ARRAYB || type == Type.ARRAYI){
	content = new int[d.value+1];
	for (int i = 0; i < d.value+1; i++){
	  content[i] = d.content[i];
	}
      }
      else if (type == Type.ARRAYS){
	words = new String[d.value+1];
	for (int i = 0; i < d.value+1; i++){
	  words[i] = d.words[i];
	}
      }
    }

    /** Returns the type of data */
    public Type getType() { return type; }

    /** Indicates whether the data is Array of Boolean */
    public boolean isArrayBoolean() { return type == Type.ARRAYB; }

    /** Indicates whether the data is Array of Integer */
    public boolean isArrayInteger() { return type == Type.ARRAYI; }

    /** Indicates whether the data is Array of String */
    public boolean isArrayString() { return type == Type.ARRAYS; }
    
    /** Indicates whether the data is String */
    public boolean isString() { return type == Type.STRING; }
    
    /** Indicates whether the data is Boolean */
    public boolean isBoolean() { return type == Type.BOOLEAN; }

    /** Indicates whether the data is integer */
    public boolean isInteger() { return type == Type.INTEGER; }

    /** Indicates whether the data is void */
    public boolean isVoid() { return type == Type.VOID; }

    /**
     * Gets the value of an integer data. The method asserts that
     * the data is an integer.
     */
    public int getIntegerValue() {
        assert type == Type.INTEGER;
        return value;
    }

    /**
     * Gets the value of a Boolean data. The method asserts that
     * the data is a Boolean.
     */
    public boolean getBooleanValue() {
        assert type == Type.BOOLEAN;
        return value == 1;
    }
    
    /**
     * Gets the value of a String data. The method asserts that
     * the data is a String.
     */
    public String getStringValue() {
        assert type == Type.STRING;
        return word;
    }
    
    /**
     * Gets the value of an array of integer. The method asserts that
     * the data is an array of integers.
     */
    public int getArrayIntegerValue(int pos) {
        assert type == Type.ARRAYI;
        if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
        else return content[pos];
    }
    
    /**
     * Gets the value of an array of booleans. The method asserts that
     * the data is an array of booleans.
     */
    public boolean getArrayBooleanValue(int pos) {
        assert type == Type.ARRAYB;
        if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
        else return (content[pos] == 1);
    }

    /**
     * Gets the value of an array of strings. The method asserts that
     * the data is an array of strings.
     */
    public String getArrayStringValue(int pos) {
        assert type == Type.ARRAYS;
        if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
        else return words[pos];
    }
    
    /** Defines a Boolean value for the data */
    public void setValue(boolean b) {
      type = Type.BOOLEAN;
      value = b ? 1 : 0;
    }

    /** Defines an integer value for the data */
    public void setValue(int v) {
      type = Type.INTEGER;
      value = v;
    }
    
    /** Defines an integer value for the data */
    public void setValue(String s) {
      type = Type.STRING;
      word = s;
    }

    /** Defines an array of booleans value for the data */
    public void setValue(int pos, boolean b) {
      if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
      else if (type == Type.ARRAYB) content[pos] = b ? 1 : 0;
      else{
	String typ = "Integer";
	if (type == Type.ARRAYI) typ = "Integer Array";
	else if (type == Type.ARRAYS) typ = "String Array";
	else if (type == Type.BOOLEAN) typ = "Boolean";
	else if (type == Type.STRING) typ = "String";
	throw new RuntimeException ("Wrong type. Expected: Boolean Array. Found: "+typ+".");
      }
      type = Type.ARRAYB;
    }

    /** Defines an integer value for the data */
    public void setValue(int pos, int v) {
      if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
      else if (type == Type.ARRAYI) content[pos] = v;
      else{
	String typ = "Integer";
	if (type == Type.ARRAYB) typ = "Boolean Array";
	else if (type == Type.ARRAYS) typ = "String Array";
	else if (type == Type.BOOLEAN) typ = "Boolean";
	else if (type == Type.STRING) typ = "String";
	throw new RuntimeException ("Wrong type. Expected: Integer Array. Found: "+typ+".");
      }
      type = Type.ARRAYI;
    }
    
    /** Defines an integer value for the data */
    public void setValue(int pos, String w) {
      if (pos > value) throw new RuntimeException ("Out of Bounds Exception");
      else if (type == Type.ARRAYS) words[pos] = w;
      else{
	String typ = "Integer";
	if (type == Type.ARRAYB) typ = "Boolean Array";
	else if (type == Type.ARRAYI) typ = "Integer Array";
	else if (type == Type.BOOLEAN) typ = "Boolean";
	else if (type == Type.STRING) typ = "String";
	throw new RuntimeException ("Wrong type. Expected: String Array. Found: "+typ+".");
      }
      type = Type.ARRAYS;
    }
    
    public void initArray(int pos, int v) {
      type = Type.ARRAYI;
      content = new int[pos+1];
      for(int i = 0; i < pos; i++) content[i] = 0;
      content[pos] = v;
    }
    
    public void initArray(int pos, Boolean b) {
      type = Type.ARRAYB;
      content = new int[pos+1];
      for(int i = 0; i < pos; i++) content[i] = 0;
      content[pos] = b ? 1 : 0;
    }
    
    public void initArray(int pos, String w) {
      type = Type.ARRAYS;
      words = new String[pos+1];
      for(int i = 0; i < pos; i++) words[i] = "";
      words[pos] = w;
    }
    
    /** Copies the value from another data */
    public void setData(Data d) { 
      type = d.type;
      value = d.value;
      word = d.word;
      if (type == Type.ARRAYB || type == Type.ARRAYI){
	content = new int[d.value+1];
	for (int i = 0; i < d.value+1; i++){
	  content[i] = d.content[i];
	}
      }
      else if (type == Type.ARRAYS){
	words = new String[d.value+1];
	for (int i = 0; i < d.value+1; i++){
	  words[i] = d.words[i];
	}
      }
    }
    
    /** Define string */
    public void defineEquivalent(String str){
      written = str;
    }
    
    /** Add string */
    public void addToEquivalent(String str){
      written += str;
    }
    
    /** Returns a string representing the data in textual form. */
    public String toString() {
        if (type == Type.BOOLEAN) return value == 1 ? "true" : "false";
        return Integer.toString(value);
    }
    
    /** Returns the equivalent string */
    
    public String getEquivalent(){
      return written;
    }
    
    /**
     * Checks for zero (for division). It raises an exception in case
     * the value is zero.
     */
    private void checkDivZero(Data d) {
        if (d.value == 0) throw new RuntimeException ("Division by zero");
    }

    /**
     * Evaluation of arithmetic expressions. The evaluation is done
     * "in place", returning the result on the same data.
     * @param op Type of operator (token).
     * @param d Second operand.
     */
     
    public void evaluateArithmetic (int op, Data d) {
        assert type == Type.INTEGER && d.type == Type.INTEGER;
        switch (op) {
            case AslLexer.PLUS: value += d.value; break;
            case AslLexer.MINUS: value -= d.value; break;
            case AslLexer.MUL: value *= d.value; break;
            case AslLexer.DIV: checkDivZero(d); value /= d.value; break;
            case AslLexer.MOD: checkDivZero(d); value %= d.value; break;
            default: assert false;
        }
    }

    /**
     * Evaluation of expressions with relational operators.
     * @param op Type of operator (token).
     * @param d Second operand.
     * @return A Boolean data with the value of the expression.
     */
    public Data evaluateRelational (int op, Data d) {
        assert type != Type.VOID && type == d.type;
        switch (op) {
            case AslLexer.EQUAL: return new Data(value == d.value);
            case AslLexer.NOT_EQUAL: return new Data(value != d.value);
            case AslLexer.LT: return new Data(value < d.value);
            case AslLexer.LE: return new Data(value <= d.value);
            case AslLexer.GT: return new Data(value > d.value);
            case AslLexer.GE: return new Data(value >= d.value);
            default: assert false; 
        }
        return null;
    }
}
