// $ANTLR 3.4 /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g 2014-05-07 22:25:33

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int AVAN=7;
    public static final int BOOL=8;
    public static final int BOOLEAN=9;
    public static final int CARACTERS=10;
    public static final int CHOCAR=11;
    public static final int COLOR=12;
    public static final int COMMENT=13;
    public static final int DISTANCIACOLOR=14;
    public static final int DIV=15;
    public static final int DO=16;
    public static final int ELSE=17;
    public static final int ENDFUNC=18;
    public static final int ENDIF=19;
    public static final int ENDWHILE=20;
    public static final int ENTER=21;
    public static final int EQUAL=22;
    public static final int ESC_SEQ=23;
    public static final int ESTADOPINTAR=24;
    public static final int FALSE=25;
    public static final int FUNC=26;
    public static final int FUNCALL=27;
    public static final int GE=28;
    public static final int GIRA=29;
    public static final int GT=30;
    public static final int ID=31;
    public static final int IF=32;
    public static final int INFRA=33;
    public static final int INIROBOT=34;
    public static final int INT=35;
    public static final int LBRACK=36;
    public static final int LE=37;
    public static final int LIST_FUNCTIONS=38;
    public static final int LIST_INSTR=39;
    public static final int LPAREN=40;
    public static final int LT=41;
    public static final int MINUS=42;
    public static final int MIRAR=43;
    public static final int MOD=44;
    public static final int MUL=45;
    public static final int NOBSTACLE=46;
    public static final int NOT=47;
    public static final int NOT_EQUAL=48;
    public static final int OBSTACLE=49;
    public static final int OR=50;
    public static final int ORIENTACION=51;
    public static final int PARAMS=52;
    public static final int PINTARCOLOR=53;
    public static final int PLUS=54;
    public static final int PREF=55;
    public static final int PVALUE=56;
    public static final int RBRACK=57;
    public static final int READ=58;
    public static final int RETRO=59;
    public static final int RETURN=60;
    public static final int SENTIR=61;
    public static final int STRING=62;
    public static final int THEN=63;
    public static final int TRUE=64;
    public static final int WHILE=65;
    public static final int WRITE=66;
    public static final int WS=67;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g"; }

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:6:7: ( '&' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:7:7: ( ')' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:8:7: ( ',' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:9:7: ( ';' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "ENTER"
    public final void mENTER() throws RecognitionException {
        try {
            int _type = ENTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:193:7: ( 'int' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:193:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENTER"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:194:6: ( 'bool' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:194:8: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "CARACTERS"
    public final void mCARACTERS() throws RecognitionException {
        try {
            int _type = CARACTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:195:11: ( 'string' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:195:13: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARACTERS"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:196:8: ( '(' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:196:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:197:8: ( '[' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:197:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:198:8: ( ']' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:198:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:199:7: ( '=' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:199:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:200:10: ( '!=' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:200:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:201:8: ( '<' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:201:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:202:8: ( '<=' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:202:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:203:8: ( '>' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:203:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:204:8: ( '>=' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:204:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:205:6: ( '+' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:205:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:206:7: ( '-' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:206:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:207:9: ( '*' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:207:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:208:9: ( '/' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:208:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:209:9: ( '%' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:209:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:210:9: ( 'not' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:210:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:211:9: ( 'and' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:211:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:212:8: ( 'or' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:212:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:213:6: ( 'if' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:213:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:214:6: ( 'then' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:214:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:215:6: ( 'else' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:215:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:216:7: ( 'endif' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:216:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:217:7: ( 'while' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:217:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:218:8: ( 'do' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:218:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:219:9: ( 'endwhile' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:219:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:220:6: ( 'func' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:220:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:221:9: ( 'endfunc' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:221:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:222:8: ( 'return' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:222:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:223:6: ( 'read' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:223:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:224:7: ( 'write' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:224:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:225:9: ( 'true' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:225:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:226:9: ( 'false' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:226:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INIROBOT"
    public final void mINIROBOT() throws RecognitionException {
        try {
            int _type = INIROBOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:227:9: ( 'inirobot' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:227:11: 'inirobot'
            {
            match("inirobot"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INIROBOT"

    // $ANTLR start "AVAN"
    public final void mAVAN() throws RecognitionException {
        try {
            int _type = AVAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:228:6: ( 'avanca' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:228:8: 'avanca'
            {
            match("avanca"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVAN"

    // $ANTLR start "RETRO"
    public final void mRETRO() throws RecognitionException {
        try {
            int _type = RETRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:229:7: ( 'retrocedeix' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:229:9: 'retrocedeix'
            {
            match("retrocedeix"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETRO"

    // $ANTLR start "NOBSTACLE"
    public final void mNOBSTACLE() throws RecognitionException {
        try {
            int _type = NOBSTACLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:230:11: ( 'noobstacle' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:230:13: 'noobstacle'
            {
            match("noobstacle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOBSTACLE"

    // $ANTLR start "PINTARCOLOR"
    public final void mPINTARCOLOR() throws RecognitionException {
        try {
            int _type = PINTARCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:231:13: ( 'pinta' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:231:15: 'pinta'
            {
            match("pinta"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PINTARCOLOR"

    // $ANTLR start "OBSTACLE"
    public final void mOBSTACLE() throws RecognitionException {
        try {
            int _type = OBSTACLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:232:10: ( 'obstacle' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:232:12: 'obstacle'
            {
            match("obstacle"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OBSTACLE"

    // $ANTLR start "SENTIR"
    public final void mSENTIR() throws RecognitionException {
        try {
            int _type = SENTIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:233:8: ( 'sentir' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:233:10: 'sentir'
            {
            match("sentir"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SENTIR"

    // $ANTLR start "INFRA"
    public final void mINFRA() throws RecognitionException {
        try {
            int _type = INFRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:234:7: ( 'infrared' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:234:9: 'infrared'
            {
            match("infrared"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INFRA"

    // $ANTLR start "CHOCAR"
    public final void mCHOCAR() throws RecognitionException {
        try {
            int _type = CHOCAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:235:8: ( 'chocar' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:235:10: 'chocar'
            {
            match("chocar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHOCAR"

    // $ANTLR start "DISTANCIACOLOR"
    public final void mDISTANCIACOLOR() throws RecognitionException {
        try {
            int _type = DISTANCIACOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:236:16: ( 'distanciacolor' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:236:18: 'distanciacolor'
            {
            match("distanciacolor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTANCIACOLOR"

    // $ANTLR start "ORIENTACION"
    public final void mORIENTACION() throws RecognitionException {
        try {
            int _type = ORIENTACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:237:13: ( 'orientacion' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:237:15: 'orientacion'
            {
            match("orientacion"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORIENTACION"

    // $ANTLR start "MIRAR"
    public final void mMIRAR() throws RecognitionException {
        try {
            int _type = MIRAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:238:7: ( 'mirar' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:238:9: 'mirar'
            {
            match("mirar"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIRAR"

    // $ANTLR start "GIRA"
    public final void mGIRA() throws RecognitionException {
        try {
            int _type = GIRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:239:6: ( 'gira' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:239:8: 'gira'
            {
            match("gira"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GIRA"

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:7: ( ( 'black' | 'blue' | 'green' | 'cyan' | 'red' | 'magenta' | 'brown' | 'gray' | 'darkgray' | 'lightblue' | 'lightcyan' | 'lightred' | 'lightmagenta' | 'yellow' | 'white' ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:9: ( 'black' | 'blue' | 'green' | 'cyan' | 'red' | 'magenta' | 'brown' | 'gray' | 'darkgray' | 'lightblue' | 'lightcyan' | 'lightred' | 'lightmagenta' | 'yellow' | 'white' )
            {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:9: ( 'black' | 'blue' | 'green' | 'cyan' | 'red' | 'magenta' | 'brown' | 'gray' | 'darkgray' | 'lightblue' | 'lightcyan' | 'lightred' | 'lightmagenta' | 'yellow' | 'white' )
            int alt1=15;
            switch ( input.LA(1) ) {
            case 'b':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='l') ) {
                    int LA1_10 = input.LA(3);

                    if ( (LA1_10=='a') ) {
                        alt1=1;
                    }
                    else if ( (LA1_10=='u') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA1_1=='r') ) {
                    alt1=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'g':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='r') ) {
                    int LA1_12 = input.LA(3);

                    if ( (LA1_12=='e') ) {
                        alt1=3;
                    }
                    else if ( (LA1_12=='a') ) {
                        alt1=8;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 12, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'c':
                {
                alt1=4;
                }
                break;
            case 'r':
                {
                alt1=5;
                }
                break;
            case 'm':
                {
                alt1=6;
                }
                break;
            case 'd':
                {
                alt1=9;
                }
                break;
            case 'l':
                {
                int LA1_7 = input.LA(2);

                if ( (LA1_7=='i') ) {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13=='g') ) {
                        int LA1_18 = input.LA(4);

                        if ( (LA1_18=='h') ) {
                            int LA1_19 = input.LA(5);

                            if ( (LA1_19=='t') ) {
                                switch ( input.LA(6) ) {
                                case 'b':
                                    {
                                    alt1=10;
                                    }
                                    break;
                                case 'c':
                                    {
                                    alt1=11;
                                    }
                                    break;
                                case 'r':
                                    {
                                    alt1=12;
                                    }
                                    break;
                                case 'm':
                                    {
                                    alt1=13;
                                    }
                                    break;
                                default:
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 20, input);

                                    throw nvae;

                                }

                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 19, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 18, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 7, input);

                    throw nvae;

                }
                }
                break;
            case 'y':
                {
                alt1=14;
                }
                break;
            case 'w':
                {
                alt1=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:11: 'black'
                    {
                    match("black"); 



                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:21: 'blue'
                    {
                    match("blue"); 



                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:30: 'green'
                    {
                    match("green"); 



                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:40: 'cyan'
                    {
                    match("cyan"); 



                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:49: 'red'
                    {
                    match("red"); 



                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:57: 'magenta'
                    {
                    match("magenta"); 



                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:69: 'brown'
                    {
                    match("brown"); 



                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:79: 'gray'
                    {
                    match("gray"); 



                    }
                    break;
                case 9 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:88: 'darkgray'
                    {
                    match("darkgray"); 



                    }
                    break;
                case 10 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:101: 'lightblue'
                    {
                    match("lightblue"); 



                    }
                    break;
                case 11 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:115: 'lightcyan'
                    {
                    match("lightcyan"); 



                    }
                    break;
                case 12 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:129: 'lightred'
                    {
                    match("lightred"); 



                    }
                    break;
                case 13 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:142: 'lightmagenta'
                    {
                    match("lightmagenta"); 



                    }
                    break;
                case 14 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:159: 'yellow'
                    {
                    match("yellow"); 



                    }
                    break;
                case 15 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:240:170: 'white'
                    {
                    match("white"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLOR"

    // $ANTLR start "ESTADOPINTAR"
    public final void mESTADOPINTAR() throws RecognitionException {
        try {
            int _type = ESTADOPINTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:241:14: ( ( 'up' | 'down' ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:241:16: ( 'up' | 'down' )
            {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:241:16: ( 'up' | 'down' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='u') ) {
                alt2=1;
            }
            else if ( (LA2_0=='d') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:241:17: 'up'
                    {
                    match("up"); 



                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:241:24: 'down'
                    {
                    match("down"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESTADOPINTAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:242:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:242:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:242:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:243:6: ( ( '0' .. '9' )+ )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:243:8: ( '0' .. '9' )+
            {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:243:8: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:246:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:246:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:246:16: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:246:30: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:246:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:247:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:247:13: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:247:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:251:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:251:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:251:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:251:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:251:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:257:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:257:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:260:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:260:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:8: ( T__68 | T__69 | T__70 | T__71 | ENTER | BOOL | CARACTERS | LPAREN | LBRACK | RBRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | INIROBOT | AVAN | RETRO | NOBSTACLE | PINTARCOLOR | OBSTACLE | SENTIR | INFRA | CHOCAR | DISTANCIACOLOR | ORIENTACION | MIRAR | GIRA | COLOR | ESTADOPINTAR | ID | INT | COMMENT | STRING | WS )
        int alt10=58;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:10: T__68
                {
                mT__68(); 


                }
                break;
            case 2 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:16: T__69
                {
                mT__69(); 


                }
                break;
            case 3 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:22: T__70
                {
                mT__70(); 


                }
                break;
            case 4 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:28: T__71
                {
                mT__71(); 


                }
                break;
            case 5 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:34: ENTER
                {
                mENTER(); 


                }
                break;
            case 6 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:40: BOOL
                {
                mBOOL(); 


                }
                break;
            case 7 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:45: CARACTERS
                {
                mCARACTERS(); 


                }
                break;
            case 8 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:55: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 9 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:62: LBRACK
                {
                mLBRACK(); 


                }
                break;
            case 10 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:69: RBRACK
                {
                mRBRACK(); 


                }
                break;
            case 11 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:76: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 12 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:82: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 13 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:92: LT
                {
                mLT(); 


                }
                break;
            case 14 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:95: LE
                {
                mLE(); 


                }
                break;
            case 15 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:98: GT
                {
                mGT(); 


                }
                break;
            case 16 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:101: GE
                {
                mGE(); 


                }
                break;
            case 17 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:104: PLUS
                {
                mPLUS(); 


                }
                break;
            case 18 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:109: MINUS
                {
                mMINUS(); 


                }
                break;
            case 19 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:115: MUL
                {
                mMUL(); 


                }
                break;
            case 20 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:119: DIV
                {
                mDIV(); 


                }
                break;
            case 21 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:123: MOD
                {
                mMOD(); 


                }
                break;
            case 22 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:127: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:131: AND
                {
                mAND(); 


                }
                break;
            case 24 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:135: OR
                {
                mOR(); 


                }
                break;
            case 25 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:138: IF
                {
                mIF(); 


                }
                break;
            case 26 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:141: THEN
                {
                mTHEN(); 


                }
                break;
            case 27 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:146: ELSE
                {
                mELSE(); 


                }
                break;
            case 28 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:151: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 29 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:157: WHILE
                {
                mWHILE(); 


                }
                break;
            case 30 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:163: DO
                {
                mDO(); 


                }
                break;
            case 31 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:166: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:175: FUNC
                {
                mFUNC(); 


                }
                break;
            case 33 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:180: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 34 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:188: RETURN
                {
                mRETURN(); 


                }
                break;
            case 35 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:195: READ
                {
                mREAD(); 


                }
                break;
            case 36 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:200: WRITE
                {
                mWRITE(); 


                }
                break;
            case 37 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:206: TRUE
                {
                mTRUE(); 


                }
                break;
            case 38 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:211: FALSE
                {
                mFALSE(); 


                }
                break;
            case 39 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:217: INIROBOT
                {
                mINIROBOT(); 


                }
                break;
            case 40 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:226: AVAN
                {
                mAVAN(); 


                }
                break;
            case 41 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:231: RETRO
                {
                mRETRO(); 


                }
                break;
            case 42 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:237: NOBSTACLE
                {
                mNOBSTACLE(); 


                }
                break;
            case 43 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:247: PINTARCOLOR
                {
                mPINTARCOLOR(); 


                }
                break;
            case 44 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:259: OBSTACLE
                {
                mOBSTACLE(); 


                }
                break;
            case 45 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:268: SENTIR
                {
                mSENTIR(); 


                }
                break;
            case 46 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:275: INFRA
                {
                mINFRA(); 


                }
                break;
            case 47 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:281: CHOCAR
                {
                mCHOCAR(); 


                }
                break;
            case 48 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:288: DISTANCIACOLOR
                {
                mDISTANCIACOLOR(); 


                }
                break;
            case 49 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:303: ORIENTACION
                {
                mORIENTACION(); 


                }
                break;
            case 50 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:315: MIRAR
                {
                mMIRAR(); 


                }
                break;
            case 51 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:321: GIRA
                {
                mGIRA(); 


                }
                break;
            case 52 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:326: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 53 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:332: ESTADOPINTAR
                {
                mESTADOPINTAR(); 


                }
                break;
            case 54 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:345: ID
                {
                mID(); 


                }
                break;
            case 55 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:348: INT
                {
                mINT(); 


                }
                break;
            case 56 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:352: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 57 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:360: STRING
                {
                mSTRING(); 


                }
                break;
            case 58 :
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:1:367: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\5\uffff\3\44\5\uffff\1\60\1\62\3\uffff\1\64\1\uffff\20\44\4\uffff"+
        "\1\44\1\123\5\44\6\uffff\3\44\1\137\7\44\1\150\16\44\1\172\1\173"+
        "\2\44\1\uffff\6\44\1\u0084\1\44\1\u0086\2\44\1\uffff\10\44\1\uffff"+
        "\6\44\1\u009b\12\44\2\uffff\2\44\1\u00a8\1\44\1\u009b\3\44\1\uffff"+
        "\1\44\1\uffff\3\44\1\u00b1\1\u00b2\1\u00b3\6\44\1\172\2\44\1\u00bc"+
        "\3\44\1\u00c0\1\uffff\2\44\1\u009b\2\44\1\u00c5\1\44\1\u009b\4\44"+
        "\1\uffff\2\u009b\6\44\3\uffff\1\u00d1\2\44\1\u00d4\1\u009b\1\u00d5"+
        "\2\44\1\uffff\1\u00d8\2\44\1\uffff\1\u00db\1\44\1\u00dd\1\44\1\uffff"+
        "\1\u009b\4\44\1\u00e6\1\u00e7\1\44\1\u00e9\2\44\1\uffff\2\44\2\uffff"+
        "\2\44\1\uffff\1\u00f0\1\44\1\uffff\1\u00f2\1\uffff\5\44\1\u009b"+
        "\2\44\2\uffff\1\44\1\uffff\3\44\1\u00fe\2\44\1\uffff\1\44\1\uffff"+
        "\1\u009b\4\44\1\u0106\1\u0107\2\44\1\u010a\1\u010b\1\uffff\1\44"+
        "\1\u009b\3\44\1\u009b\1\44\2\uffff\2\44\2\uffff\2\44\2\u009b\1\44"+
        "\1\u0116\4\44\1\uffff\1\u011b\1\44\1\u011d\1\44\1\uffff\1\44\1\uffff"+
        "\1\u009b\1\44\1\u0121\1\uffff";
    static final String DFA10_eofS =
        "\u0122\uffff";
    static final String DFA10_minS =
        "\1\11\4\uffff\1\146\1\154\1\145\5\uffff\2\75\3\uffff\1\52\1\uffff"+
        "\1\157\1\156\1\142\1\150\1\154\1\150\2\141\1\145\1\151\1\150\1\141"+
        "\2\151\1\145\1\160\4\uffff\1\146\1\60\1\157\1\141\1\157\1\162\1"+
        "\156\6\uffff\1\157\1\144\1\141\1\60\1\163\1\145\1\165\1\163\1\144"+
        "\2\151\1\60\1\163\1\162\1\156\1\154\1\141\1\156\1\157\1\141\1\162"+
        "\1\147\1\162\1\141\1\147\1\154\2\60\2\162\1\uffff\1\154\1\143\1"+
        "\145\1\167\1\151\1\164\1\60\1\142\1\60\1\156\1\145\1\uffff\1\164"+
        "\1\156\2\145\1\146\1\154\1\164\1\156\1\uffff\1\164\1\153\1\143\1"+
        "\163\1\162\1\144\1\60\1\164\1\143\1\156\1\141\1\145\1\141\1\145"+
        "\1\171\1\150\1\154\2\uffff\1\157\1\141\1\60\1\153\1\60\2\156\1\151"+
        "\1\uffff\1\163\1\uffff\1\143\1\156\1\141\3\60\1\146\1\150\1\165"+
        "\3\145\1\60\1\141\1\147\1\60\1\145\1\162\1\157\1\60\1\uffff\2\141"+
        "\1\60\1\162\1\156\1\60\1\156\1\60\1\164\1\157\1\142\1\162\1\uffff"+
        "\2\60\1\147\1\162\1\164\1\141\1\164\1\143\3\uffff\1\60\1\151\1\156"+
        "\3\60\1\156\1\162\1\uffff\1\60\1\156\1\143\1\uffff\1\60\1\162\1"+
        "\60\1\164\1\uffff\1\60\1\142\1\167\1\157\1\145\2\60\1\141\1\60\1"+
        "\141\1\154\1\uffff\1\154\1\143\2\uffff\1\143\1\141\1\uffff\1\60"+
        "\1\145\1\uffff\1\60\1\uffff\1\141\1\154\1\171\1\145\1\141\1\60\1"+
        "\164\1\144\2\uffff\1\143\1\uffff\1\143\2\145\1\60\1\151\1\171\1"+
        "\uffff\1\144\1\uffff\1\60\1\165\1\141\1\144\1\147\2\60\1\154\1\151"+
        "\2\60\1\uffff\1\141\1\60\2\145\1\156\1\60\1\145\2\uffff\1\145\1"+
        "\157\2\uffff\1\143\1\151\2\60\1\156\1\60\1\156\1\157\1\170\1\164"+
        "\1\uffff\1\60\1\154\1\60\1\141\1\uffff\1\157\1\uffff\1\60\1\162"+
        "\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\172\4\uffff\1\156\1\162\1\164\5\uffff\2\75\3\uffff\1\57\1\uffff"+
        "\1\157\1\166\2\162\1\156\1\162\1\157\1\165\1\145\1\151\1\171\1\151"+
        "\1\162\1\151\1\145\1\160\4\uffff\1\164\1\172\1\157\1\165\1\157\1"+
        "\162\1\156\6\uffff\1\164\1\144\1\141\1\172\1\163\1\145\1\165\1\163"+
        "\1\144\2\151\1\172\1\163\1\162\1\156\1\154\1\164\1\156\1\157\1\141"+
        "\1\162\1\147\1\162\1\145\1\147\1\154\2\172\2\162\1\uffff\1\154\1"+
        "\143\1\145\1\167\1\151\1\164\1\172\1\142\1\172\1\156\1\145\1\uffff"+
        "\1\164\1\156\2\145\1\167\2\164\1\156\1\uffff\1\164\1\153\1\143\1"+
        "\163\1\165\1\144\1\172\1\164\1\143\1\156\1\141\1\145\1\141\1\145"+
        "\1\171\1\150\1\154\2\uffff\1\157\1\141\1\172\1\153\1\172\2\156\1"+
        "\151\1\uffff\1\163\1\uffff\1\143\1\156\1\141\3\172\1\146\1\150\1"+
        "\165\3\145\1\172\1\141\1\147\1\172\1\145\1\162\1\157\1\172\1\uffff"+
        "\2\141\1\172\1\162\1\156\1\172\1\156\1\172\1\164\1\157\1\142\1\162"+
        "\1\uffff\2\172\1\147\1\162\1\164\1\141\1\164\1\143\3\uffff\1\172"+
        "\1\151\1\156\3\172\1\156\1\162\1\uffff\1\172\1\156\1\143\1\uffff"+
        "\1\172\1\162\1\172\1\164\1\uffff\1\172\1\162\1\167\1\157\1\145\2"+
        "\172\1\141\1\172\1\141\1\154\1\uffff\1\154\1\143\2\uffff\1\143\1"+
        "\141\1\uffff\1\172\1\145\1\uffff\1\172\1\uffff\1\141\1\154\1\171"+
        "\1\145\1\141\1\172\1\164\1\144\2\uffff\1\143\1\uffff\1\143\2\145"+
        "\1\172\1\151\1\171\1\uffff\1\144\1\uffff\1\172\1\165\1\141\1\144"+
        "\1\147\2\172\1\154\1\151\2\172\1\uffff\1\141\1\172\2\145\1\156\1"+
        "\172\1\145\2\uffff\1\145\1\157\2\uffff\1\143\1\151\2\172\1\156\1"+
        "\172\1\156\1\157\1\170\1\164\1\uffff\1\172\1\154\1\172\1\141\1\uffff"+
        "\1\157\1\uffff\1\172\1\162\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\10\1\11\1\12\1\13\1\14\2\uffff"+
        "\1\21\1\22\1\23\1\uffff\1\25\20\uffff\1\66\1\67\1\71\1\72\7\uffff"+
        "\1\16\1\15\1\20\1\17\1\70\1\24\36\uffff\1\31\13\uffff\1\30\10\uffff"+
        "\1\36\21\uffff\1\65\1\5\10\uffff\1\26\1\uffff\1\27\24\uffff\1\64"+
        "\14\uffff\1\6\10\uffff\1\32\1\45\1\33\10\uffff\1\40\3\uffff\1\43"+
        "\4\uffff\1\63\13\uffff\1\34\2\uffff\1\35\1\44\2\uffff\1\46\2\uffff"+
        "\1\53\1\uffff\1\62\10\uffff\1\7\1\55\1\uffff\1\50\6\uffff\1\42\1"+
        "\uffff\1\57\13\uffff\1\41\7\uffff\1\47\1\56\2\uffff\1\54\1\37\12"+
        "\uffff\1\52\4\uffff\1\61\1\uffff\1\51\3\uffff\1\60";
    static final String DFA10_specialS =
        "\u0122\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\14\1\46\2\uffff\1\23\1\1"+
            "\1\uffff\1\10\1\2\1\21\1\17\1\3\1\20\1\uffff\1\22\12\45\1\uffff"+
            "\1\4\1\15\1\13\1\16\2\uffff\32\44\1\11\1\uffff\1\12\1\uffff"+
            "\1\44\1\uffff\1\25\1\6\1\36\1\32\1\30\1\33\1\40\1\44\1\5\2\44"+
            "\1\41\1\37\1\24\1\26\1\35\1\44\1\34\1\7\1\27\1\43\1\44\1\31"+
            "\1\44\1\42\1\44",
            "",
            "",
            "",
            "",
            "\1\51\7\uffff\1\50",
            "\1\53\2\uffff\1\52\2\uffff\1\54",
            "\1\56\16\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "\1\63\4\uffff\1\63",
            "",
            "\1\65",
            "\1\66\7\uffff\1\67",
            "\1\71\17\uffff\1\70",
            "\1\72\11\uffff\1\73",
            "\1\74\1\uffff\1\75",
            "\1\76\11\uffff\1\77",
            "\1\102\7\uffff\1\101\5\uffff\1\100",
            "\1\104\23\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107\20\uffff\1\110",
            "\1\112\7\uffff\1\111",
            "\1\113\10\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\122\2\uffff\1\121\12\uffff\1\120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\124",
            "\1\125\23\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133\4\uffff\1\132",
            "\1\134",
            "\1\135",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\136\21\44",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\26\44\1\147\3\44",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\156\2\uffff\1\157\17\uffff\1\155",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\3\uffff\1\166",
            "\1\170",
            "\1\171",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0085",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008f\2\uffff\1\u008d\15\uffff\1\u008e",
            "\1\u0090\7\uffff\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0099\2\uffff\1\u0098",
            "\1\u009a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ba",
            "\1\u00bb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c3",
            "\1\u00c4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c6",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d2",
            "\1\u00d3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00dc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00de",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00df\1\u00e0\11\uffff\1\u00e2\4\uffff\1\u00e1",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f1",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0108",
            "\1\u0109",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u010c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0110",
            "",
            "",
            "\1\u0111",
            "\1\u0112",
            "",
            "",
            "\1\u0113",
            "\1\u0114",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0115",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u011c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0120",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | ENTER | BOOL | CARACTERS | LPAREN | LBRACK | RBRACK | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | INIROBOT | AVAN | RETRO | NOBSTACLE | PINTARCOLOR | OBSTACLE | SENTIR | INFRA | CHOCAR | DISTANCIACOLOR | ORIENTACION | MIRAR | GIRA | COLOR | ESTADOPINTAR | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}