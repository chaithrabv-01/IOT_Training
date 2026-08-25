package threads.Synchronization;
class counter {
    int count=0;
    synchronized void increment(){
        count++;
//        System.out.println(count);
    }
}
public class Demo {
    public static void main(String[] args) {
        counter c=new counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
        e.printStackTrace();}
        System.out.println("count is" + c.count);
    }
}
