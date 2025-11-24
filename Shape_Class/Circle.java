import java.util.Scanner;
public class Circle extends shape{
    @Override
    public void Area(){
        System.out.println("Input Radius:");
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        System.out.println(3.14*R*R);
    }
}