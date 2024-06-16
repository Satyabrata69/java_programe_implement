class A{
    void add(int ... a)
    {
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        System.out.println(sum);
    }
}
public class var_args {
    public static void main (String args[]){
        A r=new A();
        r.add(10);
        r.add(10,20);
        r.add();
        r.add(10,20,30,40);
    }
}
