package P13_MajorityElement;

public class MajorityElement_BoyerMoore {
    public static int majorityElementBoyerMoore(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    // T O(n)
    // M O(1)
}

