package oopsbasics.inheritance.Exampleforinterface;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("Inside payment");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("paying through upi");
    }
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("paying through credit cards");
    }
    public void refund(){
        System.out.println("inside creditcard");
    }
}
class Cash implements Payment{
    public void pay(){
        System.out.println("paying through credit cards");}

}
class DriverCode{
    public static void main(String[] args) {
        Payment p=new UPI();
        Payment c=new CreditCard();
        p.pay();
        c.pay();
        c.refund();
    }
}

