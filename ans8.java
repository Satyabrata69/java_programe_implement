import java.util.*;
public class ans8 {
    public static void main(String[] args) {
        System.out.println("enter a integer number...");
        Scanner ac=new Scanner(System.in);
        int n=ac.nextInt();
        try{
            if(n%2!=0){
                throw new IllegalArgumentException("the given number is odd..");
            }
            System.out.println("the given number is even");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("please enter intger value only..");
        }
        finally{
            ac.close();
        }
    }
}
