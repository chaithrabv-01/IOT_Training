package Generics;

public class Test1<T>{
    T obj;
    Test1(T obj){
        this.obj=obj;
    }
}
class driver{
    public static void main(String[] args) {
        Test1<Integer> obj1=new Test1<>(15);
        Test1<String> obj2=new Test1<>("hello");
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
