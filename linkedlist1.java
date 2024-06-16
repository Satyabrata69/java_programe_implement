import java.util.*;
public class linkedlist1 {
    public static void main(String args[]){
        //create a linked list....
        LinkedList<Integer> linkedlists=new LinkedList<>();

        //add the number in linked list...
        linkedlists.add(10);
        linkedlists.add(20);
        linkedlists.add(30);
        linkedlists.add(40);
        linkedlists.add(50);

        //print the linkedlist...
        System.out.println("linked list is:"+linkedlists);

        //remove first element...
        linkedlists.removeLast();
        System.out.println("after removing first element:"+linkedlists);

        //contain a number...
        boolean check=linkedlists.contains(30);
        System.out.println("given number contains or not:"+check);

        //get first and last element....
        int first=linkedlists.getFirst();
        int last=linkedlists.getLast();
        System.out.println("first element is:"+first);
        System.out.println("last element is:"+last);

        //clear linked list....
        linkedlists.clear();
        System.out.println("clear linkedlist1:"+linkedlists);


    }
    
}
