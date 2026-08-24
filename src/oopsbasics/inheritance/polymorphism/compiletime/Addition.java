package oopsbasics.inheritance.polymorphism.compiletime;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,float b){
        return a+b;
    }
}
class main1{
    public static void main(String[] args) {
        Addition a=new Addition();
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(1.2f,5.4f));

    }
}
