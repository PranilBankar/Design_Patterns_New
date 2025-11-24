package Prototype_DP;

public class Main {
    public static void main(String[] args) {
        Prototype obj1=new ConcretePrototype("Pranil",101);
        Prototype obj2=(ConcretePrototype)obj1.clone();
        System.out.println("Object 1: "+obj1.name+" "+obj1.value);
        System.out.println("Object 2: "+obj2.name+" "+obj2.value);
    }
}
