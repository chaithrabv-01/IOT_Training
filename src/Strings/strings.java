package Strings;

public class strings {

    public static void main(String[] args) throws InterruptedException {

        // ---------------- STRINGBUILDER ----------------

//        StringBuilder builder = new StringBuilder();
//
//        Thread t1 = new Thread(() -> {
//            synchronized (builder) {
//                builder.append("Hello ");
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            synchronized (builder) {
//                builder.append("Java ");
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("StringBuilder: " + builder);
//
//
//        // ---------------- STRINGBUFFER ----------------
//
//        StringBuffer buffer = new StringBuffer();
//
//        Thread t3 = new Thread(() -> {
//            buffer.append("Hello ");
//        });
//
//        Thread t4 = new Thread(() -> {
//            buffer.append("Java ");
//        });
//
//        t3.start();
//        t4.start();
//
//        t3.join();
//        t4.join();
//
//        System.out.println("StringBuffer: " + buffer);
//        StringBuilder sb=new StringBuilder();
//        sb.append("hello");
//        sb.append("chai");
//        System.out.println(sb);

        
        String s1=new String("hello");
        String s2="hello";
       // System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
