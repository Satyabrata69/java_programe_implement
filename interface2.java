interface client{
    void webdesign();
    void webdevlopment();
}
abstract class trishultech implements client{
    @Override
    public void webdesign(){
        System.out.println("this the webdesign part");
    }
}
class newtech extends trishultech{
    @Override
    public void webdevlopment(){
        System.out.println("this the webdeblopment part");
    }
}
public class interface2 {
    public static void main(String args[]){
        client n=new newtech();
        n.webdesign();
        n.webdevlopment();
    }
}
