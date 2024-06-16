    /* example of copy constructor */           

class A{
 int a,x; String b,y; 
 A(){
  a=10; b="satyabrata samanta";
  System.out.println(a+" "+b);
 }
 A(A ref){
  a=ref.a; b=ref.b;
  System.out.println(a+" "+b);
 }
}
class Copy_constru{
 public static void main(String args[]){
  A r1=new A();
  A r2=new A(r1);
 } 
}
