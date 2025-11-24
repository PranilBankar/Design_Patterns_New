// Subject
interface Employee {
    void showAccess();
}

// Real Subject
class RealEmployee implements Employee {
    private String name;

    public RealEmployee(String name) {
        this.name = name;
        loadFromDatabase();   // costly operation
    }

    private void loadFromDatabase() {
        System.out.println("Loading employee " + name + " from database...");
    }

    @Override
    public void showAccess() {
        System.out.println("Employee: " + name + " has full access.");
    }
}

// Proxy
class EmployeeProxy implements Employee {
    private RealEmployee realEmployee;
    private String name;

    public EmployeeProxy(String name) {
        this.name = name;
    }

    @Override
    public void showAccess() {
        if (realEmployee == null) {
            realEmployee = new RealEmployee(name); // load only when needed
        }
        realEmployee.showAccess();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new EmployeeProxy("John");
        Employee emp2 = new EmployeeProxy("Alice");

        // database load happens only when accessed
        emp1.showAccess();
        emp2.showAccess();
    }
}
// What Did Proxy Achieve?

// ✅ The proxy delayed the expensive operation (loadFromDatabase) until the object was actually needed.
// ✅ Client only talks to the proxy, but proxy decides when to create the real object.
// ✅ This is Virtual Proxy (used for lazy initialization)