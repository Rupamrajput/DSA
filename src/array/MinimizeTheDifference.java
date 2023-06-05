package array;

import java.util.Arrays;

public class MinimizeTheDifference {

    int getMinDiff(int[] arr, int n, int k) {
        if (n == 1 || n==0) return 0;
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];
        for(int i =1; i<n;i++){
            if(arr[i]-k < 0) continue;
            int max = Math.max(arr[i-1]+k,arr[n-1]-k);
            int min = Math.min(arr[0]+k,arr[i]-k);
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}
