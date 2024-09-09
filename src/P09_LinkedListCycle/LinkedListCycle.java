package P09_LinkedListCycle;

import static P09_LinkedListCycle.LinkedListCycle_FastSlow.hasCycleFastSlow;
import static P09_LinkedListCycle.LinkedListCycle_HashSet.hasCycleHash;
import static P09_LinkedListCycle.ListNode.*;

public class LinkedListCycle {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, -4};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};

        ListNode head = createListNode(arr);
        ListNode head1 = createListNode(arr2);
        ListNode head2 = createListNode(arr3);

        // Simulate a cycle where tail connects to the node at given position
        createCycle(head, 1);
        createCycle(head1, 0);
        createCycle(head2, -1);

        System.out.println("FastSlow-> Has Cycle: " + hasCycleFastSlow(head));  // Has Cycle: true
        System.out.println("FastSlow-> Has Cycle: " + hasCycleFastSlow(head1));  // Has Cycle: true
        System.out.println("FastSlow-> Has Cycle: " + hasCycleFastSlow(head2));  // Has Cycle: false

        System.out.println("Hash-> Has Cycle: " + hasCycleHash(head));  // Has Cycle: true
        System.out.println("Hash-> Has Cycle: " + hasCycleHash(head1));  // Has Cycle: true
        System.out.println("Hash-> Has Cycle: " + hasCycleHash(head2));  // Has Cycle: false
    }
}

