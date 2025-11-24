package Factory_DP;
public class Client {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployee("Android");
        emp1.salary();
        emp1.name();

        Employee emp2 = EmployeeFactory.getEmployee("Web");
        emp2.salary();
        emp2.name();
    }
}
/* Client class to demonstrate the Factory Method pattern.
 * It creates different types of Employee objects using the EmployeeFactory.
 */