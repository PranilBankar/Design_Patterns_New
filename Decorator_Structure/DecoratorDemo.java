package Decorator_Structure;

public class DecoratorDemo{
    public static void main(String[] args) {
        Pizza pizza = new TomatoDecorator(new VegPizza());
        System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());
        
        // pizza = new CheeseTopping(pizza);
        // System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());
        
        // pizza = new OlivesTopping(pizza);
        // System.out.println(pizza.getDescription() + " Cost: " + pizza.cost());
    }
}
