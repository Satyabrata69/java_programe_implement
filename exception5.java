public class exception5 {
    public static void main(String[] args) {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int x[]={1,2,3,4};
            System.out.println(x[3]);

            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException n){
            System.out.println("ArrayIndexOutofBoundsException");
        }
        catch(Exception c){
            System.out.println("all types of exception..");
        }
    }
}
