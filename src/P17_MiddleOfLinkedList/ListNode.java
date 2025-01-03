package P17_MiddleOfLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    private int val;
    private ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public ListNode getNext() {
        return this.next;
    }

    public int getVal() {
        return this.val;
    }

    public static ListNode createNodeList(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        ListNode head = new ListNode(list.get(0));
        ListNode current = head;

        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }

        return head;
    }


    // TC:O(n); SC: O(1)
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;  // Slow pointer (moves one step at a time)
        ListNode fast = head;  // Fast pointer (moves two steps at a time)

        // Move fast pointer two steps at a time and slow pointer one step at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer one step
            fast = fast.next.next;  // Move fast pointer two steps
        }

        // Slow pointer will now be at the middle of the list
        return slow;
    }
}
