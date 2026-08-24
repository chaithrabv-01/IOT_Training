package oopsbasics.withattribute;

public class car {
    String Brand;
    int manuDate;
    car(String Brand,int manuDate){
        this.Brand=Brand;
        this.manuDate=manuDate;

    }
    void printdetails(){
        System.out.println(Brand);
        System.out.println(manuDate);
    }
    public static void main(String[] args) {
        car c1=new car("BMW",2000);
        c1.printdetails();
    }

}
