import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//here's equivalent to RequestBuilder, builds nodes created for AST, when we visit parse tree

abstract class AST {}

class Calculate extends AST{
   final Query q_node;
    final Macros m_node;
    //ensure there is a MACRO node, to be given!!
    Calculate(Query q_node, Macros m_node){
        this.q_node = q_node;
        this.m_node = m_node;
    }

    Calculate(Query q_node){
        this.q_node = q_node;
        this.m_node = null;
    }


    //need to deaal with when no MACRO!!
}

class Query extends AST{}

class Recipe extends Query{
    final List<Ingredient> recipe;
    Recipe(List<Ingredient> recipe){
        this.recipe = recipe;
    }

}

class Item extends Query{
    Ingredients item;
    Item(Ingredients item){
        this.item = item;
    }

}

class Macros extends AST {
    final List<Macro>Macros;
    Macros(List<Macro>Macros){
        this.Macros = Macros;
    }
}

class Macro extends AST {
    String Macro;
    Macro(String Macro){
        this.Macro = Macro;
    }
}


//All other nodes, will extend the Query Node, as they stem from that node
abstract class Ingredients extends AST {}

class Name extends Ingredients {
      final String names;
      Name(String names){
       this.names = names;
      }
}

class NumericVal extends Ingredients{
    Double val;
    NumericVal(Double val){
        this.val = val;
    }

    public double getNumericVal(){
        return this.val;
    }

}


class Units extends Ingredients{
    String unit;
    Units(String unit){
        this.unit = unit;
    }
}

class Measurement extends Ingredients {
      final Units units;
      final NumericVal numeric;
      Measurement(Units units, NumericVal numeric){
        this.units = units;
        this.numeric = numeric;
      }
}



class Ingredient extends Ingredients{
    final Measurement measure;
    final List<Name> name;
    Ingredient(Measurement measure, List<Name> names){
        this.measure = measure;
        this.name = names;
    }
}