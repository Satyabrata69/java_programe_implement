class A{
    private int value;//data hiding
    public void setValue(int x){//data abstraction
        value=x;
    }
    public int getValue(){
        return ++value;
    }
}
public class Encapsulation_example {
    public static void main(String[] args) {
        A ac=new A();
        ac.setValue(100);
        System.out.println(ac.getValue());
    }
}
