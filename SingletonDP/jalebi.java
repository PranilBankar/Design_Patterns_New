// Eager Way of creating Singleton Design Pattern
public class jalebi {
    private static jalebi instance= new jalebi();
    public static jalebi getInstance() {
        return instance;
    }
}
