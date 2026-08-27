package leetcode.subarray;

public class SubArray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        for (int i=0;i<nums.length;i++){
            max=nums[i]+nums[i+1];
            if(max<0){
                max=nums[i+1]+nums[i+2];
            }else{
                max=nums[i]+nums[i+2]+nums[i+3];
            }
        }
    }
}
