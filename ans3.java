class point2d{
    int x,y;
    point2d(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("2d cordinate is:"+x+","+y);
    }
}
class point3d extends point2d{
    int z;
    point3d(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
    @override
    void display(){
        System.out.println("3d cordinate is:"+x+","+y+","+z);
    }
}
public class ans3 {
    public static void main(String[] args) {
        point2d d2=new point2d(10,20);
        point3d d3=new point3d(30,40,50);
        d2.display();
        d3.display();
    }
}
