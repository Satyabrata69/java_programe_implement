public class excep_propoga {
    public static void main(String args[]){
        // try{
        //     m1();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }

        m1();
    }
    static void m1(){
        // m2();
        try{
            m2();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    static void m2(){
        System.out.println(10/0);
    }
}
