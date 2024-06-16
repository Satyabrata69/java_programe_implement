// interface A{
//     default void call(){
//         add(10,30);
//     }                                              //implement by default
//     private void add(int x,int y){
//         System.out.println("additon:"+(x+y));
//     }
// }
// class B implements A{
//     void sub(int x,int y){
//     System.out.println("sub:"+(x-y));
//     }
// }
// public class private_interface {
//     public static void main(String art[]){
//     B b=new B();
//     b.call(); b.sub(20,10);
//     }
// }
 





interface A{
    public static void  call(){
        add(10,30);
    }
    private static void add(int x,int y){
        System.out.println("additon:"+(x+y));
    }
}                                                         //implement by static
class B implements A{
    void sub(int x,int y){
    System.out.println("sub:"+(x-y));
    }
}
public class private_interface {
    public static void main(String art[]){
    B b=new B();
    b.sub(20,10);
    A.call();
    }
}
