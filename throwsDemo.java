class throwsDemo{
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

// class throwsDemo{
//     public static void main(String[] args){
//         try{
//             for(int i=1;i<=10;i++){
//                 System.out.println(i);
//                 Thread.sleep(1000);
//         }
//         }
//         catch(InterruptedException e){
//             System.out.println(e);
//         }
//     }
// }