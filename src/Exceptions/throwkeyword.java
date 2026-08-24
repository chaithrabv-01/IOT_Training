package Exceptions;

public class throwkeyword {
    public static void main(String[] args) {
        int age=5;
        if(age>=18){
            System.out.println("eligible");
        }
        else{
            throw new RuntimeException("not eligile");
        }
    }
}
