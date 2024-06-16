class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("satya");
        }
    }
}

public class thread2 {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}
