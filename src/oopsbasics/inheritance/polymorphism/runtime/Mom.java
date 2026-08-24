package oopsbasics.inheritance.polymorphism.runtime;
class Mom {
    void cook(){
        System.out.println("Indian");
    }

}
class daughter extends Mom{
    void cook(){
        System.out.println("Chinese");
    }
}
class main{
    public static void main(String[] args) {
        Mom m=new Mom();
        daughter d=new daughter();
        m.cook();
        d.cook();

    }
}