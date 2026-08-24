package oopsbasics.inheritance.hierarchial;

public class animal {
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meow");
    }
}
class main1{
public static void main(String[] args) {
    animal a=new animal();
    dog d=new dog();
    cat c=new cat();
    c.meow();
    c.eat();
    d.bark();
    d.eat();
}

}
