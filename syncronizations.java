class ABC implements Runnable{
    int sit,passanger;
    ABC(int sit,int passanger){
        this.sit=sit;
        this.passanger=passanger;
    }
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(sit>=passanger){
            System.out.println(name+"take seat");
        }
        else{
            System.out.println("resurved already");
        }
    }
}
public class syncronizations {
    public static void main(String args[]){
        ABC a=new ABC(1,1);
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);

        t1.setName("satya");
        t2.setName("java");
        t3.setName("raju");

        t1.start();
        t2.start();
        t3.start();
    }
}
