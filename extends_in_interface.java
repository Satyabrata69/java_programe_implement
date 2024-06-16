interface client1{
    void show1();
}
interface client2 extends client1{
    void show2();
}
class me implements client2{
    @Override
    public void show1(){
        System.out.println("hi i am client1");
    }
    @Override
    public void show2(){
        System.out.println("hi i am client2");
    }
    public static void main(String args[]){
        client2 r=new me();
        r.show1(); r.show2();
    }
}
public class extends_in_interface {
    
}
