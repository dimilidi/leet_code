package P24_HouseRobber;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1})); // 1
        System.out.println(rob(new int[]{2,7,9,3,1})); // 12
        System.out.println(rob(new int[]{1, 2, 3, 1}));  // 4

        System.out.println(robSpaceEfficient(new int[]{1,1})); // 1
        System.out.println(robSpaceEfficient(new int[]{2,7,9,3,1})); // 12
        System.out.println(robSpaceEfficient(new int[]{1, 2, 3, 1}));  // 4
    }

    // TC - O(n) -> loop, SC - O(n) -> array for storing
    public static int rob(int[] nums) {
        if(nums.length < 2) return nums[0];

        // Array to store memoized max values at each value
        int[] max = new int[nums.length];

        // Memoize max at first 2 indexes
        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);

        // Use memoized elements to compute the rest max values
        for(int i = 2; i < nums.length; i++) {
            // Formula
            max[i] = Math.max(max[i-2] + nums[i], max[i-1]);
        }

        return max[max.length - 1];
    }

    public static int robSpaceEfficient(int[] nums) {
        if (nums.length == 1) return nums[0];

        // Initialize variables for the two previous max values
        int prev2 = 0; // Max value up to house i-2
        int prev1 = 0; // Max value up to house i-1

        for (int num : nums) {
            // Compute the current max value
            int current = Math.max(prev2 + num, prev1);

            // Update prev2 and prev1 for the next iteration
            prev2 = prev1;
            prev1 = current;
        }

        // The last computed max value is the answer
        return prev1;
    }

}
