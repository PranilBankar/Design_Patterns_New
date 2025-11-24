package Decorator_Structure;

public class VegPizza extends Pizza {
    double value;
    public VegPizza() {
        description = "Veg Pizza";
        value=300;
    }
    public double cost() {
        return value;
    }
    
}
