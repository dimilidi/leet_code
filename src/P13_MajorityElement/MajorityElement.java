package P13_MajorityElement;

import static P13_MajorityElement.MajorityElement_BoyerMoore.majorityElementBoyerMoore;
import static P13_MajorityElement.MajorityElement_Map.majorityElementMap;
import static P13_MajorityElement.MajorityElement_Sort.majorityElementSort;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr1 = {2,2,1,1,1,2,2};
        int[] arr2 = {3, 2, 3};

        System.out.println(majorityElementBoyerMoore(arr1));
        System.out.println(majorityElementBoyerMoore(arr2));

        System.out.println(majorityElementMap(arr1));
        System.out.println(majorityElementMap(arr2));

        System.out.println(majorityElementSort(arr1));
        System.out.println(majorityElementSort(arr2));
    }
}
