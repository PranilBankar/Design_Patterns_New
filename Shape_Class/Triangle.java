import java.util.Scanner;
public class Triangle extends shape{
    @Override
    public void Area(){
        System.out.println("Input Height and Base:");
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(0.5*H*B);
    }
}