package P13_MajorityElement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElement_Map {

    public static int majorityElementMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        AtomicInteger result = new AtomicInteger(-1);

        map.entrySet().stream().filter(e -> e.getValue() > nums.length / 2).forEach(e -> result.set(e.getKey()));

        return result.get();

    }
    // T O(n)
    // M O(n)
}
