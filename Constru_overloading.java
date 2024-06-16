    /*constructor overloading*/
class A{
 int a;  double b; String c;
 A(){
  a=10; b=12.123; c="satyabrata";
 } 
 A(int x){
  a=x;
 }
 A(double y,String z){
  b=y; c=z;
 }
}
class Constru_overloading{
 public static void main(String args[]){
  A r1=new A();
  A r2=new A(20);
  A r3=new A(34.124,"mitu");
  System.out.println(r1.a+" "+r1.b+" "+r1.c);
  System.out.println(r2.a);
  System.out.println(r3.b+" "+r3.c);
 }
}
