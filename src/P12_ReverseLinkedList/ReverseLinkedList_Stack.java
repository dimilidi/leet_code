package P12_ReverseLinkedList;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseLinkedList_Stack {

    public static ListNode reverseListStack(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Deque<ListNode> stack = new ArrayDeque<>();

        ListNode curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        ListNode newHead = stack.pop();
        ListNode newCurr = newHead;

        while (!stack.isEmpty()) {
            newCurr.next = stack.pop();
            newCurr = newCurr.next;
        }

        newCurr.next = null;

        return newHead;
    }

    // T O(n)
    // M O(n) -> data structure
}



