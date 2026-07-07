import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNode;


/*
Quick tangent: For the sake of better debugging and cohesive coupling, I seperated
The issues of extraction for names, units and measurements
To their own seperate extractor objects
A driver will use all three, and store their extractions in a singular Ingreident class
capiche


*/ 
class UnitExtractor{

//Objects of this class: List of Strings, to their names
List<String> unitsCollected = new ArrayList<>();



//visits the AST, and adds name encountered nodes, to names List
public void  extractUnit(AST c){

    if(c instanceof Name n){
             System.out.println("Name visited, name: "+n.names);
          
            return;
            //will want to add name to list!
        }
    //need to visit other nodes, but collect nothing...
    if(c instanceof Calculate cal){
             System.out.println("Calculated visited");
            extractUnit(cal.q_node);//call by the field NAME given, not datatype.class
            return;
        }
    
    if(c instanceof Recipe r){
             System.out.println("Recipe visited");
            for(Ingredient i : r.recipe)
                extractUnit(i);//might be wrong...
            return;
        }

    if(c instanceof Item i){ 
            extractUnit(i.item);//might be wrong...
            return;
        }

    if(c instanceof Macros m){
             System.out.println("Macros visited");
            return;
        }    
//note would need a extract macro class, do samething BUT for macro!!
    if(c instanceof Macro s){ 
            //might be wrong...
            return;
        }
        //need to add case for when no macro present

    if(c instanceof NumericVal s){ 
            //might be wrong...
            return;
        }

    if(c instanceof Units u){ 
            unitsCollected.add(u.unit);
            return;
        }

    if(c instanceof Measurement t){ 
        //no need to check them, won't get to this point
        extractUnit(t.units);
        extractUnit(t.numeric);
            return;
        }
    if(c instanceof Ingredient g){ 
        //
        System.out.println("Ingredients visited");
            extractUnit(g.measure);
            return;
            
        }
        //Note I only would need to visit: Recipie, or Item, and Calculate, and Ingredient, then names, to actually get name
        //totally disregard Macro and Measurement nodes and it's children NOT relevant!

}



//returns the NameExtractor names object... 
public List<String> processUnits(AST c){
        unitsCollected.clear();
        extractUnit(c);
        System.out.println("Units successfully extracted!!");
        return unitsCollected; //OR services.getOutput()
    }


}




