class A extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(n);
        }
    }
}
public class thread5 {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        A a3=new A();

        a1.setName("a1");
        a2.setName("a2");
        a3.setName("a3");
        a1.start();
        a2.start();
        a2.suspend();
        a3.start();
        a2.resume();
    }
}
