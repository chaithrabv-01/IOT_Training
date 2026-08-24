package oopsbasics.inheritance.multilevel;

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
class puppy extends dog{
    void cry(){
        System.out.println("puppy is crying");
    }
}
class maincode{
    public static void main(String[] args) {
        animal a=new animal();
        dog d=new dog();
        puppy p=new puppy();
        d.eat();
        d.bark();
        p.cry();
        p.bark();
        p.eat();
    }
}
