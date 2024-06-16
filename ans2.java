class Box{
    double length,breadth,height;
    Box(){
        length=breadth=height=0;
    }
    Box(double side){
        length=breadth=height=side;
    }
    Box(double l,double b,double h){
        length=l;
        breadth=b;
        height=h;
    }
    double volume(){
        return length*breadth*height;
    }
    void display(){
        System.out.println("volume:"+volume());
    }
}
public class ans2 {
    public static void main(String[] args){
        Box b1=new Box();
        Box b2=new Box(10);
        Box b3=new Box(5,10,15);
        System.out.println("0 vlume box output:");
        b1.display();
        System.out.println(" cube box output:");
        b2.display();
        System.out.println("cuboid box output:");
        b3.display();
    }
}
