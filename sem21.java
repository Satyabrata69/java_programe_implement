import java.util.Scanner;
import p1.package1;
public class sem21{
    public static void main(String args[]){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter a number..");
        int n=ac.nextInt();
        package1 bc=new package1();
        int s=bc.fact(n);
        System.out.println("factoreal is>>"+s);
    }
    
}
