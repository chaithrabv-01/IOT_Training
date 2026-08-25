package threads.lambdafun.wihtoutlambda;

interface Greeting {
    void sayHello();

}
class Demo{
    public static void main(String[] args) {
        Greeting g=new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("hello world");
            }
        };
    }
}
