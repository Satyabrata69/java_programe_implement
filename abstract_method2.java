abstract class programming{
    public abstract void devloper();
    public abstract void rank();
}
abstract class html extends programming{
    @Override
    public void devloper(){
        System.out.println("tim bernnerrs lee");
    }
    
}
class java extends html{
    @Override
    public void rank(){
        System.out.println("3rd rank");
    }
}
public class abstract_method2 {
    public static void main(String args[]){
    programming j=new java();
    j.rank();
    j.devloper();
    }
}

