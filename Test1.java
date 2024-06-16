class Box {
    double width,height,depth;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    } 
    double volum(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w,double h,double d,double m){
        super(w,h,d);
        weight=m;
    }

}
class Shipment extends BoxWeight{
    double cost;
    Shipment(double w,double h,double d,double m,double c){
        super(w,h,d,m);
        cost=c;
    }
    void prints(){
        System.out.println("volume:"+(volum()));
        System.out.println("wetght:"+weight);
        System.out.println("shipment cost:"+cost);
    }
}
class Test1{
    public static void main(String[] args) {
        Shipment ob=new Shipment(10,20,30,40,45.5);
        ob.prints();
    }
}