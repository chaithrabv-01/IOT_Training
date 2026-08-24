package oopsbasics.constructor;

public class copyconstructor {
    String name;
    copyconstructor(String name){
        this.name=name;
    }
    copyconstructor(copyconstructor c1){
        this.name=c1.name;
    }

    public static void main(String[] args) {
        copyconstructor c1=new copyconstructor("Chaithra");
        copyconstructor c2=new copyconstructor(c1);
    }
}
