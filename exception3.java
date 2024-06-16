public class exception3 {
    public static void main(String[] args) {
        String str="satya";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("NumberFormatException...");
        }
            }
}
