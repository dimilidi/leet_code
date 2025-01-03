package P20_ClimbingStairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));

    }

    // Dynamic programming
    // TC: O(n) - loop
    // SC: O(n) - array for storing combination counts

    // Function to calculate the number of distinct ways to climb 'n' stairs
    public static int climbStairs(int n) {
        // If there is only 1 stair, there is only one way to climb it
        if (n == 1) return 1;

        // Create an array to store the number of ways to climb stairs up to 'n'
        int[] stairCombinationCounts = new int[n + 1];

        // Base cases:
        // There's 1 way to climb 1 stair (just take one step)
        stairCombinationCounts[1] = 1;
        // There are 2 ways to climb 2 stairs (1+1 or 2)
        stairCombinationCounts[2] = 2;

        // Calculate the number of ways to climb stairs for each step from 3 to 'n'
        for (int i = 3; i <= n; i++) {
            // The number of ways to climb 'i' stairs is the sum of:
            // - Ways to climb 'i-1' stairs (taking 1 step from there)
            // - Ways to climb 'i-2' stairs (taking 2 steps from there)
            stairCombinationCounts[i] = stairCombinationCounts[i - 1] + stairCombinationCounts[i - 2];
        }

        // Return the total number of ways to climb 'n' stairs
        return stairCombinationCounts[n];
    }
}
