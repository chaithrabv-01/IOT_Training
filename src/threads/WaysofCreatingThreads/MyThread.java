package threads.WaysofCreatingThreads;

class MyThread extends Thread {
    public void run(){
        System.out.println("MyThread is Running");
    }
}
class Demo2{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        t.run();
        System.out.println("main thread running");
//        t.run();
//        t.start();
    }
}
