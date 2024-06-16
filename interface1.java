import java.util.*;
interface code{
    void input();
    void output();
}
class satya implements code{
    String name; double sal;
    @override
    public void input(){
        try(Scanner ac = new Scanner(System.in);){
            System.out.println("enter the name:");
            name=ac.nextLine();
            System.out.println("enter the salary:");
            sal=ac.nextDouble();
        }
    }    
    @override
    public void output(){
    System.out.println(name+" "+sal);
    }    
}
public class interface1 {
    public static void main(String args[])
    {
        code r=new satya();
        r.input();
        r.output();    
    }
}
