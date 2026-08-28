package Strings;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(4,"a");
        System.out.println(sb);
        sb.replace(5,8,"c");
        System.out.println(sb);
    }
}
