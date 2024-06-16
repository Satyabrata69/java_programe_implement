import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(50);
        s1.push(40);
        s1.push(30);
        s1.push(20);
        s1.push(10);
        
        System.out.println("peek:"+s1.peek());

        int popel=s1.pop();
        System.out.println("pop element:"+popel);
        System.out.println("Stack is:"+s1);

        System.out.println("stack size is:"+s1.size());

        System.out.println("stack empty of not"+s1.isEmpty());

        for(Integer el:s1){
            System.out.println(el);
        }
    }
}
