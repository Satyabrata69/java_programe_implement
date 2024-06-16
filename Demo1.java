class shape{
    void draw(){
        System.out.println("no shape");
    }

}
class squre extends shape{
    
    //@Override
    void draw(){
        super.draw();
        System.out.println("there is a squre draw");
    }
}
class Demo1{
    public static void main(String[] args) {
        shape ac=new squre();
        ac.draw();
    }
}