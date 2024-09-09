package P13_MajorityElement;

import java.util.Arrays;
import java.util.Collections;

public class MajorityElement_Sort {
    public static int majorityElementSort(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();

        return sorted[sorted.length / 2];
    }
     // T O(nlog(n)) -> sorting
}
