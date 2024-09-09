package P02_ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));

    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();  // Use Deque as a stack
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');  // Push expected closing bracket
            } else if (c == '{') {
                stack.push('}');  // Push expected closing bracket
            } else if (c == '[') {
                stack.push(']');  // Push expected closing bracket
            } else if (stack.isEmpty() || c != stack.pop()) {  // Check if top matches the closing bracket
                return false;
            }
        }
        return stack.isEmpty();  // Ensure all brackets were matched
    }
    // Time Complexity: O(n)
        // -> iterating through the String, where n is the length of the string.
        // -> The operations push() and pop() on a Deque (specifically ArrayDeque) are both O(1) operations.
        // This is because ArrayDeque is implemented as a resizable array

    //Space Complexity:  O(n)
        // -> in the worst case, if the string consists only of opening brackets, all of them will be pushed onto the stack

}

