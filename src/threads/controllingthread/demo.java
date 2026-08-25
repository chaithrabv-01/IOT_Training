package threads.controllingthread;

public class demo {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println("task1 is running"+i);
                try{
                Thread.sleep(3000);}
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("task 2");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
