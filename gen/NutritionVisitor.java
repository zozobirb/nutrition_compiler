// Generated from Nutrition.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NutritionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NutritionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NutritionParser#calculate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(NutritionParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(NutritionParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipe(NutritionParser.RecipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(NutritionParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#ingredients}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredients(NutritionParser.IngredientsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#measurements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasurements(NutritionParser.MeasurementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#units}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnits(NutritionParser.UnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(NutritionParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(NutritionParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#macros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacros(NutritionParser.MacrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link NutritionParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(NutritionParser.TypesContext ctx);
}