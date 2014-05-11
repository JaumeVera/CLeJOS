// $ANTLR 3.4 /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g 2014-05-11 21:27:29

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "AVAN", "BOOL", "BOOLEAN", "BUIT", "CARACTERS", "CHOCAR", "COLOR", "COMMENT", "DISTANCIACOLOR", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "ENTER", "EQUAL", "ESC_SEQ", "ESTADOPINTAR", "FALSE", "FUNC", "FUNCALL", "GE", "GIRA", "GT", "ID", "IF", "INFRA", "INIROBOT", "INT", "LBRACK", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LPAREN", "LT", "MINUS", "MIRAR", "MOD", "MUL", "NOBSTACLE", "NOT", "NOT_EQUAL", "OBSTACLE", "OR", "ORIENTACION", "PARAMS", "PINTARCOLOR", "PLUS", "PREF", "PVALUE", "RBRACK", "READ", "RETRO", "RETURN", "SENTIR", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int AVAN=7;
    public static final int BOOL=8;
    public static final int BOOLEAN=9;
    public static final int BUIT=10;
    public static final int CARACTERS=11;
    public static final int CHOCAR=12;
    public static final int COLOR=13;
    public static final int COMMENT=14;
    public static final int DISTANCIACOLOR=15;
    public static final int DIV=16;
    public static final int DO=17;
    public static final int ELSE=18;
    public static final int ENDFUNC=19;
    public static final int ENDIF=20;
    public static final int ENDWHILE=21;
    public static final int ENTER=22;
    public static final int EQUAL=23;
    public static final int ESC_SEQ=24;
    public static final int ESTADOPINTAR=25;
    public static final int FALSE=26;
    public static final int FUNC=27;
    public static final int FUNCALL=28;
    public static final int GE=29;
    public static final int GIRA=30;
    public static final int GT=31;
    public static final int ID=32;
    public static final int IF=33;
    public static final int INFRA=34;
    public static final int INIROBOT=35;
    public static final int INT=36;
    public static final int LBRACK=37;
    public static final int LE=38;
    public static final int LIST_FUNCTIONS=39;
    public static final int LIST_INSTR=40;
    public static final int LPAREN=41;
    public static final int LT=42;
    public static final int MINUS=43;
    public static final int MIRAR=44;
    public static final int MOD=45;
    public static final int MUL=46;
    public static final int NOBSTACLE=47;
    public static final int NOT=48;
    public static final int NOT_EQUAL=49;
    public static final int OBSTACLE=50;
    public static final int OR=51;
    public static final int ORIENTACION=52;
    public static final int PARAMS=53;
    public static final int PINTARCOLOR=54;
    public static final int PLUS=55;
    public static final int PREF=56;
    public static final int PVALUE=57;
    public static final int RBRACK=58;
    public static final int READ=59;
    public static final int RETRO=60;
    public static final int RETURN=61;
    public static final int SENTIR=62;
    public static final int STRING=63;
    public static final int THEN=64;
    public static final int TRUE=65;
    public static final int WHILE=66;
    public static final int WRITE=67;
    public static final int WS=68;

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:1: func : FUNC ^ ftype ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID5=null;
        Token ENDFUNC8=null;
        AslParser.ftype_return ftype4 =null;

        AslParser.params_return params6 =null;

        AslParser.block_instructions_return block_instructions7 =null;


        AslTree FUNC3_tree=null;
        AslTree ID5_tree=null;
        AslTree ENDFUNC8_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:6: ( FUNC ^ ftype ID params block_instructions ENDFUNC !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:64:8: FUNC ^ ftype ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func205); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            pushFollow(FOLLOW_ftype_in_func208);
            ftype4=ftype();

            state._fsp--;

            adaptor.addChild(root_0, ftype4.getTree());

            ID5=(Token)match(input,ID,FOLLOW_ID_in_func210); 
            ID5_tree = 
            (AslTree)adaptor.create(ID5)
            ;
            adaptor.addChild(root_0, ID5_tree);


            pushFollow(FOLLOW_params_in_func212);
            params6=params();

            state._fsp--;

            adaptor.addChild(root_0, params6.getTree());

            pushFollow(FOLLOW_block_instructions_in_func214);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            ENDFUNC8=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func216); 

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

        Token char_literal9=null;
        Token char_literal11=null;
        AslParser.paramlist_return paramlist10 =null;


        AslTree char_literal9_tree=null;
        AslTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_params235);  
            stream_LPAREN.add(char_literal9);


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
                    pushFollow(FOLLOW_paramlist_in_params237);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,70,FOLLOW_70_in_params240);  
            stream_70.add(char_literal11);


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

        Token char_literal13=null;
        AslParser.param_return param12 =null;

        AslParser.param_return param14 =null;


        AslTree char_literal13_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist266);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==71) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,71,FOLLOW_71_in_paramlist269); 

            	    pushFollow(FOLLOW_param_in_paramlist272);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:1: param : ptype ( '&' id= ID -> ptype ^( PREF[$id,$id.text] ) |id= ID -> ptype ^( PVALUE[$id,$id.text] ) ) ;
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal16=null;
        AslParser.ptype_return ptype15 =null;


        AslTree id_tree=null;
        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ptype=new RewriteRuleSubtreeStream(adaptor,"rule ptype");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:9: ( ptype ( '&' id= ID -> ptype ^( PREF[$id,$id.text] ) |id= ID -> ptype ^( PVALUE[$id,$id.text] ) ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:13: ptype ( '&' id= ID -> ptype ^( PREF[$id,$id.text] ) |id= ID -> ptype ^( PVALUE[$id,$id.text] ) )
            {
            pushFollow(FOLLOW_ptype_in_param305);
            ptype15=ptype();

            state._fsp--;

            stream_ptype.add(ptype15.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:19: ( '&' id= ID -> ptype ^( PREF[$id,$id.text] ) |id= ID -> ptype ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==69) ) {
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
                    char_literal16=(Token)match(input,69,FOLLOW_69_in_param308);  
                    stream_69.add(char_literal16);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param314);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: ptype
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 77:32: -> ptype ^( PREF[$id,$id.text] )
                    {
                        adaptor.addChild(root_0, stream_ptype.nextTree());

                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:77:41: ^( PREF[$id,$id.text] )
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
                    id=(Token)match(input,ID,FOLLOW_ID_in_param336);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: ptype
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:16: -> ptype ^( PVALUE[$id,$id.text] )
                    {
                        adaptor.addChild(root_0, stream_ptype.nextTree());

                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:78:25: ^( PVALUE[$id,$id.text] )
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


    public static class ftype_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftype"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:1: ftype : ftipus ^;
    public final AslParser.ftype_return ftype() throws RecognitionException {
        AslParser.ftype_return retval = new AslParser.ftype_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.ftipus_return ftipus17 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:7: ( ftipus ^)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:81:9: ftipus ^
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_ftipus_in_ftype363);
            ftipus17=ftipus();

            state._fsp--;

            root_0 = (AslTree)adaptor.becomeRoot(ftipus17.getTree(), root_0);

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
    // $ANTLR end "ftype"


    public static class ptype_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ptype"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:83:1: ptype : tipus ^;
    public final AslParser.ptype_return ptype() throws RecognitionException {
        AslParser.ptype_return retval = new AslParser.ptype_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.tipus_return tipus18 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:83:7: ( tipus ^)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:83:9: tipus ^
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_tipus_in_ptype380);
            tipus18=tipus();

            state._fsp--;

            root_0 = (AslTree)adaptor.becomeRoot(tipus18.getTree(), root_0);

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:86:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal20=null;
        AslParser.instruction_return instruction19 =null;

        AslParser.instruction_return instruction21 =null;


        AslTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:87:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:87:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions407);
            instruction19=instruction();

            state._fsp--;

            stream_instruction.add(instruction19.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:87:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==72) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:87:25: ';' instruction
            	    {
            	    char_literal20=(Token)match(input,72,FOLLOW_72_in_block_instructions410);  
            	    stream_72.add(char_literal20);


            	    pushFollow(FOLLOW_instruction_in_block_instructions412);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

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
            // 88:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:88:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign22 =null;

        AslParser.ite_stmt_return ite_stmt23 =null;

        AslParser.while_stmt_return while_stmt24 =null;

        AslParser.funcall_return funcall25 =null;

        AslParser.return_stmt_return return_stmt26 =null;

        AslParser.read_return read27 =null;

        AslParser.write_return write28 =null;

        AslParser.special_instruction_return special_instruction29 =null;



        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write | special_instruction |)
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
            case 72:
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction461);
                    assign22=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction483);
                    ite_stmt23=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt23.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction503);
                    while_stmt24=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt24.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:96:14: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction524);
                    funcall25=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall25.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction545);
                    return_stmt26=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt26.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction562);
                    read27=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read27.getTree());

                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:99:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction587);
                    write28=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write28.getTree());

                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:100:11: special_instruction
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_special_instruction_in_instruction610);
                    special_instruction29=special_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, special_instruction29.getTree());

                    }
                    break;
                case 9 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:102:9: 
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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:104:1: special_instruction : ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors );
    public final AslParser.special_instruction_return special_instruction() throws RecognitionException {
        AslParser.special_instruction_return retval = new AslParser.special_instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token INIROBOT30=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token AVAN36=null;
        Token RETRO38=null;
        Token NOBSTACLE40=null;
        Token COLOR41=null;
        Token char_literal42=null;
        Token COLOR43=null;
        Token GIRA44=null;
        Token PINTARCOLOR46=null;
        Token ESTADOPINTAR47=null;
        Token OBSTACLE48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        Token char_literal56=null;
        Token COLOR57=null;
        Token char_literal58=null;
        Token COLOR59=null;
        AslParser.expr_return expr31 =null;

        AslParser.expr_return expr33 =null;

        AslParser.expr_return expr35 =null;

        AslParser.expr_return expr37 =null;

        AslParser.expr_return expr39 =null;

        AslParser.expr_return expr45 =null;

        AslParser.expr_return expr49 =null;

        AslParser.expr_return expr51 =null;

        AslParser.expr_return expr53 =null;

        AslParser.expr_return expr55 =null;

        AslParser.sensors_return sensors60 =null;


        AslTree INIROBOT30_tree=null;
        AslTree char_literal32_tree=null;
        AslTree char_literal34_tree=null;
        AslTree AVAN36_tree=null;
        AslTree RETRO38_tree=null;
        AslTree NOBSTACLE40_tree=null;
        AslTree COLOR41_tree=null;
        AslTree char_literal42_tree=null;
        AslTree COLOR43_tree=null;
        AslTree GIRA44_tree=null;
        AslTree PINTARCOLOR46_tree=null;
        AslTree ESTADOPINTAR47_tree=null;
        AslTree OBSTACLE48_tree=null;
        AslTree char_literal50_tree=null;
        AslTree char_literal52_tree=null;
        AslTree char_literal54_tree=null;
        AslTree char_literal56_tree=null;
        AslTree COLOR57_tree=null;
        AslTree char_literal58_tree=null;
        AslTree COLOR59_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:105:2: ( INIROBOT ^ expr ',' ! expr ',' ! expr | AVAN ^ expr | RETRO ^ expr | NOBSTACLE ^ COLOR ( ',' ! COLOR )? | GIRA ^ expr | PINTARCOLOR ^ ESTADOPINTAR | OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR | sensors )
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:105:4: INIROBOT ^ expr ',' ! expr ',' ! expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INIROBOT30=(Token)match(input,INIROBOT,FOLLOW_INIROBOT_in_special_instruction658); 
                    INIROBOT30_tree = 
                    (AslTree)adaptor.create(INIROBOT30)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INIROBOT30_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction661);
                    expr31=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr31.getTree());

                    char_literal32=(Token)match(input,71,FOLLOW_71_in_special_instruction663); 

                    pushFollow(FOLLOW_expr_in_special_instruction666);
                    expr33=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr33.getTree());

                    char_literal34=(Token)match(input,71,FOLLOW_71_in_special_instruction668); 

                    pushFollow(FOLLOW_expr_in_special_instruction671);
                    expr35=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr35.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:106:4: AVAN ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    AVAN36=(Token)match(input,AVAN,FOLLOW_AVAN_in_special_instruction676); 
                    AVAN36_tree = 
                    (AslTree)adaptor.create(AVAN36)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(AVAN36_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction679);
                    expr37=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr37.getTree());

                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:107:4: RETRO ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    RETRO38=(Token)match(input,RETRO,FOLLOW_RETRO_in_special_instruction684); 
                    RETRO38_tree = 
                    (AslTree)adaptor.create(RETRO38)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(RETRO38_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction687);
                    expr39=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr39.getTree());

                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:108:4: NOBSTACLE ^ COLOR ( ',' ! COLOR )?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    NOBSTACLE40=(Token)match(input,NOBSTACLE,FOLLOW_NOBSTACLE_in_special_instruction692); 
                    NOBSTACLE40_tree = 
                    (AslTree)adaptor.create(NOBSTACLE40)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOBSTACLE40_tree, root_0);


                    COLOR41=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction695); 
                    COLOR41_tree = 
                    (AslTree)adaptor.create(COLOR41)
                    ;
                    adaptor.addChild(root_0, COLOR41_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:108:21: ( ',' ! COLOR )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==71) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:108:22: ',' ! COLOR
                            {
                            char_literal42=(Token)match(input,71,FOLLOW_71_in_special_instruction698); 

                            COLOR43=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction701); 
                            COLOR43_tree = 
                            (AslTree)adaptor.create(COLOR43)
                            ;
                            adaptor.addChild(root_0, COLOR43_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:109:4: GIRA ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    GIRA44=(Token)match(input,GIRA,FOLLOW_GIRA_in_special_instruction708); 
                    GIRA44_tree = 
                    (AslTree)adaptor.create(GIRA44)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(GIRA44_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction711);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:110:4: PINTARCOLOR ^ ESTADOPINTAR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PINTARCOLOR46=(Token)match(input,PINTARCOLOR,FOLLOW_PINTARCOLOR_in_special_instruction716); 
                    PINTARCOLOR46_tree = 
                    (AslTree)adaptor.create(PINTARCOLOR46)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PINTARCOLOR46_tree, root_0);


                    ESTADOPINTAR47=(Token)match(input,ESTADOPINTAR,FOLLOW_ESTADOPINTAR_in_special_instruction719); 
                    ESTADOPINTAR47_tree = 
                    (AslTree)adaptor.create(ESTADOPINTAR47)
                    ;
                    adaptor.addChild(root_0, ESTADOPINTAR47_tree);


                    }
                    break;
                case 7 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:111:4: OBSTACLE ^ expr ',' ! expr ',' ! expr ',' ! expr ',' ! COLOR ',' ! COLOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    OBSTACLE48=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_special_instruction724); 
                    OBSTACLE48_tree = 
                    (AslTree)adaptor.create(OBSTACLE48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(OBSTACLE48_tree, root_0);


                    pushFollow(FOLLOW_expr_in_special_instruction727);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                    char_literal50=(Token)match(input,71,FOLLOW_71_in_special_instruction729); 

                    pushFollow(FOLLOW_expr_in_special_instruction732);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

                    char_literal52=(Token)match(input,71,FOLLOW_71_in_special_instruction734); 

                    pushFollow(FOLLOW_expr_in_special_instruction737);
                    expr53=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr53.getTree());

                    char_literal54=(Token)match(input,71,FOLLOW_71_in_special_instruction739); 

                    pushFollow(FOLLOW_expr_in_special_instruction742);
                    expr55=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr55.getTree());

                    char_literal56=(Token)match(input,71,FOLLOW_71_in_special_instruction744); 

                    COLOR57=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction747); 
                    COLOR57_tree = 
                    (AslTree)adaptor.create(COLOR57)
                    ;
                    adaptor.addChild(root_0, COLOR57_tree);


                    char_literal58=(Token)match(input,71,FOLLOW_71_in_special_instruction749); 

                    COLOR59=(Token)match(input,COLOR,FOLLOW_COLOR_in_special_instruction752); 
                    COLOR59_tree = 
                    (AslTree)adaptor.create(COLOR59)
                    ;
                    adaptor.addChild(root_0, COLOR59_tree);


                    }
                    break;
                case 8 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:112:4: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_special_instruction757);
                    sensors60=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors60.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:115:1: sensors : ( SENTIR ^| INFRA ^| CHOCAR ^| DISTANCIACOLOR ^ COLOR | ORIENTACION | MIRAR ^ expr );
    public final AslParser.sensors_return sensors() throws RecognitionException {
        AslParser.sensors_return retval = new AslParser.sensors_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token SENTIR61=null;
        Token INFRA62=null;
        Token CHOCAR63=null;
        Token DISTANCIACOLOR64=null;
        Token COLOR65=null;
        Token ORIENTACION66=null;
        Token MIRAR67=null;
        AslParser.expr_return expr68 =null;


        AslTree SENTIR61_tree=null;
        AslTree INFRA62_tree=null;
        AslTree CHOCAR63_tree=null;
        AslTree DISTANCIACOLOR64_tree=null;
        AslTree COLOR65_tree=null;
        AslTree ORIENTACION66_tree=null;
        AslTree MIRAR67_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:116:2: ( SENTIR ^| INFRA ^| CHOCAR ^| DISTANCIACOLOR ^ COLOR | ORIENTACION | MIRAR ^ expr )
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:116:4: SENTIR ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SENTIR61=(Token)match(input,SENTIR,FOLLOW_SENTIR_in_sensors768); 
                    SENTIR61_tree = 
                    (AslTree)adaptor.create(SENTIR61)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SENTIR61_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:117:4: INFRA ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INFRA62=(Token)match(input,INFRA,FOLLOW_INFRA_in_sensors774); 
                    INFRA62_tree = 
                    (AslTree)adaptor.create(INFRA62)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(INFRA62_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:118:4: CHOCAR ^
                    {
                    root_0 = (AslTree)adaptor.nil();


                    CHOCAR63=(Token)match(input,CHOCAR,FOLLOW_CHOCAR_in_sensors780); 
                    CHOCAR63_tree = 
                    (AslTree)adaptor.create(CHOCAR63)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(CHOCAR63_tree, root_0);


                    }
                    break;
                case 4 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:119:4: DISTANCIACOLOR ^ COLOR
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DISTANCIACOLOR64=(Token)match(input,DISTANCIACOLOR,FOLLOW_DISTANCIACOLOR_in_sensors786); 
                    DISTANCIACOLOR64_tree = 
                    (AslTree)adaptor.create(DISTANCIACOLOR64)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(DISTANCIACOLOR64_tree, root_0);


                    COLOR65=(Token)match(input,COLOR,FOLLOW_COLOR_in_sensors789); 
                    COLOR65_tree = 
                    (AslTree)adaptor.create(COLOR65)
                    ;
                    adaptor.addChild(root_0, COLOR65_tree);


                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:120:4: ORIENTACION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ORIENTACION66=(Token)match(input,ORIENTACION,FOLLOW_ORIENTACION_in_sensors794); 
                    ORIENTACION66_tree = 
                    (AslTree)adaptor.create(ORIENTACION66)
                    ;
                    adaptor.addChild(root_0, ORIENTACION66_tree);


                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:121:4: MIRAR ^ expr
                    {
                    root_0 = (AslTree)adaptor.nil();


                    MIRAR67=(Token)match(input,MIRAR,FOLLOW_MIRAR_in_sensors799); 
                    MIRAR67_tree = 
                    (AslTree)adaptor.create(MIRAR67)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MIRAR67_tree, root_0);


                    pushFollow(FOLLOW_expr_in_sensors803);
                    expr68=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr68.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:125:1: assign : idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.idtypes_return idtypes69 =null;

        AslParser.expr_return expr70 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_idtypes=new RewriteRuleSubtreeStream(adaptor,"rule idtypes");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:125:8: ( idtypes eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:125:10: idtypes eq= EQUAL expr
            {
            pushFollow(FOLLOW_idtypes_in_assign814);
            idtypes69=idtypes();

            state._fsp--;

            stream_idtypes.add(idtypes69.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign818);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign820);
            expr70=expr();

            state._fsp--;

            stream_expr.add(expr70.getTree());

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
            // 125:32: -> ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:125:35: ^( ASSIGN[$eq,\":=\"] idtypes expr ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_idtypes.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:125:67: ( expr )?
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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:129:1: idtypes : ID ( LBRACK ^ expr RBRACK !)? ;
    public final AslParser.idtypes_return idtypes() throws RecognitionException {
        AslParser.idtypes_return retval = new AslParser.idtypes_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID71=null;
        Token LBRACK72=null;
        Token RBRACK74=null;
        AslParser.expr_return expr73 =null;


        AslTree ID71_tree=null;
        AslTree LBRACK72_tree=null;
        AslTree RBRACK74_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:129:9: ( ID ( LBRACK ^ expr RBRACK !)? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:129:11: ID ( LBRACK ^ expr RBRACK !)?
            {
            root_0 = (AslTree)adaptor.nil();


            ID71=(Token)match(input,ID,FOLLOW_ID_in_idtypes860); 
            ID71_tree = 
            (AslTree)adaptor.create(ID71)
            ;
            adaptor.addChild(root_0, ID71_tree);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:129:14: ( LBRACK ^ expr RBRACK !)?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LBRACK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:129:15: LBRACK ^ expr RBRACK !
                    {
                    LBRACK72=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_idtypes863); 
                    LBRACK72_tree = 
                    (AslTree)adaptor.create(LBRACK72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LBRACK72_tree, root_0);


                    pushFollow(FOLLOW_expr_in_idtypes866);
                    expr73=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr73.getTree());

                    RBRACK74=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_idtypes868); 

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:133:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF75=null;
        Token THEN77=null;
        Token ELSE79=null;
        Token ENDIF81=null;
        AslParser.expr_return expr76 =null;

        AslParser.block_instructions_return block_instructions78 =null;

        AslParser.block_instructions_return block_instructions80 =null;


        AslTree IF75_tree=null;
        AslTree THEN77_tree=null;
        AslTree ELSE79_tree=null;
        AslTree ENDIF81_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:133:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:133:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF75=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt890); 
            IF75_tree = 
            (AslTree)adaptor.create(IF75)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF75_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt893);
            expr76=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr76.getTree());

            THEN77=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt895); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt898);
            block_instructions78=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions78.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:133:46: ( ELSE ! block_instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:133:47: ELSE ! block_instructions
                    {
                    ELSE79=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt901); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt904);
                    block_instructions80=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions80.getTree());

                    }
                    break;

            }


            ENDIF81=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt908); 

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:137:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE82=null;
        Token DO84=null;
        Token ENDWHILE86=null;
        AslParser.expr_return expr83 =null;

        AslParser.block_instructions_return block_instructions85 =null;


        AslTree WHILE82_tree=null;
        AslTree DO84_tree=null;
        AslTree ENDWHILE86_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:137:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:137:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE82=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt931); 
            WHILE82_tree = 
            (AslTree)adaptor.create(WHILE82)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE82_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt934);
            expr83=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr83.getTree());

            DO84=(Token)match(input,DO,FOLLOW_DO_in_while_stmt936); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt939);
            block_instructions85=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions85.getTree());

            ENDWHILE86=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt941); 

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:141:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN87=null;
        AslParser.expr_return expr88 =null;


        AslTree RETURN87_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:141:13: ( RETURN ^ ( expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:141:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN87=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt964); 
            RETURN87_tree = 
            (AslTree)adaptor.create(RETURN87)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN87_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:141:23: ( expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CHOCAR||LA12_0==DISTANCIACOLOR||LA12_0==FALSE||LA12_0==ID||LA12_0==INFRA||LA12_0==INT||LA12_0==LPAREN||(LA12_0 >= MINUS && LA12_0 <= MIRAR)||LA12_0==NOT||LA12_0==ORIENTACION||LA12_0==PLUS||LA12_0==SENTIR||LA12_0==TRUE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:141:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt967);
                    expr88=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr88.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:145:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ89=null;
        Token ID90=null;

        AslTree READ89_tree=null;
        AslTree ID90_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:145:6: ( READ ^ ID )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:145:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ89=(Token)match(input,READ,FOLLOW_READ_in_read986); 
            READ89_tree = 
            (AslTree)adaptor.create(READ89)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ89_tree, root_0);


            ID90=(Token)match(input,ID,FOLLOW_ID_in_read989); 
            ID90_tree = 
            (AslTree)adaptor.create(ID90)
            ;
            adaptor.addChild(root_0, ID90_tree);


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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE91=null;
        Token STRING93=null;
        AslParser.expr_return expr92 =null;


        AslTree WRITE91_tree=null;
        AslTree STRING93_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:7: ( WRITE ^ ( expr | STRING ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE91=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1009); 
            WRITE91_tree = 
            (AslTree)adaptor.create(WRITE91)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE91_tree, root_0);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:18: ( expr | STRING )
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1013);
                    expr92=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr92.getTree());

                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:149:26: STRING
                    {
                    STRING93=(Token)match(input,STRING,FOLLOW_STRING_in_write1017); 
                    STRING93_tree = 
                    (AslTree)adaptor.create(STRING93)
                    ;
                    adaptor.addChild(root_0, STRING93_tree);


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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:153:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR95=null;
        AslParser.boolterm_return boolterm94 =null;

        AslParser.boolterm_return boolterm96 =null;


        AslTree OR95_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:153:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:153:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1042);
            boolterm94=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm94.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:153:22: ( OR ^ boolterm )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:153:23: OR ^ boolterm
            	    {
            	    OR95=(Token)match(input,OR,FOLLOW_OR_in_expr1045); 
            	    OR95_tree = 
            	    (AslTree)adaptor.create(OR95)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR95_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1048);
            	    boolterm96=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm96.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:156:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND98=null;
        AslParser.boolfact_return boolfact97 =null;

        AslParser.boolfact_return boolfact99 =null;


        AslTree AND98_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:156:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:156:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1068);
            boolfact97=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact97.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:156:22: ( AND ^ boolfact )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:156:23: AND ^ boolfact
            	    {
            	    AND98=(Token)match(input,AND,FOLLOW_AND_in_boolterm1071); 
            	    AND98_tree = 
            	    (AslTree)adaptor.create(AND98)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND98_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1074);
            	    boolfact99=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact99.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL101=null;
        Token NOT_EQUAL102=null;
        Token LT103=null;
        Token LE104=null;
        Token GT105=null;
        Token GE106=null;
        AslParser.num_expr_return num_expr100 =null;

        AslParser.num_expr_return num_expr107 =null;


        AslTree EQUAL101_tree=null;
        AslTree NOT_EQUAL102_tree=null;
        AslTree LT103_tree=null;
        AslTree LE104_tree=null;
        AslTree GT105_tree=null;
        AslTree GE106_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1094);
            num_expr100=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr100.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:24: EQUAL ^
                            {
                            EQUAL101=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1098); 
                            EQUAL101_tree = 
                            (AslTree)adaptor.create(EQUAL101)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL101_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL102=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1103); 
                            NOT_EQUAL102_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL102)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL102_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:46: LT ^
                            {
                            LT103=(Token)match(input,LT,FOLLOW_LT_in_boolfact1108); 
                            LT103_tree = 
                            (AslTree)adaptor.create(LT103)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT103_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:52: LE ^
                            {
                            LE104=(Token)match(input,LE,FOLLOW_LE_in_boolfact1113); 
                            LE104_tree = 
                            (AslTree)adaptor.create(LE104)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE104_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:58: GT ^
                            {
                            GT105=(Token)match(input,GT,FOLLOW_GT_in_boolfact1118); 
                            GT105_tree = 
                            (AslTree)adaptor.create(GT105)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT105_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:159:64: GE ^
                            {
                            GE106=(Token)match(input,GE,FOLLOW_GE_in_boolfact1123); 
                            GE106_tree = 
                            (AslTree)adaptor.create(GE106)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE106_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1127);
                    num_expr107=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr107.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS109=null;
        Token MINUS110=null;
        AslParser.term_return term108 =null;

        AslParser.term_return term111 =null;


        AslTree PLUS109_tree=null;
        AslTree MINUS110_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1147);
            term108=term();

            state._fsp--;

            adaptor.addChild(root_0, term108.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:18: ( ( PLUS ^| MINUS ^) term )*
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
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:20: ( PLUS ^| MINUS ^)
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
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:21: PLUS ^
            	            {
            	            PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1152); 
            	            PLUS109_tree = 
            	            (AslTree)adaptor.create(PLUS109)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS109_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:162:29: MINUS ^
            	            {
            	            MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1157); 
            	            MINUS110_tree = 
            	            (AslTree)adaptor.create(MINUS110)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS110_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1161);
            	    term111=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term111.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL113=null;
        Token DIV114=null;
        Token MOD115=null;
        AslParser.factor_return factor112 =null;

        AslParser.factor_return factor116 =null;


        AslTree MUL113_tree=null;
        AslTree DIV114_tree=null;
        AslTree MOD115_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1185);
            factor112=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor112.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
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
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:23: MUL ^
            	            {
            	            MUL113=(Token)match(input,MUL,FOLLOW_MUL_in_term1190); 
            	            MUL113_tree = 
            	            (AslTree)adaptor.create(MUL113)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL113_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:30: DIV ^
            	            {
            	            DIV114=(Token)match(input,DIV,FOLLOW_DIV_in_term1195); 
            	            DIV114_tree = 
            	            (AslTree)adaptor.create(DIV114)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV114_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:165:37: MOD ^
            	            {
            	            MOD115=(Token)match(input,MOD,FOLLOW_MOD_in_term1200); 
            	            MOD115_tree = 
            	            (AslTree)adaptor.create(MOD115)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD115_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1204);
            	    factor116=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor116.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT117=null;
        Token PLUS118=null;
        Token MINUS119=null;
        AslParser.atom_return atom120 =null;


        AslTree NOT117_tree=null;
        AslTree PLUS118_tree=null;
        AslTree MINUS119_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:14: NOT ^
                    {
                    NOT117=(Token)match(input,NOT,FOLLOW_NOT_in_factor1227); 
                    NOT117_tree = 
                    (AslTree)adaptor.create(NOT117)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT117_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:21: PLUS ^
                    {
                    PLUS118=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1232); 
                    PLUS118_tree = 
                    (AslTree)adaptor.create(PLUS118)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS118_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:168:29: MINUS ^
                    {
                    MINUS119=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1237); 
                    MINUS119_tree = 
                    (AslTree)adaptor.create(MINUS119)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS119_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1242);
            atom120=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom120.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:1: atom : ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID121=null;
        Token LBRACK122=null;
        Token RBRACK124=null;
        Token INT125=null;
        Token LPAREN127=null;
        Token char_literal129=null;
        AslParser.expr_return expr123 =null;

        AslParser.funcall_return funcall126 =null;

        AslParser.expr_return expr128 =null;

        AslParser.sensors_return sensors130 =null;


        AslTree b_tree=null;
        AslTree ID121_tree=null;
        AslTree LBRACK122_tree=null;
        AslTree RBRACK124_tree=null;
        AslTree INT125_tree=null;
        AslTree LPAREN127_tree=null;
        AslTree char_literal129_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:9: ( ID ( LBRACK ^ expr RBRACK !)? | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | LPAREN ^ expr ')' !| sensors )
            int alt25=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==LPAREN) ) {
                    alt25=4;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= ENDWHILE)||LA25_1==EQUAL||LA25_1==GE||LA25_1==GT||(LA25_1 >= LBRACK && LA25_1 <= LE)||(LA25_1 >= LT && LA25_1 <= MINUS)||(LA25_1 >= MOD && LA25_1 <= MUL)||LA25_1==NOT_EQUAL||LA25_1==OR||LA25_1==PLUS||LA25_1==RBRACK||LA25_1==THEN||(LA25_1 >= 70 && LA25_1 <= 72)) ) {
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:13: ID ( LBRACK ^ expr RBRACK !)?
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID121=(Token)match(input,ID,FOLLOW_ID_in_atom1267); 
                    ID121_tree = 
                    (AslTree)adaptor.create(ID121)
                    ;
                    adaptor.addChild(root_0, ID121_tree);


                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:16: ( LBRACK ^ expr RBRACK !)?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==LBRACK) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:174:17: LBRACK ^ expr RBRACK !
                            {
                            LBRACK122=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_atom1270); 
                            LBRACK122_tree = 
                            (AslTree)adaptor.create(LBRACK122)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LBRACK122_tree, root_0);


                            pushFollow(FOLLOW_expr_in_atom1273);
                            expr123=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr123.getTree());

                            RBRACK124=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_atom1275); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:175:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT125=(Token)match(input,INT,FOLLOW_INT_in_atom1292); 
                    INT125_tree = 
                    (AslTree)adaptor.create(INT125)
                    ;
                    adaptor.addChild(root_0, INT125_tree);


                    }
                    break;
                case 3 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:13: (b= TRUE |b= FALSE )
                    {
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:13: (b= TRUE |b= FALSE )
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
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1309);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1315);  
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
                    // 176:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:176:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:177:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1338);
                    funcall126=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall126.getTree());

                    }
                    break;
                case 5 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:178:13: LPAREN ^ expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    LPAREN127=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1352); 
                    LPAREN127_tree = 
                    (AslTree)adaptor.create(LPAREN127)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(LPAREN127_tree, root_0);


                    pushFollow(FOLLOW_expr_in_atom1355);
                    expr128=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr128.getTree());

                    char_literal129=(Token)match(input,70,FOLLOW_70_in_atom1357); 

                    }
                    break;
                case 6 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:179:13: sensors
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_sensors_in_atom1372);
                    sensors130=sensors();

                    state._fsp--;

                    adaptor.addChild(root_0, sensors130.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        AslParser.expr_list_return expr_list133 =null;


        AslTree ID131_tree=null;
        AslTree char_literal132_tree=null;
        AslTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:12: ID '(' ( expr_list )? ')'
            {
            ID131=(Token)match(input,ID,FOLLOW_ID_in_funcall1391);  
            stream_ID.add(ID131);


            char_literal132=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcall1393);  
            stream_LPAREN.add(char_literal132);


            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:19: ( expr_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CHOCAR||LA26_0==DISTANCIACOLOR||LA26_0==FALSE||LA26_0==ID||LA26_0==INFRA||LA26_0==INT||LA26_0==LPAREN||(LA26_0 >= MINUS && LA26_0 <= MIRAR)||LA26_0==NOT||LA26_0==ORIENTACION||LA26_0==PLUS||LA26_0==SENTIR||LA26_0==TRUE) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:19: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1395);
                    expr_list133=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list133.getTree());

                    }
                    break;

            }


            char_literal134=(Token)match(input,70,FOLLOW_70_in_funcall1398);  
            stream_70.add(char_literal134);


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
            // 183:34: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:37: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:50: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:183:60: ( expr_list )?
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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal136=null;
        AslParser.expr_return expr135 =null;

        AslParser.expr_return expr137 =null;


        AslTree char_literal136_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:10: ( expr ( ',' ! expr )* )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:12: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1434);
            expr135=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr135.getTree());

            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:17: ( ',' ! expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==71) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:187:18: ',' ! expr
            	    {
            	    char_literal136=(Token)match(input,71,FOLLOW_71_in_expr_list1437); 

            	    pushFollow(FOLLOW_expr_in_expr_list1440);
            	    expr137=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr137.getTree());

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
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:189:1: tipus : ( ENTER | BOOL | CARACTERS );
    public final AslParser.tipus_return tipus() throws RecognitionException {
        AslParser.tipus_return retval = new AslParser.tipus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set138=null;

        AslTree set138_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:189:6: ( ENTER | BOOL | CARACTERS )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set138=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||input.LA(1)==CARACTERS||input.LA(1)==ENTER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set138)
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


    public static class ftipus_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ftipus"
    // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:194:1: ftipus : ( ENTER | BOOL | CARACTERS | BUIT );
    public final AslParser.ftipus_return ftipus() throws RecognitionException {
        AslParser.ftipus_return retval = new AslParser.ftipus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token set139=null;

        AslTree set139_tree=null;

        try {
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:194:7: ( ENTER | BOOL | CARACTERS | BUIT )
            // /home/jaumevera/Documents/UNI/Q10/CL/LeJOS/src/parser/Asl.g:
            {
            root_0 = (AslTree)adaptor.nil();


            set139=(Token)input.LT(1);

            if ( input.LA(1)==BOOL||(input.LA(1) >= BUIT && input.LA(1) <= CARACTERS)||input.LA(1)==ENTER ) {
                input.consume();
                adaptor.addChild(root_0, 
                (AslTree)adaptor.create(set139)
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
    // $ANTLR end "ftipus"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func205 = new BitSet(new long[]{0x0000000000400D00L});
    public static final BitSet FOLLOW_ftype_in_func208 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_func210 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_params_in_func212 = new BitSet(new long[]{0x7854900F40009080L,0x000000000000010CL});
    public static final BitSet FOLLOW_block_instructions_in_func214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_params235 = new BitSet(new long[]{0x0000000000400900L,0x0000000000000040L});
    public static final BitSet FOLLOW_paramlist_in_params237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_params240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_paramlist269 = new BitSet(new long[]{0x0000000000400900L});
    public static final BitSet FOLLOW_param_in_paramlist272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ptype_in_param305 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_param308 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_param314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftipus_in_ftype363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipus_in_ptype380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_block_instructions410 = new BitSet(new long[]{0x7854900F40009080L,0x000000000000010CL});
    public static final BitSet FOLLOW_instruction_in_block_instructions412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_assign_in_instruction461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_special_instruction_in_instruction610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIROBOT_in_special_instruction658 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction663 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction668 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVAN_in_special_instruction676 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETRO_in_special_instruction684 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOBSTACLE_in_special_instruction692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction698 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GIRA_in_special_instruction708 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PINTARCOLOR_in_special_instruction716 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ESTADOPINTAR_in_special_instruction719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_special_instruction724 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction729 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction734 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction739 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_special_instruction742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction744 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_special_instruction749 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLOR_in_special_instruction752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_special_instruction757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SENTIR_in_sensors768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INFRA_in_sensors774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHOCAR_in_sensors780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCIACOLOR_in_sensors786 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLOR_in_sensors789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORIENTACION_in_sensors794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIRAR_in_sensors799 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sensors803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idtypes_in_assign814 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_in_assign818 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_assign820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idtypes860 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LBRACK_in_idtypes863 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_idtypes866 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_idtypes868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt890 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_ite_stmt893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt895 = new BitSet(new long[]{0x7854900F40009080L,0x000000000000010CL});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt898 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt901 = new BitSet(new long[]{0x7854900F40009080L,0x000000000000010CL});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt904 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt931 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_while_stmt934 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_while_stmt936 = new BitSet(new long[]{0x7854900F40009080L,0x000000000000010CL});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt939 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt964 = new BitSet(new long[]{0x40911A1504009002L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_return_stmt967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read986 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_read989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1009 = new BitSet(new long[]{0xC0911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_write1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1042 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_expr1045 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1048 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1068 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1071 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1074 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1094 = new BitSet(new long[]{0x00020440A0800002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1098 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1103 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_boolfact1108 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LE_in_boolfact1113 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_boolfact1118 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_GE_in_boolfact1123 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1147 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1152 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1157 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1161 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_factor_in_term1185 = new BitSet(new long[]{0x0000600000010002L});
    public static final BitSet FOLLOW_MUL_in_term1190 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_term1195 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_term1200 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1204 = new BitSet(new long[]{0x0000600000010002L});
    public static final BitSet FOLLOW_NOT_in_factor1227 = new BitSet(new long[]{0x4010121504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_factor1232 = new BitSet(new long[]{0x4010121504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor1237 = new BitSet(new long[]{0x4010121504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factor1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1267 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_LBRACK_in_atom1270 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_atom1273 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACK_in_atom1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1352 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_atom1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sensors_in_atom1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1391 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcall1393 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000042L});
    public static final BitSet FOLLOW_expr_list_in_funcall1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_funcall1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_expr_list1437 = new BitSet(new long[]{0x40911A1504009000L,0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});

}