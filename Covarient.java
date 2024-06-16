class A{
    A show(){
        System.out.println("this is a class");
        return this;
    }
}
class B extends A{
    @Override
    B show(){
        System.out.println("this is class b");
        super.show();
        return this;
    }
}
class Covarient{
    public static void main(String args[]){
        B ac=new B();
        ac.show();
    }
}