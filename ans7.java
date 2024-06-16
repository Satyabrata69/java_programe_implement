interface i1{
    int i=123;
}
interface i2{
    int j=555;
}
class A implements i1,i2{
    int aval;
    A(int aval){
        this.aval=aval;
    }
    void display(){
        System.out.println("interface i1:"+i1.i);
        System.out.println("interface i2:"+i2.j);
        System.out.println("aval:"+aval);
    }
}
public class ans7 {
    public static void main(String[] args) {
        A a=new A(45);
        a.display();
    }
    
}
