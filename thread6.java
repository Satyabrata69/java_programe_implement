class thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("0");
            Thread.yield();
        }
    }
}
class thread2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("1");
        }
    }
}
public class thread6 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
    
}
