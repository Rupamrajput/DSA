package arraysQues;

public class MaxSubArrayProduct {
    public static int maxProduct(int[] nums) {
        int currMax = nums[0],currMin=nums[0];
        int result = nums[0];
        for(int j =1;j<nums.length;j++){
            int i = nums[j];
            int temp = currMax;
            currMax = Math.max(Math.max(currMax*i,currMin*i),i);
            currMin = Math.min(Math.min(temp*i,currMin*i),i);
            result = Math.max(result,currMax);
        }
        return result;
    }
}
