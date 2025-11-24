package Factory_DP;
public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer salary is 150000");
        return 150000;
    }
    @Override
    public String name() {
        System.out.println("Android Developer name is Pranil");
        return "Pranil";
    }
}
