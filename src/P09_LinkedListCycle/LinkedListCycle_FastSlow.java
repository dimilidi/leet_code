package P09_LinkedListCycle;

public class LinkedListCycle_FastSlow {

    public static boolean hasCycleFastSlow(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

    // Time Complexity: O(n),
        // where n is the number of nodes in the list.
        // This is the optimal time complexity for this problem because every node must be checked.
    //  Space Complexity: O(1),
         //  only using two pointers regardless of the list size.
}
