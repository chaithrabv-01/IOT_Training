package Exceptions;

public class e2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("divide by zero is not possible");
            System.out.println("array index out of bound");

        }
    }
}
