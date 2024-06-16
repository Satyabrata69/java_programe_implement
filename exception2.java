public class exception2 {
    public static void main(String[] args) {
        String atr=null;
        try{
            System.out.println(atr.toUpperCase());
        }
        catch(NullPointerException n){
            System.out.println("null can't casted");
        }
    }
}
