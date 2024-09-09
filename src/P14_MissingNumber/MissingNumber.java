package P14_MissingNumber;

import static P14_MissingNumber.MissingNumber_Math.missingNumberMath;
import static P14_MissingNumber.MissingNumber_Sort.missingNumberSort;
import static P14_MissingNumber.MissingNumber_XOR.missingNumberXOR;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};

        System.out.println("Sort approach:");
        System.out.println(missingNumberSort(nums));
        System.out.println(missingNumberSort(nums2));
        System.out.println(missingNumberSort(nums3));

        System.out.println("Math approach:");
        System.out.println(missingNumberMath(nums));
        System.out.println(missingNumberMath(nums2));
        System.out.println(missingNumberMath(nums3));

        System.out.println("XOR approach:");
        System.out.println(missingNumberXOR(nums));
        System.out.println(missingNumberXOR(nums2));
        System.out.println(missingNumberXOR(nums3));
    }
}
