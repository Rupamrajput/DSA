package array;

import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
    public static int sumDistance(int[] nums, String s, int d) {
        int[] positions = Arrays.copyOf(nums, nums.length);
        char[] directions = new char[positions.length];

        int dir = 0;
        for (char command : s.toCharArray()) {
            directions[dir] = command;
            dir++;
        }
        while (d>0){
            HashMap<Integer,Integer> checkDup = new HashMap<>();
            for(int i=0; i< nums.length;i++){
                // Update directions based on commands

                if (directions[i] == 'L') {
                    positions[i] -= 1;
                }
                else if (directions[i] == 'R') {
                    positions[i] += 1;
                }


                if(checkDup.containsKey(positions[i])){
                    directions[i] = directions[i] == 'R'? 'L' : 'R';
                    directions[checkDup.get(positions[i])] = directions[checkDup.get(positions[i])] == 'R'? 'L' : 'R';
                }
                else checkDup.put(positions[i],i);

            }
            d--;
        }

        int totalDistance = 0;
        for (int i = 0; i < positions.length - 1; i++) {
            for (int j = i + 1; j < positions.length; j++) {
                totalDistance += Math.abs(positions[i] - positions[j]);
                totalDistance %= 1000000007; // Apply modulo after each addition to avoid overflow
            }
        }



        return totalDistance;
    }
}
