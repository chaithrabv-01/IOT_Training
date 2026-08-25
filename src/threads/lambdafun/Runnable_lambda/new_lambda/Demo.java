package threads.lambdafun.Runnable_lambda.new_lambda;

public class Demo {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("task1 is running");
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("task 2");
            }
        });
        t1.start();
        t2.start();
    }
}
