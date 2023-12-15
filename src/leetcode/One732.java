package leetcode;

public class One732 {
    /**
     * Input: gain = [-5,1,5,0,-7]
     * Output: 1
     * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
     *
     */
    public int largestAltitude(int[] gain) {
        int max =0;
        int sum =0;
        for(int i = 0; i<gain.length;i++){
            sum+=gain[i];
            if(sum>max) max = sum;
        }
        return max;
    }
}
