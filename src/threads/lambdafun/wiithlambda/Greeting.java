package threads.lambdafun.wiithlambda;

interface Greeting {
    void sayHello();
}
class Demo{
    public static void main(String[] args) {
        Greeting g=()-> System.out.println("hello");
        g.sayHello();
    };
}
