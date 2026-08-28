package Strings;

public class StringBuilderEx {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" world");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(4, "a");
        System.out.println(sb);

        sb.replace(5, 8, "c");
        System.out.println(sb);
    }
}