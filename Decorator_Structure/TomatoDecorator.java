package Decorator_Structure;

public class TomatoDecorator extends Pizza {
    Pizza pizza;
    double value;
    public TomatoDecorator(Pizza pizza) {
        this.pizza = pizza;
        value=50;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tomato Decorator";
    }
    public double cost() {
        return pizza.cost() + value;
    }
    
}
