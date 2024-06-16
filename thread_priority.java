class A extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class thread_priority {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        A a3=new A();
        
        a1.setName("a1");
        a2.setName("a2");
        a3.setName("a3");

        a1.setPriority(1);
        a2.setPriority(10);
        a3.setPriority(3);

        a1.start();
        a2.start();
        a3.start();
    }   
}
