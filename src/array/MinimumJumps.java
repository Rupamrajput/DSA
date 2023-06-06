package array;

public class MinimumJumps {

    static int minJumps(int[] nums){

        // If nums.length < 2, means that we do not
        // need to move at all.
        if (nums == null || nums.length < 2) {
            return 0;
        }

        // First set up current region, which is
        // from 0 to nums[0].
        int index = 0;
        int region = nums[0];
        // Since the length of nums is greater than
        // 1, we need at least 1 step.
        int step = 1;

        // We go through all elements in the region. //2,1,0,3
        while (index <= region) {

            // If the right of current region is greater
            // than nums.length - 1, that means we are done.
            if (region >= nums.length - 1) {
                return step;
            }

            // We should know how far can we reach in current
            // region.
            int max = Integer.MIN_VALUE;
            for (; index <= region; index++) {
                max = Math.max(max, index + nums[index]);
            }

            // If we can reach far more in this round, we update
            // the boundary of current region, and also add a step.
            if (max > region) {
                index = region;
                region = max;
                step++;
            }
        }

        // We can not finish the job.
        return -1;
    }
}
