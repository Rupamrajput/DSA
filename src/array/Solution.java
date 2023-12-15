package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int[] positions = Arrays.copyOf(nums, nums.length);
        int collisionCount = 0;

        for (char command : s.toCharArray()) {
            for (int i = 0; i < positions.length; i++) {
                if (command == 'L') {
                    positions[i] -= 1;
                } else if (command == 'R') {
                    positions[i] += 1;
                }

                // Check for collisions
                int count = 0;
                for (int j = 0; j < positions.length; j++) {
                    if (positions[j] == positions[i]) {
                        count++;
                    }
                }
                if (count > 1) {
                    collisionCount++;
                }
            }
        }

        int totalDistance = 0;
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions.length; j++) {
                totalDistance += Math.abs(positions[i] - positions[j]);
            }
        }

        int totalDistanceAfterD = collisionCount * d;
        return totalDistanceAfterD % (int) (Math.pow(10, 9) + 7);
    }
    public static int sum(int[] nums, String s, int d) {
        int[] positions = Arrays.copyOf(nums, nums.length);
        int[] directions = new int[positions.length];
        int collisionCount = 0;

        for (char command : s.toCharArray()) {
            // Update directions based on commands
            for (int i = 0; i < positions.length; i++) {
                if (command == 'L') {
                    directions[i] -= 1;
                } else if (command == 'R') {
                    directions[i] += 1;
                }
            }

            // Update positions and check for collisions
            Set<Integer> uniquePositions = new HashSet<>();
            for (int i = 0; i < positions.length; i++) {
                positions[i] += directions[i];
                if (!uniquePositions.add(positions[i])) {
                    collisionCount++;
                }
            }
        }

        long totalDistance = 0;
        for (int i = 0; i < positions.length - 1; i++) {
            for (int j = i + 1; j < positions.length; j++) {
                totalDistance += Math.abs(positions[i] - positions[j]);
                totalDistance %= 1000000007; // Apply modulo after each addition to avoid overflow
            }
        }

        long totalDistanceAfterD = (collisionCount * (long) d) % 1000000007;

        return (int) ((totalDistanceAfterD * totalDistance) % 1000000007);
    }

}
