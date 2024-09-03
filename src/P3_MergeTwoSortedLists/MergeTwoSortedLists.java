package P3_MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

        // Create linked lists for testing
        ListNode list1 = createListNode(new int[]{1, 2, 4});
        ListNode list2 = createListNode(new int[]{1, 3, 4});
        ListNode list3 = createListNode(new int[]{});
        ListNode list4 = createListNode(new int[]{});
        ListNode list5 = createListNode(new int[]{0});

        // Test cases
        System.out.println("Merged list1 and list2:");
        printListNode(mergeTwoLists(list1, list2)); // Expected: 1 1 2 3 4 4

        System.out.println("Merged list3 and list4:");
        printListNode(mergeTwoLists(list3, list4)); // Expected: ([])

        System.out.println("Merged list3 and list1:");
        printListNode(mergeTwoLists(list3, list5)); // Expected:([0])
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0); // the starting point of the merged list
        ListNode curr = head; // pointer to build the new merged list

        // Traverse both lists while neither is exhausted.
        while (list1 != null && list2 != null) {
            // Compare the current nodes of both lists.
            if (list1.val < list2.val) {
                // If list1's current node is less than or equal to list2's current node,
                // append list1's node to the merged list.
                curr.next = list1;
                list1 = list1.next; // Move to the next node in list1.
            } else {
                // Otherwise, append list2's node to the merged list.
                curr.next = list2;
                list2 = list2.next; // Move to the next node in list2.
            }
            curr = curr.next; // Move the current pointer to the newly added node.
        }

        // At this point, one of the lists is exhausted.
        // Attach the remaining nodes of the non-exhausted list to the merged list.
        if (list1 != null) {
            curr.next = list1;
        } else if (list2 != null) {
            curr.next = list2;
        }

        // Return the merged sorted list.
        return head.next;
    }

    // Time Complexity  ->  O(n + m), where n and m are the lengths of the two input lists.

    // Method to create a linked list from an array of integers
    private static ListNode createListNode(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print the linked list
    private static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println(); // Print a newline at the end
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
