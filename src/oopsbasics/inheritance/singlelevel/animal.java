package oopsbasics.inheritance.singlelevel;

public class animal {
    void eat(){
        System.out.println("Eating....");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog will bark");
    }
}
class maincode{
    public static void main(String[] args) {
        animal a=new animal();
        dog d=new dog();
        d.eat();
        d.bark();
    }
}
