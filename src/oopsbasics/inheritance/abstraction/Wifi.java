package oopsbasics.inheritance.abstraction;

public interface Wifi {
    void connect();
}
class Laptop implements Wifi{
    public void connect(){
        System.out.println("laptop connected to wifi");
    }
}
class phone implements Wifi{
    public void connect(){
        System.out.println("phone connected to wifi");
    }
}
class main{
    public static void main(String[] args) {
        Laptop l=new Laptop();
        phone p=new phone();
        l.connect();
        p.connect();
    }
}
