interface A{
    void a1();//public+abstract
    void a2();//public+abstract
    default void a3(){
        System.out.println("may or may not override this menthod");
    }
    static void a4(){
        System.out.println("this is static method ,you can not override");
    }
}
class B implements A{
    @Override
    public void a1(){
        System.out.println("this is class B,a1 implemntation");
    }
    @Override
    public void a2(){
        System.out.println("this is class B,a2 implemntation");
    }
}
class C implements A{
    @Override
    public void a1(){
        System.out.println("this is class C,a1 implemntation");
    }
    @Override
    public void a2(){
        System.out.println("this is class C,a2 implemntation");
    }
    @Override
    public void a3(){
        System.out.println("class C implemnts a3");
    }
}

public class interface3 {
    public static void main(String args[]){
        B b=new B();
        C c=new C();
        b.a1(); b.a2(); b.a3(); 
        c.a1(); c.a2(); c.a3(); 
        A.a4();

    }
}
