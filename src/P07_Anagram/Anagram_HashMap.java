package P07_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Anagram_HashMap {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }


    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
     //  Time Complexity: O(n), where n is the total number of characters in both strings
}
