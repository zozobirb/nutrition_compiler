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
class NumericExtractor{

//Objects of this class: List of Strings, to their names
List<Double> numCollected = new ArrayList<>();



//visits the AST, and adds name encountered nodes, to names List
public void  extractNum(AST c){

    //need to visit other nodes, but collect nothing...
    if(c instanceof Calculate cal){
             System.out.println("Calculated visited");
            extractNum(cal.q_node);//call by the field NAME given, not datatype.class
            return;
        }
    
    if(c instanceof Recipe r){
             System.out.println("Recipe visited");
            for(Ingredient i : r.recipe)
                extractNum(i);//might be wrong...
            return;
        }

    if(c instanceof Item i){ 
            extractNum(i.item);//might be wrong...
            return;
        }


    if(c instanceof Measurement t){ 
        //no need to check them, won't get to this point
        extractNum(t.numeric);
            return;
        }
    if(c instanceof Ingredient g){ 
        //
        System.out.println("Ingredients visited");
            extractNum(g.measure);
            return;
            
        }
     if(c instanceof NumericVal v){
        numCollected.add(v.val);
     }

}



//returns the NameExtractor names object... 
public List<Double> processVals(AST c){
        numCollected.clear();
        extractNum(c);
        System.out.println("Value successfully extracted!!");
        return numCollected; //OR services.getOutput()
    }


}