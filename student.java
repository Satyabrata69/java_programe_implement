class students{
 int roll;
 String name,course;
 double fees;
 students(int roll,String name,String course){
  this.roll=roll;
  this.name=name;
  this.course=course;
  }
 students(int roll,String name,String course,double fees){
  this(roll,name,course);
  this.fees=fees;
  }
 void display(){
  System.out.println(roll + name +course+ fees);
  }
 } 
class student{
 public static void main(String args[])
 {
  students ac=new students(1,"satya","Mca");
  students bc=new students(2,"mitu","msc",2000.500);
  ac.display();
  bc.display();
  }
 } 
      
