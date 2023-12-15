package arraysQues;

public class ProductOfArrayExceptSelf {
    public static int[] productOfArray(int[] arr){
        int n = arr.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for(int i = 1; i<n;i++){
            answer[i] = answer[i-1]*arr[i-1];
        }
        int fromRight = 1;
        for(int i=n-1; i>=0;i--){
            answer[i] *= fromRight;
            fromRight *= arr[i];
        }
        return answer;
    }
}
