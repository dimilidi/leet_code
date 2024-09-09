package P11_SingleNumber;

public class SingleNumberXOR {

    // XOR is comparing the binary digits and determining whether the bits are the same or different.
    // XOR Rule 1: If you "XOR" a number with itself, it disappears:
        //x ^ x = 0
    //XOR Rule 2: If you "XOR" a number with 0, it stays the same:
        //x ^ 0 = x

    public static int singleNumberXOR(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }


    // Time Complexity: O(N), where N is the number of elements in the array. We iterate through the array once.
    // Space Complexity: O(1), because we use only a single variable result for XOR operations, requiring constant extra space
}
