package P12_ReverseLinkedList;


public class ReverseLinkedList_Loop {

    public static ListNode reverseListLoop(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev; // reverse pointer
            prev = current; // update node
            current = next; // move to the next node

        }

        return prev;
    }
    // T O(n)
    // M O(1) -> using pointers and no data structure

    static void print(ListNode head) {
        ListNode current = head;

        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }
}
