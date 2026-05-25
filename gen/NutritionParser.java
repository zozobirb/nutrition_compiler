// Generated from Nutrition.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NutritionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, RECIPE=6, ITEM=7, MACROS=8, PROTEIN=9, 
		CARBS=10, FATS=11, CALORIES=12, FRACTION=13, ID=14, INT=15, WS=16;
	public static final int
		RULE_calculate = 0, RULE_query = 1, RULE_recipe = 2, RULE_item = 3, RULE_ingredients = 4, 
		RULE_measurements = 5, RULE_units = 6, RULE_name = 7, RULE_value = 8, 
		RULE_macros = 9, RULE_types = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculate", "query", "recipe", "item", "ingredients", "measurements", 
			"units", "name", "value", "macros", "types"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'OF'", "'('", "')'", "'=>'", "'Recipe'", "'Item'", "'Macros'", 
			"'Protein'", "'Carbs'", "'Fats'", "'Calories'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "RECIPE", "ITEM", "MACROS", "PROTEIN", 
			"CARBS", "FATS", "CALORIES", "FRACTION", "ID", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Nutrition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NutritionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalculateContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public CalculateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateContext calculate() throws RecognitionException {
		CalculateContext _localctx = new CalculateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			query();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public RecipeContext recipe() {
			return getRuleContext(RecipeContext.class,0);
		}
		public MacrosContext macros() {
			return getRuleContext(MacrosContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECIPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				recipe();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MACROS) {
					{
					setState(25);
					macros();
					}
				}

				}
				break;
			case ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				item();
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MACROS) {
					{
					setState(29);
					macros();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class RecipeContext extends ParserRuleContext {
		public TerminalNode RECIPE() { return getToken(NutritionParser.RECIPE, 0); }
		public List<IngredientsContext> ingredients() {
			return getRuleContexts(IngredientsContext.class);
		}
		public IngredientsContext ingredients(int i) {
			return getRuleContext(IngredientsContext.class,i);
		}
		public RecipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipe; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitRecipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipeContext recipe() throws RecognitionException {
		RecipeContext _localctx = new RecipeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_recipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(RECIPE);
			setState(35);
			match(T__0);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				ingredients();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FRACTION || _la==INT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(NutritionParser.ITEM, 0); }
		public IngredientsContext ingredients() {
			return getRuleContext(IngredientsContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ITEM);
			setState(42);
			match(T__0);
			setState(43);
			ingredients();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientsContext extends ParserRuleContext {
		public MeasurementsContext measurements() {
			return getRuleContext(MeasurementsContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public IngredientsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredients; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitIngredients(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientsContext ingredients() throws RecognitionException {
		IngredientsContext _localctx = new IngredientsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ingredients);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			measurements();
			setState(46);
			match(T__1);
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MeasurementsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnitsContext units() {
			return getRuleContext(UnitsContext.class,0);
		}
		public MeasurementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitMeasurements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurementsContext measurements() throws RecognitionException {
		MeasurementsContext _localctx = new MeasurementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_measurements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			value();
			setState(53);
			match(T__2);
			setState(54);
			units();
			setState(55);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_units; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsContext units() throws RecognitionException {
		UnitsContext _localctx = new UnitsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_units);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode FRACTION() { return getToken(NutritionParser.FRACTION, 0); }
		public TerminalNode ID() { return getToken(NutritionParser.ID, 0); }
		public TerminalNode INT() { return getToken(NutritionParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(FRACTION);
				setState(62);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MacrosContext extends ParserRuleContext {
		public TerminalNode MACROS() { return getToken(NutritionParser.MACROS, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public MacrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitMacros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacrosContext macros() throws RecognitionException {
		MacrosContext _localctx = new MacrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(MACROS);
			setState(67);
			match(T__4);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				types();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypesContext extends ParserRuleContext {
		public TerminalNode PROTEIN() { return getToken(NutritionParser.PROTEIN, 0); }
		public TerminalNode CARBS() { return getToken(NutritionParser.CARBS, 0); }
		public TerminalNode FATS() { return getToken(NutritionParser.FATS, 0); }
		public TerminalNode CALORIES() { return getToken(NutritionParser.CALORIES, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NutritionVisitor ) return ((NutritionVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001f\b\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002&\b\u0002\u000b\u0002\f\u0002\'\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"1\b\u0004\u000b\u0004\f\u00042\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bA\b\b\u0001\t\u0001\t\u0001\t\u0004\tF\b\t\u000b"+
		"\t\f\tG\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\t\fG\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\"\u0001"+
		"\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000"+
		"\u0000\n4\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e;\u0001"+
		"\u0000\u0000\u0000\u0010@\u0001\u0000\u0000\u0000\u0012B\u0001\u0000\u0000"+
		"\u0000\u0014I\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000"+
		"\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000"+
		"\u0019\u001b\u0003\u0012\t\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b!\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0003\u0006\u0003\u0000\u001d\u001f\u0003\u0012\t\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000"+
		"\u0000\u0000 \u0018\u0001\u0000\u0000\u0000 \u001c\u0001\u0000\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"#\u0005\u0006\u0000\u0000#%\u0005\u0001"+
		"\u0000\u0000$&\u0003\b\u0004\u0000%$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0007\u0000\u0000*+\u0005\u0001"+
		"\u0000\u0000+,\u0003\b\u0004\u0000,\u0007\u0001\u0000\u0000\u0000-.\u0003"+
		"\n\u0005\u0000.0\u0005\u0002\u0000\u0000/1\u0003\u000e\u0007\u00000/\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000\u000045\u0003\u0010\b"+
		"\u000056\u0005\u0003\u0000\u000067\u0003\f\u0006\u000078\u0005\u0004\u0000"+
		"\u00008\u000b\u0001\u0000\u0000\u00009:\u0003\u0010\b\u0000:\r\u0001\u0000"+
		"\u0000\u0000;<\u0003\u0010\b\u0000<\u000f\u0001\u0000\u0000\u0000=>\u0005"+
		"\r\u0000\u0000>A\u0005\u000e\u0000\u0000?A\u0005\u000f\u0000\u0000@=\u0001"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0011\u0001\u0000\u0000"+
		"\u0000BC\u0005\b\u0000\u0000CE\u0005\u0005\u0000\u0000DF\u0003\u0014\n"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0013\u0001\u0000\u0000\u0000"+
		"IJ\u0007\u0000\u0000\u0000J\u0015\u0001\u0000\u0000\u0000\u0007\u001a"+
		"\u001e \'2@G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}