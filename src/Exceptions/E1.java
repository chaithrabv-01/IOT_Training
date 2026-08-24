package Exceptions;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j=2;
        try {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException e) {
            System.out.println("cant divide by zero");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("array index out of bpund");
        }
        finally {
            System.out.println("officially closed");
        }
        System.out.println("hello");
        }
        static{
            System.out.println("this is static");
        }
    }

