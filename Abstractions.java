abstract class animal{
    animal(){
        System.out.println("all the animals.....");
    }
    public abstract void sound();
}
class Dog extends animal{
    Dog(){
        super();
    }
    public void sound(){
        System.out.println("dog is barks");
    }
}
class Lion extends animal{
    Lion(){
        super();
    }
    public void sound(){
        System.out.println("lion is roarw....");
    } 
}
public class Abstractions {
    public static void main(String[] args) {
        Dog d=new Dog();
        Lion l=new Lion();
        d.sound(); l.sound();
        
    }
    
}
