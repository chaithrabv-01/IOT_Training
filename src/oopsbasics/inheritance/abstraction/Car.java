package oopsbasics.inheritance.abstraction;

abstract class Car {
    abstract void start();
    void brake(){
        System.out.println("car stops");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("bmw starts");
    }
}
class Toyota extends Car{
    void start(){
        System.out.println("toyota start");
    }
}
class main12{
    public static void main(String[] args) {
        BMW b=new BMW();
        Toyota t=new Toyota();
        b.start();
        t.start();
        b.brake();
        t.brake();


    }
}
