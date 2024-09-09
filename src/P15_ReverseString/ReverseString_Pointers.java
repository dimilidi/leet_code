package P15_ReverseString;

public class ReverseString_Pointers {

    public static  void reverseStringPointers(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.println(s);
    }

    // T: O(n)
    // M: O(1) -> reversal in-place  that uses a few extra variables which are independent of the input size n
}
