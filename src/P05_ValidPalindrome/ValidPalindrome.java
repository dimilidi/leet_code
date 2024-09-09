package P05_ValidPalindrome;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));   // false
        System.out.println(isPalindrome("race a car"));  // false
        System.out.println(isPalindrome(" "));  // true
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true

    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        String string = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < string.length(); i++ ) {
            char start = string.charAt(i);
            char end = string.charAt(string.length()-1 - i);

            if (start != end) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    // Time Complexity: O(n)  due to for loop.
    //  Space Complexity: O(n) due to the storage of the normalized string.
}
