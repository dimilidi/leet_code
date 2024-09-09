package P09_LinkedListCycle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }


    // Method to create a linked list from an array of integers
    static ListNode createListNode(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Method to create a cycle in the linked list at the given position
    static void createCycle(ListNode head, int pos) {
        if (pos == -1) return;  // No cycle if pos is -1

        ListNode tail = head;
        ListNode cycleNode = head;

        // Move to the tail node
        while (tail.next != null) {
            tail = tail.next;
        }

        // Move cycleNode to the position where the cycle should start
        for (int i = 0; i < pos; i++) {
            cycleNode = cycleNode.next;
        }

        // Create the cycle by pointing tail's next to cycleNode
        tail.next = cycleNode;
    }
}