package P14_MissingNumber;

public class MissingNumber_XOR {
    public static int missingNumberXOR(int[] nums) {
        int xor = 0;

        // XOR all the numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    // T: O(n) -> array iteration
    // M: 0(1) -> no additional data structure
}
