package P05_ValidPalindrome;

public class ValidPalindrome_2 {


    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));   // false
        System.out.println(isPalindrome("race a car"));  // false
        System.out.println(isPalindrome(" "));  // true
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true

    }

    public static boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }


    // Time Complexity: O(n) -  the loop runs O(n) times
    //  Space Complexity: O(1) - no additional data structures used
}
