import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNode;



class NameExtractor{

//Objects of this class: List of Strings, to their names
List<String> namesCollected = new ArrayList<>();
List<String> nameStack = new ArrayList<>();

public void pushName(String x){
    nameStack.add(x);
}

public void popNames(){
     String x = String.join(" ", nameStack);
    namesCollected.add(x);

    nameStack.clear();
}

//visits the AST, and adds name encountered nodes, to names List
public void  extractNames(AST c){

    if(c instanceof Name n){
             System.out.println("Name visited, name: "+n.names);
            //push the names?
            pushName(n.names);
            return;
            //will want to add name to list!
        }
    //need to visit other nodes, but collect nothing...
    if(c instanceof Calculate cal){
             System.out.println("Calculated visited");
            extractNames(cal.q_node);//call by the field NAME given, not datatype.class
            return;
        }
    
    if(c instanceof Recipe r){
             System.out.println("Recipe visited");
            for(Ingredient i : r.recipe)
                extractNames(i);//might be wrong...
            return;
        }

    if(c instanceof Item i){ 
            extractNames(i.item);//might be wrong...
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
            //might be wrong...
            return;
        }

    if(c instanceof Measurement t){ 
        //no need to check them, won't get to this point
            return;
        }
    if(c instanceof Ingredient g){ 
        //
        System.out.println("Ingredients visited");
            for(Name n : g.name)
                extractNames(n);//might be wrong...
                //once done
                popNames();
            return;
            
        }
        //Note I only would need to visit: Recipie, or Item, and Calculate, and Ingredient, then names, to actually get name
        //totally disregard Macro and Measurement nodes and it's children NOT relevant!

}



//returns the NameExtractor names object... 
public List<String> processNames(AST c){
        namesCollected.clear();
        extractNames(c);
        System.out.println("Names successfully extracted!!");
        return namesCollected; //OR services.getOutput()
    }


}




