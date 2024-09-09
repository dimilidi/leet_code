package P14_MissingNumber;

import java.util.Arrays;

public class MissingNumber_Sort {

    public static int missingNumberSort(int[] nums) {
        // Step 1: Sort the array
        int[] sorted = Arrays.stream(nums).sorted().toArray();

        // Step 2: Traverse the sorted array to find the missing number
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] != i) {
                return i; // Missing number is found
            }
        }

        // Step 3: If no missing number is found, return the next number
        return sorted.length; // The missing number is the next in the sequence
    }

    // T: O(n log n) -> sorting
    // M: O(n) -> we create sorted array
}
