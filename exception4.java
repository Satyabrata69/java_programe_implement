public class exception4 {
    public static void main(String[] args) {
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("can't divided by zero");
        }
        try{
            int x[]={1,2,3,4,5};
            System.out.println(x[5]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("beyond the array size");
        }
    }
}
