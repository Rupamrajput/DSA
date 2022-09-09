package ArraysQues;

public class MinInRotArray {
    public static int findMin(int[] nums) {
        int min = nums[0];
        for(int i=1; i< nums.length;i++){
            if(nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return min;
    }
}
