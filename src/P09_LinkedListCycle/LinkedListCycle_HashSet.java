package P09_LinkedListCycle;

import java.util.HashSet;

public class LinkedListCycle_HashSet {

    public static boolean hasCycleHash(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            // If the current node has been seen before, there's a cycle
            if (visitedNodes.contains(current)) {
                return true;
            }
            visitedNodes.add(current);
            current = current.next;
        }

        return false;
    }
    // Time Complexity: O(n)
        // because each node is visited once.
    //Space Complexity: O(n)
        // since storing every visited node in the hash set.
        // This is less space-efficient than Floyd's Tortoise and Hare algorithm (Fast Slow), which uses constant space (O(1)).
}
