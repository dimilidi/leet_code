package P07_Anagram;

public class Anagram_Array {
    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    // Time Complexity: O(n), where n is the length of the strings.
    // Space Complexity: O(1) (since the charCount array is always of size 26).
}
