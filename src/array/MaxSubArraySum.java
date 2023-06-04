package array;

public class MaxSubArraySum {
    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{-2 ,1, -3, 4, -1, 2, 1, -5, 4},9));
    }

    long maxSubarraySum(int[] arr, int n) {
        long maxSum = arr[0], sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    //passed 63, got tle after that
    public static long maxSubArraySum(int arr[], int n){
        long ans = maxSubArraySum(arr,0,0,n,0);
        return ans == 0 ? -1 : ans;
    }

    public static long maxSubArraySum(int[] array, int max ,int i,int n,int maxSum){
        if(i==n) return Math.max(maxSum,max);
        if(max+array[i] >0){
            max +=array[i];
            return Math.max(maxSubArraySum(array, max, i+1,n,Math.max(maxSum,max))
                           , maxSubArraySum(array, array[i], i+1, n, Math.max(maxSum,array[i])));
        }

        return maxSubArraySum(array, 0, i+1,n,maxSum);
    }
}
