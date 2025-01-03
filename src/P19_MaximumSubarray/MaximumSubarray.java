package P19_MaximumSubarray;

public class MaximumSubarray {
    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {5,4,-1,7,8};

        System.out.printf("Kadan's: %d%n",maxSubArrayKadans(nums));
        System.out.printf("Divide and conquer: %d%n",maxSubArrayDivideAndConquer(nums));
        System.out.printf("Kadan's: %d%n",maxSubArrayKadans(nums2));
        System.out.printf("Divide and conquer: %d%n",maxSubArrayDivideAndConquer(nums2));
    }

    // (Kadane's Algorithm)
    // TC: O(n), SC: O(1)
    public static int maxSubArrayKadans (int[] nums){
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }


    // Divide and Conquer
    // Time Complexity: O(nlogn) - recursion
    // Space Complexity: O(logn) - recursion
    public static int maxSubArrayDivideAndConquer (int[] nums){
        int left = 0;
        int right = nums.length - 1;
        return  maxSum(nums, left, right);
    }

    private static int maxSum(int[] nums, int left, int right) {
        if(left < right){
            int mid = (left + right) / 2;
            int leftSubSum = maxSum(nums, left, mid);
            int rightSubSum = maxSum(nums, mid + 1, right);
            int centerSubSum = findCSS(nums, left, mid, right);
            return Math.max(Math.max(leftSubSum, rightSubSum),centerSubSum);

        } else {
            return nums[left];
        }

    }

    private static int findCSS(int[] nums, int left, int mid, int right) {
        int leftMax = nums[mid];
        int sumLeft = nums[mid];
        int rightMax = nums[mid + 1];
        int sumRight = nums[mid + 1];

        for (int i = mid + 2; i <= right; i++) {
            sumRight = sumRight + nums[i];
            if(sumRight > rightMax){
                rightMax = sumRight;
            }
        }

        for (int i = mid - 1; i >= left; i--) {
            sumLeft = sumLeft + nums[i];
            if(sumLeft > leftMax){
                leftMax = sumLeft;
            }
        }

        return leftMax + rightMax;
    }
}
