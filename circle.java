//import java.util.*;
import java.lang.Math;
class circle1{
 int r;
 double serfaces,areas;
 circle1(int radius){
  r=radius;
 }
 void serface(){
  serfaces=2*Math.PI*r;
  System.out.println("serface of circle is:"+serfaces);
 }
 void area(){
  areas=Math.PI*Math.pow(r,2);
  System.out.println("area of circle is:"+areas);  
 }
} 
 class circle{
  public static void main(String args[]){
   circle1 ac=new circle1(10);
   ac.serface();
   ac.area();
   } 
  } 
