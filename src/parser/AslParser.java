// $ANTLR 3.4 /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g 2014-05-07 22:25:33

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVAN", "BOOL", "BOOLEAN", "CARACTERS", "CHOCAR", "COLOR", "COMMENT", "DISTANCIACOLOR", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "ENTER", "EQUAL", "ESC_SEQ", "ESTADOPINTAR", "FALSE", "FUNC", "FUNCALL", "GE", "GIRA", "GT", "ID", "IF", "INFRA", "INIROBOT", "INT", "LBRACK", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LPAREN", "LT", "MINUS", "MIRAR", "MOD", "MUL", "NOBSTACLE", "NOT", "NOT_EQUAL", "OBSTACLE", "OR", "ORIENTACION", "PARAMS", "PINTARCOLOR", "PLUS", "PREF", "PVALUE", "RBRACK", "READ", "RETRO", "RETURN", "SENTIR", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "')'", "','", "';'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog163);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog166);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func205); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func208); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func210);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func212);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func214); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_params233);  
            stream_LPAREN.add(char_literal8);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==BOOL||LA2_0==CARACTERS||LA2_0==ENTER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params235);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,69,FOLLOW_69_in_params238);  
            stream_69.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 68:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist264);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==70) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,70,FOLLOW_70_in_paramlist267); 

            	    pushFollow(FOLLOW_param_in_paramlist270);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:1: param : ptype ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal15=null;
        AslParser.ptype_return ptype14 =null;


        AslTree id_tree=null;
        AslTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ptype=new RewriteRuleSubtreeStream(adaptor,"rule ptype");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:9: ( ptype ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:13: ptype ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            {
            pushFollow(FOLLOW_ptype_in_param303);
            ptype14=ptype();

            state._fsp--;

            stream_ptype.add(ptype14.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:19: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==68) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:20: '&' id= ID
                    {
                    char_literal15=(Token)match(input,68,FOLLOW_68_in_param306);  
                    stream_68.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param312);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 77:32: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:35: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:78:8: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param332);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:16: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:78:19: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class ptype_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ptype"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:1: ptype : tipus ^;
    public final AslParser.ptype_return ptype() throws RecognitionException {
        AslParser.ptype_return retval = new AslParser.ptype_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.tipus_return tipus16 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:7: ( tipus ^)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:9: tipus ^
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_tipus_in_ptype365);
            tipus16=tipus();

            state._fsp--;

            root_0 = (AslTree)adaptor.becomeRoot(tipus16.getTree(), root_0);

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ptype"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:84:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal18=null;
        AslParser.instruction_return instruction17 =null;

        AslParser.instruction_return instruction19 =null;


        AslTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:85:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:85:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions392);
            instruction17=instruction();

            state._fsp--;

            stream_instruction.add(instruction17.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:85:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==71) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:85:25: ';' instruction
            	    {
            	    char_literal18=(Token)match(input,71,FOLLOW_71_in_block_instructions395);  
            	    stream_71.add(char_literal18);


            	    pushFollow(FOLLOW_instruction_in_block_instructions397);
            	    instruction19=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 86:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:86:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:90:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;

        AslParser.special_instruction_return special_instruction27 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:91:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |)
            int alt6=9;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==LPAREN) ) {
                    alt6=4;
                }
                else if ( (LA6_1==EQUAL||LA6_1==LBRACK) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case AVAN:
            case CHOCAR:
            case DISTANCIACOLOR:
            case GIRA:
            case INFRA:
            case INIROBOT:
            case MIRAR:
            case NOBSTACLE:
            case OBSTACLE:
            case ORIENTACION:
            case PINTARCOLOR:
            case RETRO:
            case SENTIR:
                {
                alt6=8;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 71:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:91:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction446);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:92:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction468);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:93:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction488);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:94:14: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction509);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:95:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction530);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:96:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction547);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:97:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction572);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:98:11: special_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_special_instruction_in_instruction595);
                    special_instruction27=special_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, special_instruction27.getTree());

                    }
                    break;
                case 9 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:100:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class special_instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "special_instruction"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:102:1: special_instruction : ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors );
    public final AslParser.special_instruction_return special_instruction() throws RecognitionException {
        AslParser.special_instruction_return retval = new AslParser.special_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INIROBOT28=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token AVAN34=null;
        Token RETRO36=null;
        Token NOBSTACLE38=null;
        Token COLOR39=null;
        Token char_literal40=null;
        Token COLOR41=null;
        Token GIRA42=null;
        Token PINTARCOLOR44=null;
        Token ESTADOPINTAR45=null;
        Token OBSTACLE46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token COLOR55=null;
        Token char_literal56=null;
        Token COLOR57=null;
        AslParser.expr_return expr29 =null;

        AslParser.expr_return expr31 =null;

        AslParser.expr_return expr33 =null;

        AslParser.expr_return expr35 =null;

        AslParser.expr_return expr37 =null;

        AslParser.expr_return expr43 =null;

        AslParser.expr_return expr47 =null;

        AslParser.expr_return expr49 =null;

        AslParser.expr_return expr51 =null;

        AslParser.expr_return expr53 =null;

        AslParser.sensors_return sensors58 =null;


        AslTree INIROBOT28_tree=null;
        AslTree char_literal30_tree=null;
        AslTree char_literal32_tree=null;
        AslTree AVAN34_tree=null;
        AslTree RETRO36_tree=null;
        AslTree NOBSTACLE38_tree=null;
        AslTree COLOR39_tree=null;
        AslTree char_literal40_tree=null;
        AslTree COLOR41_tree=null;
        AslTree GIRA42_tree=null;
        AslTree PINTARCOLOR44_tree=null;
        AslTree ESTADOPINTAR45_tree=null;
        AslTree OBSTACLE46_tree=null;
        AslTree char_literal48_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal52_tree=null;
        AslTree char_literal54_tree=null;
        AslTree COLOR55_tree=null;
        AslTree char_literal56_tree=null;
        AslTree COLOR57_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:103:2: ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors )
            int alt8=8;
            switch ( input.LA(1) ) {
            case INIROBOT:
                {
                alt8=1;
                }
                break;
            case AVAN:
                {
                alt8=2;
                }
                break;
            case RETRO:
                {
                alt8=3;
                }
                break;
            case NOBSTACLE:
                {
                alt8=4;
                }
                break;
            case GIRA:
                {
                alt8=5;
                }
                break;
            case PINTARCOLOR:
                {
                alt8=6;
                }
                break;
            case OBSTACLE:
                {
                alt8=7;
                }
                break;
            case CHOCAR:
            case DISTANCIACOLOR:
            case INFRA:
            case MIRAR:
            case ORIENTACION:
            case SENTIR:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:103:4: INIROBOT ^ expr ',' ! expr ',' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INIROBOT28=(Token)match(input,INIROBOT,FOLLOW_INIROBOT_in_special_instruction643); 
                    INIROBOT28_tree = 
                    (AslTree)adaptor.create(INIROBOT28)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INIROBOT28_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction646);
                    expr29=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr29.getTree());

                    char_literal30=(Token)match(input,70,FOLLOW_70_in_special_instruction648); 

                    pushFollow(FOLLOW_expr_in_special_instruction651);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr31.getTree());

                    char_literal32=(Token)match(input,70,FOLLOW_70_in_special_instruction653); 

                    pushFollow(FOLLOW_expr_in_special_instruction656);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr33.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:104:4: AVAN ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    AVAN34=(Token)match(input,AVAN,FOLLOW_AVAN_in_special_instruction661); 
                    AVAN34_tree = 
                    (AslTree)adaptor.create(AVAN34)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(AVAN34_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction664);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr35.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:105:4: RETRO ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RETRO36=(Token)match(input,RETRO,FOLLOW_RETRO_in_special_instruction669); 
                    RETRO36_tree = 
                    (AslTree)adaptor.create(RETRO36)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RETRO36_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction672);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr37.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:106:4: NOBSTACLE ^ COLOR ( ',' ! COLOR )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    NOBSTACLE38=(Token)match(input,NOBSTACLE,FOLLOW_NOBSTACLE_in_special_instruction677); 
                    NOBSTACLE38_tree = 
                    (AslTree)adaptor.create(NOBSTACLE38)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOBSTACLE38_tree, root_0);


                    COLOR39=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction680); 
                    COLOR39_tree = 
                    (AslTree)adaptor.create(COLOR39)
                    ;
                    adaptor.addChild(root_0, COLOR39_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:106:21: ( ',' ! COLOR )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==70) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:106:22: ',' ! COLOR
                            {
                            char_literal40=(Token)match(input,70,FOLLOW_70_in_special_instruction683); 

                            COLOR41=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction686); 
                            COLOR41_tree = 
                            (AslTree)adaptor.create(COLOR41)
                            ;
                            adaptor.addChild(root_0, COLOR41_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:107:4: GIRA ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    GIRA42=(Token)match(input,GIRA,FOLLOW_GIRA_in_special_instruction693); 
                    GIRA42_tree = 
                    (AslTree)adaptor.create(GIRA42)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(GIRA42_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction696);
                    expr43=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr43.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:108:4: PINTARCOLOR ^ ESTADOPINTAR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PINTARCOLOR44=(Token)match(input,PINTARCOLOR,FOLLOW_PINTARCOLOR_in_special_instruction701); 
                    PINTARCOLOR44_tree = 
                    (AslTree)adaptor.create(PINTARCOLOR44)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PINTARCOLOR44_tree, root_0);


                    ESTADOPINTAR45=(Token)match(input,ESTADOPINTAR,FOLLOW_ESTADOPINTAR_in_special_instruction704); 
                    ESTADOPINTAR45_tree = 
                    (AslTree)adaptor.create(ESTADOPINTAR45)
                    ;
                    adaptor.addChild(root_0, ESTADOPINTAR45_tree);


                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:109:4: OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    OBSTACLE46=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_special_instruction709); 
                    OBSTACLE46_tree = 
                    (AslTree)adaptor.create(OBSTACLE46)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(OBSTACLE46_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction712);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    char_literal48=(Token)match(input,70,FOLLOW_70_in_special_instruction714); 

                    pushFollow(FOLLOW_expr_in_special_instruction717);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                    char_literal50=(Token)match(input,70,FOLLOW_70_in_special_instruction719); 

                    pushFollow(FOLLOW_expr_in_special_instruction722);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

                    char_literal52=(Token)match(input,70,FOLLOW_70_in_special_instruction724); 

                    pushFollow(FOLLOW_expr_in_special_instruction727);
                    expr53=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr53.getTree());

                    char_literal54=(Token)match(input,70,FOLLOW_70_in_special_instruction729); 

                    COLOR55=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction732); 
                    COLOR55_tree = 
                    (AslTree)adaptor.create(COLOR55)
                    ;
                    adaptor.addChild(root_0, COLOR55_tree);


                    char_literal56=(Token)match(input,70,FOLLOW_70_in_special_instruction734); 

                    COLOR57=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction737); 
                    COLOR57_tree = 
                    (AslTree)adaptor.create(COLOR57)
                    ;
                    adaptor.addChild(root_0, COLOR57_tree);


                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:110:4: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_special_instruction742);
                    sensors58=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors58.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "special_instruction"


    public static class sensors_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sensors"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:113:1: sensors : ( SENTIR ^| INFRA ^| CHOCAR ^| DISTANCIACOLOR ^ COLOR | ORIENTACION | MIRAR ^ expr );
    public final AslParser.sensors_return sensors() throws RecognitionException {
        AslParser.sensors_return retval = new AslParser.sensors_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SENTIR59=null;
        Token INFRA60=null;
        Token CHOCAR61=null;
        Token DISTANCIACOLOR62=null;
        Token COLOR63=null;
        Token ORIENTACION64=null;
        Token MIRAR65=null;
        AslParser.expr_return expr66 =null;


        AslTree SENTIR59_tree=null;
        AslTree INFRA60_tree=null;
        AslTree CHOCAR61_tree=null;
        AslTree DISTANCIACOLOR62_tree=null;
        AslTree COLOR63_tree=null;
        AslTree ORIENTACION64_tree=null;
        AslTree MIRAR65_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:114:2: ( SENTIR ^| INFRA ^| CHOCAR ^| DISTANCIACOLOR ^ COLOR | ORIENTACION | MIRAR ^ expr )
            int alt9=6;
            switch ( input.LA(1) ) {
            case SENTIR:
                {
                alt9=1;
                }
                break;
            case INFRA:
                {
                alt9=2;
                }
                break;
            case CHOCAR:
                {
                alt9=3;
                }
                break;
            case DISTANCIACOLOR:
                {
                alt9=4;
                }
                break;
            case ORIENTACION:
                {
                alt9=5;
                }
                break;
            case MIRAR:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:114:4: SENTIR ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SENTIR59=(Token)match(input,SENTIR,FOLLOW_SENTIR_in_sensors753); 
                    SENTIR59_tree = 
                    (AslTree)adaptor.create(SENTIR59)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SENTIR59_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:115:4: INFRA ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INFRA60=(Token)match(input,INFRA,FOLLOW_INFRA_in_sensors759); 
                    INFRA60_tree = 
                    (AslTree)adaptor.create(INFRA60)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INFRA60_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:116:4: CHOCAR ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CHOCAR61=(Token)match(input,CHOCAR,FOLLOW_CHOCAR_in_sensors765); 
                    CHOCAR61_tree = 
                    (AslTree)adaptor.create(CHOCAR61)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CHOCAR61_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:117:4: DISTANCIACOLOR ^ COLOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DISTANCIACOLOR62=(Token)match(input,DISTANCIACOLOR,FOLLOW_DISTANCIACOLOR_in_sensors771); 
                    DISTANCIACOLOR62_tree = 
                    (AslTree)adaptor.create(DISTANCIACOLOR62)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DISTANCIACOLOR62_tree, root_0);


                    COLOR63=(Token)match(input,COLOR,FOLLOW_COLOR_in_sensors774); 
                    COLOR63_tree = 
                    (AslTree)adaptor.create(COLOR63)
                    ;
                    adaptor.addChild(root_0, COLOR63_tree);


                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:118:4: ORIENTACION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ORIENTACION64=(Token)match(input,ORIENTACION,FOLLOW_ORIENTACION_in_sensors779); 
                    ORIENTACION64_tree = 
                    (AslTree)adaptor.create(ORIENTACION64)
                    ;
                    adaptor.addChild(root_0, ORIENTACION64_tree);


                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:119:4: MIRAR ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MIRAR65=(Token)match(input,MIRAR,FOLLOW_MIRAR_in_sensors784); 
                    MIRAR65_tree = 
                    (AslTree)adaptor.create(MIRAR65)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MIRAR65_tree, root_0);


                    pushFollow(FOLLOW_expr_in_sensors788);
                    expr66=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sensors"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:123:1: assign : idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.idtypes_return idtypes67 =null;

        AslParser.expr_return expr68 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_idtypes=new RewriteRuleSubtreeStream(adaptor,"rule idtypes");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:123:8: ( idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:123:10: idtypes eq= EQUAL expr
            {
            pushFollow(FOLLOW_idtypes_in_assign799);
            idtypes67=idtypes();

            state._fsp--;

            stream_idtypes.add(idtypes67.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign803);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign805);
            expr68=expr();

            state._fsp--;

            stream_expr.add(expr68.getTree());

            // AST REWRITE
            // elements: expr, expr, idtypes
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 123:32: -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:123:35: ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_idtypes.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:123:67: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class idtypes_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "idtypes"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:127:1: idtypes : ID ( LBRACK ^ expr RBRACK !)? ;
    public final AslParser.idtypes_return idtypes() throws RecognitionException {
        AslParser.idtypes_return retval = new AslParser.idtypes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID69=null;
        Token LBRACK70=null;
        Token RBRACK72=null;
        AslParser.expr_return expr71 =null;


        AslTree ID69_tree=null;
        AslTree LBRACK70_tree=null;
        AslTree RBRACK72_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:127:9: ( ID ( LBRACK ^ expr RBRACK !)? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:127:11: ID ( LBRACK ^ expr RBRACK !)?
            {
            root_0 = (AslTree)adaptor.nil();


            ID69=(Token)match(input,ID,FOLLOW_ID_in_idtypes845); 
            ID69_tree = 
            (AslTree)adaptor.create(ID69)
            ;
            adaptor.addChild(root_0, ID69_tree);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:127:14: ( LBRACK ^ expr RBRACK !)?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LBRACK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:127:15: LBRACK ^ expr RBRACK !
                    {
                    LBRACK70=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_idtypes848); 
                    LBRACK70_tree = 
                    (AslTree)adaptor.create(LBRACK70)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LBRACK70_tree, root_0);


                    pushFollow(FOLLOW_expr_in_idtypes851);
                    expr71=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr71.getTree());

                    RBRACK72=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_idtypes853); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idtypes"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:131:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF73=null;
        Token THEN75=null;
        Token ELSE77=null;
        Token ENDIF79=null;
        AslParser.expr_return expr74 =null;

        AslParser.block_instructions_return block_instructions76 =null;

        AslParser.block_instructions_return block_instructions78 =null;


        AslTree IF73_tree=null;
        AslTree THEN75_tree=null;
        AslTree ELSE77_tree=null;
        AslTree ENDIF79_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:131:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:131:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF73=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt875); 
            IF73_tree = 
            (AslTree)adaptor.create(IF73)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF73_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt878);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            THEN75=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt880); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt883);
            block_instructions76=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions76.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:131:46: ( ELSE ! block_instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:131:47: ELSE ! block_instructions
                    {
                    ELSE77=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt886); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt889);
                    block_instructions78=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions78.getTree());

                    }
                    break;

            }


            ENDIF79=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt893); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:135:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE80=null;
        Token DO82=null;
        Token ENDWHILE84=null;
        AslParser.expr_return expr81 =null;

        AslParser.block_instructions_return block_instructions83 =null;


        AslTree WHILE80_tree=null;
        AslTree DO82_tree=null;
        AslTree ENDWHILE84_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:135:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:135:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE80=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt916); 
            WHILE80_tree = 
            (AslTree)adaptor.create(WHILE80)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE80_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt919);
            expr81=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr81.getTree());

            DO82=(Token)match(input,DO,FOLLOW_DO_in_while_stmt921); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt924);
            block_instructions83=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions83.getTree());

            ENDWHILE84=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt926); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:139:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN85=null;
        AslParser.expr_return expr86 =null;


        AslTree RETURN85_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:139:13: ( RETURN ^ ( expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:139:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN85=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt949); 
            RETURN85_tree = 
            (AslTree)adaptor.create(RETURN85)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN85_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:139:23: ( expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CHOCAR||LA12_0==DISTANCIACOLOR||LA12_0==FALSE||LA12_0==ID||LA12_0==INFRA||LA12_0==INT||LA12_0==LPAREN||(LA12_0 >= MINUS && LA12_0 <= MIRAR)||LA12_0==NOT||LA12_0==ORIENTACION||LA12_0==PLUS||LA12_0==SENTIR||LA12_0==TRUE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:139:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt952);
                    expr86=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr86.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:143:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ87=null;
        Token ID88=null;

        AslTree READ87_tree=null;
        AslTree ID88_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:143:6: ( READ ^ ID )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:143:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ87=(Token)match(input,READ,FOLLOW_READ_in_read971); 
            READ87_tree = 
            (AslTree)adaptor.create(READ87)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ87_tree, root_0);


            ID88=(Token)match(input,ID,FOLLOW_ID_in_read974); 
            ID88_tree = 
            (AslTree)adaptor.create(ID88)
            ;
            adaptor.addChild(root_0, ID88_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE89=null;
        Token STRING91=null;
        AslParser.expr_return expr90 =null;


        AslTree WRITE89_tree=null;
        AslTree STRING91_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:7: ( WRITE ^ ( expr | STRING ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE89=(Token)match(input,WRITE,FOLLOW_WRITE_in_write994); 
            WRITE89_tree = 
            (AslTree)adaptor.create(WRITE89)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE89_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:18: ( expr | STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==CHOCAR||LA13_0==DISTANCIACOLOR||LA13_0==FALSE||LA13_0==ID||LA13_0==INFRA||LA13_0==INT||LA13_0==LPAREN||(LA13_0 >= MINUS && LA13_0 <= MIRAR)||LA13_0==NOT||LA13_0==ORIENTACION||LA13_0==PLUS||LA13_0==SENTIR||LA13_0==TRUE) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write998);
                    expr90=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr90.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:147:26: STRING
                    {
                    STRING91=(Token)match(input,STRING,FOLLOW_STRING_in_write1002); 
                    STRING91_tree = 
                    (AslTree)adaptor.create(STRING91)
                    ;
                    adaptor.addChild(root_0, STRING91_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:151:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR93=null;
        AslParser.boolterm_return boolterm92 =null;

        AslParser.boolterm_return boolterm94 =null;


        AslTree OR93_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:151:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:151:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1027);
            boolterm92=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm92.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:151:22: ( OR ^ boolterm )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:151:23: OR ^ boolterm
            	    {
            	    OR93=(Token)match(input,OR,FOLLOW_OR_in_expr1030); 
            	    OR93_tree = 
            	    (AslTree)adaptor.create(OR93)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR93_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1033);
            	    boolterm94=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm94.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:154:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND96=null;
        AslParser.boolfact_return boolfact95 =null;

        AslParser.boolfact_return boolfact97 =null;


        AslTree AND96_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:154:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:154:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1053);
            boolfact95=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact95.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:154:22: ( AND ^ boolfact )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:154:23: AND ^ boolfact
            	    {
            	    AND96=(Token)match(input,AND,FOLLOW_AND_in_boolterm1056); 
            	    AND96_tree = 
            	    (AslTree)adaptor.create(AND96)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND96_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1059);
            	    boolfact97=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact97.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL99=null;
        Token NOT_EQUAL100=null;
        Token LT101=null;
        Token LE102=null;
        Token GT103=null;
        Token GE104=null;
        AslParser.num_expr_return num_expr98 =null;

        AslParser.num_expr_return num_expr105 =null;


        AslTree EQUAL99_tree=null;
        AslTree NOT_EQUAL100_tree=null;
        AslTree LT101_tree=null;
        AslTree LE102_tree=null;
        AslTree GT103_tree=null;
        AslTree GE104_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1079);
            num_expr98=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr98.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt17=1;
                    }
                    break;
                case NOT_EQUAL:
                    {
                    alt17=1;
                    }
                    break;
                case LT:
                    {
                    alt17=1;
                    }
                    break;
                case LE:
                    {
                    alt17=1;
                    }
                    break;
                case GT:
                    {
                    alt17=1;
                    }
                    break;
                case GE:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt16=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt16=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt16=2;
                        }
                        break;
                    case LT:
                        {
                        alt16=3;
                        }
                        break;
                    case LE:
                        {
                        alt16=4;
                        }
                        break;
                    case GT:
                        {
                        alt16=5;
                        }
                        break;
                    case GE:
                        {
                        alt16=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;

                    }

                    switch (alt16) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:24: EQUAL ^
                            {
                            EQUAL99=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1083); 
                            EQUAL99_tree = 
                            (AslTree)adaptor.create(EQUAL99)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL99_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL100=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1088); 
                            NOT_EQUAL100_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL100)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL100_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:46: LT ^
                            {
                            LT101=(Token)match(input,LT,FOLLOW_LT_in_boolfact1093); 
                            LT101_tree = 
                            (AslTree)adaptor.create(LT101)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT101_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:52: LE ^
                            {
                            LE102=(Token)match(input,LE,FOLLOW_LE_in_boolfact1098); 
                            LE102_tree = 
                            (AslTree)adaptor.create(LE102)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE102_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:58: GT ^
                            {
                            GT103=(Token)match(input,GT,FOLLOW_GT_in_boolfact1103); 
                            GT103_tree = 
                            (AslTree)adaptor.create(GT103)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT103_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:157:64: GE ^
                            {
                            GE104=(Token)match(input,GE,FOLLOW_GE_in_boolfact1108); 
                            GE104_tree = 
                            (AslTree)adaptor.create(GE104)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE104_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1112);
                    num_expr105=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr105.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS107=null;
        Token MINUS108=null;
        AslParser.term_return term106 =null;

        AslParser.term_return term109 =null;


        AslTree PLUS107_tree=null;
        AslTree MINUS108_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1132);
            term106=term();

            state._fsp--;

            adaptor.addChild(root_0, term106.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:18: ( ( PLUS ^| MINUS ^) term )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==PLUS) ) {
                    alt19=1;
                }
                else if ( (LA19_0==MINUS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:20: ( PLUS ^| MINUS ^)
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==PLUS) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==MINUS) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:21: PLUS ^
            	            {
            	            PLUS107=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1137); 
            	            PLUS107_tree = 
            	            (AslTree)adaptor.create(PLUS107)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS107_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:160:29: MINUS ^
            	            {
            	            MINUS108=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1142); 
            	            MINUS108_tree = 
            	            (AslTree)adaptor.create(MINUS108)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS108_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1146);
            	    term109=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term109.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL111=null;
        Token DIV112=null;
        Token MOD113=null;
        AslParser.factor_return factor110 =null;

        AslParser.factor_return factor114 =null;


        AslTree MUL111_tree=null;
        AslTree DIV112_tree=null;
        AslTree MOD113_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1170);
            factor110=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor110.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt21=1;
                    }
                    break;
                case DIV:
                    {
                    alt21=1;
                    }
                    break;
                case MOD:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt20=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:23: MUL ^
            	            {
            	            MUL111=(Token)match(input,MUL,FOLLOW_MUL_in_term1175); 
            	            MUL111_tree = 
            	            (AslTree)adaptor.create(MUL111)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL111_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:30: DIV ^
            	            {
            	            DIV112=(Token)match(input,DIV,FOLLOW_DIV_in_term1180); 
            	            DIV112_tree = 
            	            (AslTree)adaptor.create(DIV112)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV112_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:163:37: MOD ^
            	            {
            	            MOD113=(Token)match(input,MOD,FOLLOW_MOD_in_term1185); 
            	            MOD113_tree = 
            	            (AslTree)adaptor.create(MOD113)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD113_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1189);
            	    factor114=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor114.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT115=null;
        Token PLUS116=null;
        Token MINUS117=null;
        AslParser.atom_return atom118 =null;


        AslTree NOT115_tree=null;
        AslTree PLUS116_tree=null;
        AslTree MINUS117_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt22=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt22=1;
                    }
                    break;
                case PLUS:
                    {
                    alt22=2;
                    }
                    break;
                case MINUS:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:14: NOT ^
                    {
                    NOT115=(Token)match(input,NOT,FOLLOW_NOT_in_factor1212); 
                    NOT115_tree = 
                    (AslTree)adaptor.create(NOT115)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT115_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:21: PLUS ^
                    {
                    PLUS116=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1217); 
                    PLUS116_tree = 
                    (AslTree)adaptor.create(PLUS116)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS116_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:166:29: MINUS ^
                    {
                    MINUS117=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1222); 
                    MINUS117_tree = 
                    (AslTree)adaptor.create(MINUS117)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS117_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1227);
            atom118=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom118.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:172:1: atom : ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID119=null;
        Token LBRACK120=null;
        Token RBRACK122=null;
        Token INT123=null;
        Token LPAREN125=null;
        Token char_literal127=null;
        AslParser.expr_return expr121 =null;

        AslParser.funcall_return funcall124 =null;

        AslParser.expr_return expr126 =null;

        AslParser.sensors_return sensors128 =null;


        AslTree b_tree=null;
        AslTree ID119_tree=null;
        AslTree LBRACK120_tree=null;
        AslTree RBRACK122_tree=null;
        AslTree INT123_tree=null;
        AslTree LPAREN125_tree=null;
        AslTree char_literal127_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:172:9: ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors )
            int alt25=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
                    alt25=4;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= ENDWHILE)||LA25_1==EQUAL||LA25_1==GE||LA25_1==GT||(LA25_1 >= LBRACK && LA25_1 <= LE)||(LA25_1 >= LT && LA25_1 <= MINUS)||(LA25_1 >= MOD && LA25_1 <= MUL)||LA25_1==NOT_EQUAL||LA25_1==OR||LA25_1==PLUS||LA25_1==RBRACK||LA25_1==THEN||(LA25_1 >= 69 && LA25_1 <= 71)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt25=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt25=3;
                }
                break;
            case LPAREN:
                {
                alt25=5;
                }
                break;
            case CHOCAR:
            case DISTANCIACOLOR:
            case INFRA:
            case MIRAR:
            case ORIENTACION:
            case SENTIR:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:172:13: ID ( LBRACK ^ expr RBRACK !)?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID119=(Token)match(input,ID,FOLLOW_ID_in_atom1252); 
                    ID119_tree = 
                    (AslTree)adaptor.create(ID119)
                    ;
                    adaptor.addChild(root_0, ID119_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:172:16: ( LBRACK ^ expr RBRACK !)?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==LBRACK) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:172:17: LBRACK ^ expr RBRACK !
                            {
                            LBRACK120=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_atom1255); 
                            LBRACK120_tree = 
                            (AslTree)adaptor.create(LBRACK120)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LBRACK120_tree, root_0);


                            pushFollow(FOLLOW_expr_in_atom1258);
                            expr121=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr121.getTree());

                            RBRACK122=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_atom1260); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:173:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT123=(Token)match(input,INT,FOLLOW_INT_in_atom1277); 
                    INT123_tree = 
                    (AslTree)adaptor.create(INT123)
                    ;
                    adaptor.addChild(root_0, INT123_tree);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==TRUE) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==FALSE) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1294);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1300);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 174:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:175:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1323);
                    funcall124=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall124.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:13: LPAREN ^ expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1337); 
                    LPAREN125_tree = 
                    (AslTree)adaptor.create(LPAREN125)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LPAREN125_tree, root_0);


                    pushFollow(FOLLOW_expr_in_atom1340);
                    expr126=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr126.getTree());

                    char_literal127=(Token)match(input,69,FOLLOW_69_in_atom1342); 

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:177:13: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_atom1357);
                    sensors128=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors128.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        AslParser.expr_list_return expr_list131 =null;


        AslTree ID129_tree=null;
        AslTree char_literal130_tree=null;
        AslTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:12: ID '(' ( expr_list )? ')'
            {
            ID129=(Token)match(input,ID,FOLLOW_ID_in_funcall1376);  
            stream_ID.add(ID129);


            char_literal130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcall1378);  
            stream_LPAREN.add(char_literal130);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:19: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CHOCAR||LA26_0==DISTANCIACOLOR||LA26_0==FALSE||LA26_0==ID||LA26_0==INFRA||LA26_0==INT||LA26_0==LPAREN||(LA26_0 >= MINUS && LA26_0 <= MIRAR)||LA26_0==NOT||LA26_0==ORIENTACION||LA26_0==PLUS||LA26_0==SENTIR||LA26_0==TRUE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:19: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1380);
                    expr_list131=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list131.getTree());

                    }
                    break;

            }


            char_literal132=(Token)match(input,69,FOLLOW_69_in_funcall1383);  
            stream_69.add(char_literal132);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 181:34: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:37: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:50: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:181:60: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:185:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal134=null;
        AslParser.expr_return expr133 =null;

        AslParser.expr_return expr135 =null;


        AslTree char_literal134_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:185:10: ( expr ( ',' ! expr )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:185:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1419);
            expr133=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr133.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:185:17: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==70) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:185:18: ',' ! expr
            	    {
            	    char_literal134=(Token)match(input,70,FOLLOW_70_in_expr_list1422); 

            	    pushFollow(FOLLOW_expr_in_expr_list1425);
            	    expr135=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr135.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class tipus_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipus"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:1: tipus : ( ENTER | BOOL | CARACTERS );
    public final AslParser.tipus_return tipus() throws RecognitionException {
        AslParser.tipus_return retval = new AslParser.tipus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set136=null;

        AslTree set136_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:6: ( ENTER | BOOL | CARACTERS )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set136=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CARACTERS||input.LA(1)==ENTER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set136)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipus"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_func208 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_params_in_func210 = new BitSet(new long[]{0x3C2A4807A0004880L,0x0000000000000086L});
    public static final BitSet FOLLOW_block_instructions_in_func212 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_params233 = new BitSet(new long[]{0x0000000000200500L,0x0000000000000020L});
    public static final BitSet FOLLOW_paramlist_in_params235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_params238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_paramlist267 = new BitSet(new long[]{0x0000000000200500L});
    public static final BitSet FOLLOW_param_in_paramlist270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ptype_in_param303 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_param306 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_param312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipus_in_ptype365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_block_instructions395 = new BitSet(new long[]{0x3C2A4807A0004880L,0x0000000000000086L});
    public static final BitSet FOLLOW_instruction_in_block_instructions397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assign_in_instruction446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_special_instruction_in_instruction595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIROBOT_in_special_instruction643 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction648 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction653 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVAN_in_special_instruction661 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETRO_in_special_instruction669 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOBSTACLE_in_special_instruction677 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction683 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GIRA_in_special_instruction693 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PINTARCOLOR_in_special_instruction701 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ESTADOPINTAR_in_special_instruction704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_special_instruction709 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction714 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction719 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction724 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_special_instruction727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction729 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_special_instruction734 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_special_instruction742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENTIR_in_sensors753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INFRA_in_sensors759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOCAR_in_sensors765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCIACOLOR_in_sensors771 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COLOR_in_sensors774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTACION_in_sensors779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIRAR_in_sensors784 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_sensors788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idtypes_in_assign799 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assign803 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_assign805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idtypes845 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LBRACK_in_idtypes848 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_idtypes851 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_idtypes853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt875 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_ite_stmt878 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt880 = new BitSet(new long[]{0x3C2A4807A0004880L,0x0000000000000086L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt883 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt886 = new BitSet(new long[]{0x3C2A4807A0004880L,0x0000000000000086L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt889 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt916 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_while_stmt919 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DO_in_while_stmt921 = new BitSet(new long[]{0x3C2A4807A0004880L,0x0000000000000086L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt924 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt949 = new BitSet(new long[]{0x20488D0A82004802L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_return_stmt952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read971 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ID_in_read974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write994 = new BitSet(new long[]{0x60488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_write998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1027 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1030 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolterm_in_expr1033 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1053 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1056 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1059 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1079 = new BitSet(new long[]{0x0001022050400002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1083 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1088 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LT_in_boolfact1093 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_LE_in_boolfact1098 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GT_in_boolfact1103 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_GE_in_boolfact1108 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1132 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1137 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1142 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_term_in_num_expr1146 = new BitSet(new long[]{0x0040040000000002L});
    public static final BitSet FOLLOW_factor_in_term1170 = new BitSet(new long[]{0x0000300000008002L});
    public static final BitSet FOLLOW_MUL_in_term1175 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIV_in_term1180 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MOD_in_term1185 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_factor_in_term1189 = new BitSet(new long[]{0x0000300000008002L});
    public static final BitSet FOLLOW_NOT_in_factor1212 = new BitSet(new long[]{0x2008090A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUS_in_factor1217 = new BitSet(new long[]{0x2008090A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_factor1222 = new BitSet(new long[]{0x2008090A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_atom_in_factor1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1252 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom1255 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1258 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_atom1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1337 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_atom1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1376 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcall1378 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000021L});
    public static final BitSet FOLLOW_expr_list_in_funcall1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_funcall1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_expr_list1422 = new BitSet(new long[]{0x20488D0A82004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_expr_list1425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});

}