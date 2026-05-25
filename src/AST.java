import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//here's equivalent to RequestBuilder, builds nodes created for AST, when we visit parse tree

abstract class AST {
    
}
class Calculate extends AST{
    final Query q_node;
    Calculate(Query q_node){
        this.q_node = q_node;
    }
}

class Query extends AST{
    //two types of constructor one for Recipe, other Item
    final Recipe r_node;
    final Item i_node;
    final Macro m_node;
    //ensure there is a MACRO node, to be given!!
    Query(Recipe r_node, Macro m_node){
        this.r_node = r_node;
        this.m_node = m_mode;
    }

    Query(Item i_node, Macro m_node){
        this.i_node = i_node;
        this.m_node = m_node;
    }
    //do something

}



//Calculate and Query will be type AST




//All other nodes, will extend the Query Node, as they stem from that node
abstract class SubQuery extends AST {}

class Name extends SubQuery {
    final String name;

    Name(List<String>names){
        this.name = String.join(" ", names);
    }
}

class Measurement extends SubQuery {
      final String units;
      final double numeric;
      Measurement(String units, double numeric){
        this.units = unit;
        this.numeric = numeric;
      }
}

class Macros extends SubQuery {
    final List<String>Macros;
    Macros(List<String>Macros){
        this.Macros = Macros;
    }
}

class Ingredients extends SubQuery{
    final Measurement measure_i;
    final Name name_i;
    Ingredients(measure_i, name_i){
        this.measure_i = measure_i;
        this.name_i = name_i;
    }
}

class Recipe extends SubQuery{
    final List<Ingredients> recipe;
    Recipe(List<Ingredients> recipe){
        this.recipe = recipe;
    }

}

class Item extends SubQuery{
    final List<Ingredients> item;
    Recipe(List<Ingredients> item){
        this.item = item;
    }

}

