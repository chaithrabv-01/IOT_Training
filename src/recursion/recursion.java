package recursion;

public class recursion {
    static void print1(int n){
         if(n==10){
             return;
         }
         System.out.println(n);
         print1(n+1);
}
public static void main(String[] args){
         print1(1);
}
}