package recursion;

public class recusionsumofn {
   static int sum(int n){
       if(n==1){
           return 1;
       }else{
           return n+ sum(n-1);
       }


    }

    public static void main(String[] args) {
        int num=5;
        int result=sum(num);
        System.out.println(result);
    }
}
