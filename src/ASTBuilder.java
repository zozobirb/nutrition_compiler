import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNode;



class AstBuilder extends NutritionBaseVisitor<AST>{

//any globals here
List<String> valid_units = new ArrayList<>(List.of( "tsp", "tbsp", "floz", "c", "pt", "qt", "gal", "ml", "l", "lbs", "g"));
boolean isRecipe = false;
/*
 @Override
    public AST visitExpr(PA4Parser.ExprContext ctx) {
        return visit(ctx.cond());
    }
*/
public double processFraction(String val){
String[] parts = val.split("/");
double result = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
return result;
}

@Override 
public AST visitCalculate(NutritionParser.CalculateContext ctx) { 
    Query node = (Query) visit(ctx.query());
    System.out.println("Visited calculate");
    if(ctx.query().macros() != null){
     Macros m_node = (Macros) visit(ctx.query().macros());//check if right
      return new Calculate(node, m_node); 
    }
    /*
        if(isRecipe){
            Recipe r_node = (Recipe) visit(ctx.recipe());
            System.out.println("Visited Query, Recipe collected");
            return new Calculate(r_node, m_node);
        }
        else if(!Recipe){
            Item i_node = (Item) visit(ctx.item());
            System.out.println("Visited Query, Item collected");
            return new Calculate(i_node, m_node);

        }
*/
        return new Calculate(node);

    }
	
	@Override 
    public AST visitQuery(NutritionParser.QueryContext ctx) { 
        //check children type
            if(ctx.recipe() != null){
                //communitcate
                isRecipe = true;
            return visit(ctx.recipe());
            }
    
                return visit(ctx.item());
    }
	
	@Override 
    public AST visitRecipe(NutritionParser.RecipeContext ctx) {
        //here's the real work: Recipe, is made op of list of ingredients, multiple, ingridents, must
        //visit each and map em!
        //then return recipe node!!
        List<Ingredient> IL = ctx.ingredients().stream()//converts each child ingredients, be operated on
        .map(this::visit)//visit each child ingredients
            .map(e -> (Ingredient) e)//convert each chold visited to Ingredient type(for IL)//auto-box seen here!!
            .toList();//add em to list
             System.out.println("Visited Recipe, total of ingredients include "+IL.size());
         return new Recipe(IL); }
//good

	@Override 
    public AST visitItem(NutritionParser.ItemContext ctx) { 
        Ingredients i_node = (Ingredients) visit(ctx.ingredients());//only anticipate one!
        System.out.println("Visited Item node, name incudes: ");//might not work..
        return new Item(i_node); }
//good


	@Override
    public AST visitIngredients(NutritionParser.IngredientsContext ctx) { 
        List<Name> name = ctx.name().stream()//converts each child ingredients, be operated on
        .map(this::visit)//visit each child ingredients
            .map(e -> (Name) e)//new-try
            .toList();//add em to list

        Measurement measure = (Measurement) visit(ctx.measurements());
        
        return new Ingredient(measure, name); }//we can do something similar to measuremnt as in names, to not have <Name>, but string!!
//good


	@Override 
    public AST visitMeasurements(NutritionParser.MeasurementsContext ctx) { 
        Units unit = (Units) visit(ctx.units());
        NumericVal num_val = (NumericVal) visit(ctx.value());
        System.out.println("Visited Measuemrnet node, numeric value incudes: ");
        return new Measurement(unit, num_val); }



	@Override 
    public AST visitUnits(NutritionParser.UnitsContext ctx) { 

        String unit = ctx.ID().getText().toLowerCase();//might be problematic...
        if(!valid_units.contains(unit)){
            String valid_u = "Not a valid unit! Refer to these unit types:"+
        "\n Teaspoon (tsp), Tablespoon (tbsp), Fluid Ounce (floz), Cup (c), Pint (pt)"+ 
        "\nQuart (qt), Gallon (gal), milliliters, (ml), liters, (L), pounds(lbs), grams (g)";
        throw new RuntimeException(valid_u);
        }
        else{
            System.out.println("Units visited, unit is: "+unit);
            return new Units(unit);
        }

      //test validity
     }
	
    
	@Override
    public AST visitName(NutritionParser.NameContext ctx) { 
            return new Name(ctx.ID().getText());//must be recursive
         }

         /*
          int right = visit(ctx.expr(1));

To get the name+, same here, need to do ctx.name(i)
if(ctx.name(i) !=null){
add to list of names in ingredients portion}


*/

	@Override 
    public AST visitValue(NutritionParser.ValueContext ctx) { 
        //took care of IDs
        //take care of int -> double
        if(ctx.INT() != null){
            double val = Double.parseDouble(ctx.INT().getText());//sue me sorry!~
            System.out.println("Value visited: "+val);
            return new NumericVal(val);
        }
        else if(ctx.FRACTION() != null){
            //take care of fracs ->
            double val = processFraction(ctx.FRACTION().getText());
            System.out.println("Value visited: "+val);
            return new NumericVal(val);
        }
            throw new RuntimeException("Not a valid Numeric Value");
            
        }


//no returns for ID, handled previously
	@Override 
    public AST visitMacros(NutritionParser.MacrosContext ctx) {
        
        List<Macro> macros = ctx.types().stream()//converts each child ingredients, be operated on
        .map(this::visit)//visit each child ingredients
            .map(e -> (Macro) e)//convert each chold visited to Ingredient type(for IL)
            .toList();//add em to list


        
         return new Macros(macros);}
         //i could in-state a global macro list, that will add each visitation of types, then at the end... of the ingredients, create macro.. there..
	

	
	@Override 
    public AST visitTypes(NutritionParser.TypesContext ctx) { 
       if(ctx.PROTEIN() != null){
        System.out.println("New Macro added, Protein");
        return new Macro("Protein");
       }
       if(ctx.CARBS() != null){
        System.out.println("New Macro added, Carbs");
        return new Macro("Carbs");
       }
       if(ctx.FATS() != null)
       {
        System.out.println("New Macro added, Fats");
        return new Macro("Fats");
       }
       if(ctx.CALORIES() != null){
        System.out.println("New Macro added, Calories");
        return new Macro("Calories");
       }
       return null;
       
        }//samething here

}




