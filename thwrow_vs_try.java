public class thwrow_vs_try {
    public static void waits() throws InterruptedException {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String args[]) throws InterruptedException {
        waits();
    }
}
