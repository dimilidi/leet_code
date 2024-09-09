package P14_MissingNumber;

public class MissingNumber_Math {
    public static int missingNumberMath(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    // T:  O(n), where n is the length of the array; we iterate through the array once to calculate the sum of its elements.
    // M:  O(1) because we use a constant amount of extra space for the variables
}
