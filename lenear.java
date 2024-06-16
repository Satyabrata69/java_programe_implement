import java.util.Scanner;
class Do{
    int size;
    int arr[];
    boolean found;
    Do(){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the size:");
        size=ac.nextInt();
        arr=new int[size];
        System.out.println("enter the array element..");
        for(int i=0;i<size;i++){
            int n=ac.nextInt();
            arr[i]=n;
        }
    }
    void search(){
        Scanner bc=new Scanner(System.in);
        System.out.println("enter the search number..");
        int sh=bc.nextInt();
        for(int i=0;i<size;i++){
            found=false;
            if(arr[i]==sh){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("the number is exists");

        }
        else{
            System.out.println("the number is not exists");
        }
    }
}
public class lenear {
    public static void main(String[] args) {
        Do obj=new Do();
        obj.search();
    }
}
