class A extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("satya");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }

}
public class thread1 {
    public static void main(String args[])throws InterruptedException{
        A a=new A();
        a.start();
        for(int i=1;i<=5;i++){
            System.out.println("mitu");
            Thread.sleep(1000);
        }
    }    
}
