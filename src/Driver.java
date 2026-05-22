import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import org.antlr.v4.runtime.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class Driver  {

private List<String> outPrint = new ArrayList<>();

    public static void main(String[] args) throws IOException  {
    
        CharStream input = CharStreams.fromStream(System.in);
        NutritionLexer lexer = new NutritionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NutritionParser parser = new NutritionParser(tokens);
        ParseTree tree = parser.calculate();

        // AST
      //  AstBuilder astBuilder = new AstBuilder();
      //  Expr ast = astBuilder.visit(tree);
      //  RequestBuilder req = new RequestBuilder();

        // AST implementation test
        
       /*  List<String> outPrint = req.generate(ast);
    for(String line : outPrint){
             System.out.println(line);
    }
    */


    }

}