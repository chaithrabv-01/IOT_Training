package Generics;

public class Test2<K,V>{
    K key;
    V val;
            Test2(K key,V val){
                this.key=key;
                this.val=val;
    }
}
class Driver2{
    public static void main(String[] args) {
        Test2<String,Integer> obj1=new Test2("hello",12);
        System.out.println(obj1.key);
        System.out.println(obj1.val);
    }
}
