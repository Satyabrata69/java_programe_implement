class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
public class user_excep {
    //static int age;
    public static void vote(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("not eligbel for vote");
        }
        else{
            System.out.println("eligbel");
        }

    }
    public static void main(String args[]) throws InvalidAgeException{
        // try{
        //     vote(12);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        vote(12);
    }
}
