//6. WAP in JAVA to Demonstrate Queue operations.
import java.util.*;

public class queue {
    public static void main(String[] args) {
        //creat a queue...
        Queue<Integer> q1=new LinkedList<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.offer(40);
        q1.offer(50);
        //print first element of the queue....
        int first=q1.peek();
        System.out.println("first element of the queue:"+first);
        //dequeue and print the element
        System.out.println("dequeue and print the element");
        while (!q1.isEmpty()){
            int r=q1.poll();
            System.out.println(r);
        }
        System.out.println(q1);
    }
}
