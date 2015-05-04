// Generated from ru/ifmo/ctddev/isaev/gen/G.g4 by ANTLR 4.0
package ru.ifmo.ctddev.isaev.gen;

	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, WS=7, ID=8, NUM=9, SEMICOLON=10, 
		NEWLINE=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'*'", "'+'", "'-'", "'='", "WS", "ID", "NUM", "';'", "NEWLINE"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", "ID", "NUM", "SEMICOLON", 
		"NEWLINE"
	};


		public Map<String, Integer> values = new HashMap<String, Integer>();


	public GLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "G.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\r=\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\6\b\'\n\b\r\b\16\b(\3\b\3\b\3\t\6\t.\n\t\r\t\16\t/\3\n"+
		"\6\n\63\n\n\r\n\16\n\64\3\13\3\13\3\f\3\f\3\f\5\f<\n\f\2\r\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\2\21\n\1\23\13\1\25\f\1\27\r\1\3\2\6\5"+
		"\13\f\17\17\"\"\3c|\3\62;\4\f\f\17\17@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3"+
		"\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r#\3\2\2\2\17&\3\2\2\2\21-\3\2\2\2\23"+
		"\62\3\2\2\2\25\66\3\2\2\2\27;\3\2\2\2\31\32\7*\2\2\32\4\3\2\2\2\33\34"+
		"\7+\2\2\34\6\3\2\2\2\35\36\7,\2\2\36\b\3\2\2\2\37 \7-\2\2 \n\3\2\2\2!"+
		"\"\7/\2\2\"\f\3\2\2\2#$\7?\2\2$\16\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\b\b\2\2+\20\3\2\2\2,.\t\3\2\2-,\3"+
		"\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\22\3\2\2\2\61\63\t\4\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\24\3\2\2\2\66"+
		"\67\7=\2\2\67\26\3\2\2\289\7\17\2\29<\7\f\2\2:<\t\5\2\2;8\3\2\2\2;:\3"+
		"\2\2\2<\30\3\2\2\2\7\2(/\64;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}