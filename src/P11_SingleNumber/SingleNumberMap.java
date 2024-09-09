package P11_SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberMap {

    public static int singleNumberMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }

    // Time Complexity: O(n)
        // building the HashMap is  O(n) where n is the length of the nums array.
    // Space Complexity: O(n)
        //  iterating over the entries in the map
}
