package Factory_DP;
public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Developer salary is 120000");
        return 120000;
    }  
    @Override
    public String name() {
        System.out.println("Web Developer name is Pranil");
        return "Pranil";
    }  
}
