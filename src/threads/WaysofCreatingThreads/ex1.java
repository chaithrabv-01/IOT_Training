package threads.WaysofCreatingThreads;

class ex1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread is Running" +i);
        }
    }
}

class Demo1 {

    public static void main(String[] args) {

        ex1 t = new ex1();

        t.start();  // creates a new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread running" +i);


        }
    }
}
