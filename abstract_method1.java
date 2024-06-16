abstract class programming{
    public abstract void devloper();
}
class html extends programming{
    @Override
    public void devloper(){
        System.out.println("tim bernnerrs lee");
    }
}
class java extends programming{
    @Override
    public void devloper(){
        System.out.println("james gosling");
    }
}
public class abstract_method1 {
    public static void main(String args[]){
    programming h=new html();
    h.devloper();
    programming j=new java();
    
    j.devloper();
    }
}
