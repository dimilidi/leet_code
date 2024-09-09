package P15_ReverseString;

public class ReverseString_SB {

    public static void reverseStringSB(char[] s) {
        StringBuilder sb = new StringBuilder();

        // Append characters in reverse order to StringBuilder
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
        }

        // Convert StringBuilder back to char array
        char[] reversedArray = sb.toString().toCharArray();
        System.out.println("Reversed string: " + sb.toString());

        // Copy reversed characters back to the original char array 's'
        for (int i = 0; i < s.length; i++) {
            s[i] = reversedArray[i];
        }
    }

    // T: O(n) ->  iterate over the array
    // M: O(n) -> extra space for StringBuilder and reversed array
}
