class A{
    int roll;
    String name,stream;
    float fees;
    A(int roll,String name,String stream){
        this.roll=roll;
        this.name=name;
        this.stream=stream;
    }
    A(int roll,String name,String stream,float fees){
        this(roll,name,stream);
        this.fees=fees;

    }
    void display(){
        System.out.println(roll+" "+name+" "+stream+" "+fees);
    }
}
public class consract1 {
    public static void main(String args[]){
        A ac=new A(1,"satya","mca");
        ac.display();
        A bc=new A(2,"mitu","bsc",123.12f);
        bc.display();
    }
    
}
