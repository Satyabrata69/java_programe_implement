public class nestedcatch {
    public static void main(String[] args) {
    try{
        System.out.println(10/0);
    }
    catch(Exception e){
        System.out.println(e);
        try{
            String str=null;
            System.out.println(str.toLowerCase());
        }
        catch(NullPointerException n){
            System.out.println("NullPointerException....");
        }
    }
    System.out.println("main method ended");
}
}
