package arraysQues;

public class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        int soFarSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i: nums){
            soFarSum+=i;
            maxSum = Math.max(soFarSum,maxSum);
            if(soFarSum<0) soFarSum=0;
        }
        return maxSum;
    }
}
