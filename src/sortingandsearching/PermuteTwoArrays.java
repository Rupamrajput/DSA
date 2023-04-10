package sortingandsearching;

import java.util.Arrays;

public class PermuteTwoArrays {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        while (i<n){
            if(a[i]+b[n-i-1]<k) return false;
            i++;
        }
        return true;
    }
}
