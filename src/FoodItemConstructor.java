import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Purpose of this class is to use the Food Object class and construct
//indidual food objects, that store: name, unit, numericVal
//this class is outwards of all extractor classes, thus will utilize them
//would need to pass the AST to it, for analyze
//point of this class is to construct Food Objects
//Should be stateless
//Functionality:
//Extractors have a list of units, name, numeric val


class FoodItemConstructor {


 NameExtractor extN = new NameExtractor();
 UnitExtractor extU = new UnitExtractor();
 NumericExtractor extV = new NumericExtractor();
 AST astFC;


//pass only the ast to it!
public FoodItemConstructor(AST ast){
    this.astFC = ast;
}

public List<String> constructNames(){
    return extN.processNames(this.astFC);
}

public List<String> constructUnits(){
    return extU.processUnits(this.astFC);
}

public List<Double> constructValues(){
    return extV.processVals(this.astFC);
}

public FoodObject constructFood(String name, String unit, Double value){
    return new FoodObject(name, unit, value);
}

public  List<FoodObject> constructFoodObjects(){
List<String> names = this.constructNames();
List<String> units = this.constructUnits();
List<Double> values = this.constructValues();
List<FoodObject> returnObjects = new ArrayList();
for(int i = 0; i < names.size(); i++){
    FoodObject FoodObjectTemp = this.constructFood(names.get(i), units.get(i), values.get(i));
    returnObjects.add(FoodObjectTemp);
    System.out.println("Added food Object: ");
    FoodObjectTemp.foodToString();
}
return returnObjects;
//returns the list of FoodObjects in order of: name, units, values!!






}


}