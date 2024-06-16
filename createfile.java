import java.io.*;

public class createfile {
    public static void main(String args[]) {
        String pathname="Home/satyabrata/Desktop";
        String filename="lc.txt";
        File ac = new File(pathname,filename);
        try{
            if (ac.createNewFile()) {
                System.out.println("file is created is sucessfully.....");
            } else {
                System.out.println("fiel already exists....");
            }
        }
        catch(IOException e){
            System.out.println("exception handaled");
        }
        
    }
}
