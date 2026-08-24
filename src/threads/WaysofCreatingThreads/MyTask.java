package threads.WaysofCreatingThreads;

class MyTask1 implements Runnable {
    public void run(){
        System.out.println("thread is running in task 1");
    }
}
class MyTask2 implements Runnable {
    public void run(){
        System.out.println("thread is running in task 2");
    }
}
class Demo{
    public static void main(String[] args) {
//        System.out.println("Main thread");
        MyTask1 task1=new MyTask1();
        MyTask2 task2=new MyTask2();
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
//        System.out.println("Main Thread");
        t2.start();
        System.out.println("Main Thread");
    }
}
