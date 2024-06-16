import java.util.*;
class A{
    int n,r,c,s=1,c1;
    public void fact(int f){
        int k=f;
        for(int i=1;i<=k;i++){
            s*=i;
            return (s);
        }
    }
    void fun(int n,int r){
        int n1=n; int r1=r; int c,p,t,t1;
        p=fact(n1);
        c=fact(r1);
        t=n1-r1;
        t1=fact(t1);
        c1=p/(c*t1);
        System.out.println(c1);
    }
}
class ncr extends A{
    int x,y;
    void inputs(){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the value of n:");
        x=nextInt();
        System.out.println("enter the value of r:");
        y=nextInt();
    }
    int display(){
        fun(x,y);
    }
    public static void main(String args[]){
        ncr pc=new ncr();
        pc.inputs();
        pc.display();

    }

}