import java.util.Scanner;
public class Rect extends shape{
    @Override
    public void Area(){
        System.out.println("Input Length and Breadth:");
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        System.out.println(L*B);
    }
}
