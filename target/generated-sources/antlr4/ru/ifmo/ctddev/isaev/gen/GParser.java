// Generated from ru/ifmo/ctddev/isaev/gen/G.g4 by ANTLR 4.0
package ru.ifmo.ctddev.isaev.gen;

	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, WS=7, ID=8, NUM=9, SEMICOLON=10, 
		NEWLINE=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'*'", "'+'", "'-'", "'='", "WS", "ID", "NUM", 
		"';'", "NEWLINE"
	};
	public static final int
		RULE_file = 0, RULE_r = 1, RULE_e = 2, RULE_t = 3, RULE_f = 4;
	public static final String[] ruleNames = {
		"file", "r", "e", "t", "f"
	};

	@Override
	public String getGrammarFileName() { return "G.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


		public Map<String, Integer> values = new HashMap<String, Integer>();

	public GParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(GParser.NEWLINE, i);
		}
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GParser.SEMICOLON); }
		public List<TerminalNode> NEWLINE() { return getTokens(GParser.NEWLINE); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GParser.SEMICOLON, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); r();
			setState(11); match(SEMICOLON);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NEWLINE) {
				{
				{
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(12); match(NEWLINE);
					}
					}
					setState(17);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(18); r();
				setState(19); match(SEMICOLON);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RContext extends ParserRuleContext {
		public Token ID;
		public EContext e;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode ID() { return getToken(GParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); ((RContext)_localctx).ID = match(ID);
			setState(27); match(6);
			setState(28); ((RContext)_localctx).e = e();

			     Integer result = ((RContext)_localctx).e.value;
			     values.put((((RContext)_localctx).ID!=null?((RContext)_localctx).ID.getText():null), result);
			     System.out.println(String.format("%s = %d;", (((RContext)_localctx).ID!=null?((RContext)_localctx).ID.getText():null), result));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EContext extends ParserRuleContext {
		public Integer value;
		public TContext t;
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); ((EContext)_localctx).t = t();
			((EContext)_localctx).value =  ((EContext)_localctx).t.value;
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4 || _la==5) {
				{
				setState(41);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(33); match(4);
					setState(34); ((EContext)_localctx).t = t();
					_localctx.value += ((EContext)_localctx).t.value;
					}
					break;
				case 5:
					{
					setState(37); match(5);
					setState(38); ((EContext)_localctx).t = t();
					_localctx.value -= ((EContext)_localctx).t.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public Integer value;
		public FContext f;
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); ((TContext)_localctx).f = f();
			((TContext)_localctx).value =  ((TContext)_localctx).f.value;
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(48); match(3);
				setState(49); ((TContext)_localctx).f = f();
				_localctx.value *= ((TContext)_localctx).f.value;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public Integer value;
		public FContext f;
		public Token NUM;
		public Token ID;
		public EContext e;
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode NUM() { return getToken(GParser.NUM, 0); }
		public TerminalNode ID() { return getToken(GParser.ID, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GListener ) ((GListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(5);
				setState(58); ((FContext)_localctx).f = f();
				((FContext)_localctx).value =  _localctx.value;
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); ((FContext)_localctx).NUM = match(NUM);
				((FContext)_localctx).value =  Integer.parseInt((((FContext)_localctx).NUM!=null?((FContext)_localctx).NUM.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); ((FContext)_localctx).ID = match(ID);
				((FContext)_localctx).value =  values.get((((FContext)_localctx).ID!=null?((FContext)_localctx).ID.getText():null));
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); match(1);
				setState(66); ((FContext)_localctx).e = e();
				setState(67); match(2);
				((FContext)_localctx).value =  ((FContext)_localctx).e.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\rK\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2"+
		"\f\2\16\2\23\13\2\3\2\3\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6I\n\6\3\6\2\7\2\4\6\b\n\2\2M\2\f"+
		"\3\2\2\2\4\34\3\2\2\2\6!\3\2\2\2\b\60\3\2\2\2\nH\3\2\2\2\f\r\5\4\3\2\r"+
		"\31\7\f\2\2\16\20\7\r\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21"+
		"\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\5\4\3\2\25\26\7\f\2\2\26"+
		"\30\3\2\2\2\27\21\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\3\3\2\2\2\33\31\3\2\2\2\34\35\7\n\2\2\35\36\7\b\2\2\36\37\5\6\4\2\37"+
		" \b\3\1\2 \5\3\2\2\2!\"\5\b\5\2\"-\b\4\1\2#$\7\6\2\2$%\5\b\5\2%&\b\4\1"+
		"\2&,\3\2\2\2\'(\7\7\2\2()\5\b\5\2)*\b\4\1\2*,\3\2\2\2+#\3\2\2\2+\'\3\2"+
		"\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2\2\60\61\5\n\6\2"+
		"\618\b\5\1\2\62\63\7\5\2\2\63\64\5\n\6\2\64\65\b\5\1\2\65\67\3\2\2\2\66"+
		"\62\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\7"+
		"\7\2\2<=\5\n\6\2=>\b\6\1\2>I\3\2\2\2?@\7\13\2\2@I\b\6\1\2AB\7\n\2\2BI"+
		"\b\6\1\2CD\7\3\2\2DE\5\6\4\2EF\7\4\2\2FG\b\6\1\2GI\3\2\2\2H;\3\2\2\2H"+
		"?\3\2\2\2HA\3\2\2\2HC\3\2\2\2I\13\3\2\2\2\b\21\31+-8H";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}