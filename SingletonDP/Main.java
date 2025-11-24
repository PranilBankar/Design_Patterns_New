public class Main {
    public static void main(String[] args) {
        Samosa samosa1=Samosa.getInstance();
        Samosa samosa2=Samosa.getInstance();
        System.out.println(samosa1.hashCode());
        System.out.println(samosa2.hashCode());
        jalebi jalebi1=jalebi.getInstance();
        jalebi jalebi2=jalebi.getInstance();
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi2.hashCode());
    }
}
/* 1. Constructor is private as it is Singleton and we cant create multiple objects.
 * 2. Static method is used to return the same instance every time.
 * 3. Lazy Initialization is used in samosa class  i.e. the object is created only when it is needed.
 * 4. Eager Initialization is used in jalebi class i.e. then the object is created at the time of class loading.
 * 5. Private static variable in each class to hold the single instance of the class.
 * 6. In Eager way there is a disadvantage that the instance is created even if the client application might not be using it.
 * 7. In Lazy way there is a disadvantage that it is not thread safe. If multiple threads access the getInstance() method simultaneously, multiple instances can be created.
 * 8. To make Lazy way thread safe, we can use synchronized keyword in getInstance() method but it is inefficient.
 * 9. Better way is to make synchronized block inside the if condition with double checking.
 */