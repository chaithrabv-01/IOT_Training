package search.linearSearch;

public class LinearSearch {
    static int linearSearch(int key,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int key=3;
        int result=linearSearch(key,arr);
        if(result==-1){
            System.out.println("elemnent not found");
        }else{
            System.out.println("position" + result);
        }
    }
}
