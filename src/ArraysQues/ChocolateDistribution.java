package ArraysQues;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        System.out.println(chocDistribution(arr,7));
    }
    public static int chocDistribution(int[] arr, int m){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++){
            if(arr[i+m-1]-arr[i]<minDiff) minDiff = arr[i+m-1]-arr[i];
        }
        return minDiff;
    }
}
