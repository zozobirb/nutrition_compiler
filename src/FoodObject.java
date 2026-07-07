import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//here's equivalent to RequestBuilder, builds nodes created for AST, when we visit parse tree

class FoodObject {

//comprise of: Name(0), Unit(1), Value(2)
//Goal here can fine-tune the FoodObject in a recipie, other process will use, and 
//need to get name, unit for conversion, adjust, values based on if needed conversions
//and etc

//With extractor, another service, will create FoodObjects, based on the extractors will fill
//their fields

String food_name;
String food_unit;
Double food_value;

public FoodObject(String food_name, String food_unit, Double food_value)
{
    this.food_name = food_name;
    this.food_unit = food_unit;
    this.food_value = food_value;
}

//generic getters
public String getFoodName(){
    return this.food_name;
}

public String getFoodUnit(){
    return this.food_unit;
}

public Double getFoodValue(){
    return this.food_value;
}




public void setFoodUnit(String newUnit){
    System.out.println("Changed unit to"+ newUnit);
    this.food_unit = newUnit;
}

public void setFoodValue(Double newValue){
    System.out.println("Changed value to"+ newValue);
    this.food_value = newValue;
}

public void foodToString(){

    System.out.println("Food Object Name: "+this.getFoodName()+"\nUnit: "+this.getFoodUnit()+"\nValue: "+ this.getFoodValue());
}







}

