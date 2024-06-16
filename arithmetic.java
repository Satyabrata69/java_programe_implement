import java.util.Scanner;
class test{
    void t1(int age){
        if(age<18){
            throw new ArithmeticException("not eligble for vote");

        }
        else{
            System.out.println("you eligble for vote..");
        }
    }
}
public class arithmetic {
    public static void main(String[] args) {
        test bc=new test();
        Scanner ac=new Scanner(System.in);
        System.out.println("enter your age:");
        int n=ac.nextInt();
        bc.t1(n);
    }
}
