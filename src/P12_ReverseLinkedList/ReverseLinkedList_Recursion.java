package P12_ReverseLinkedList;

public class ReverseLinkedList_Recursion {
    public static ListNode reverseListRecursion(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = head; // current

        if(head.next != null) {
            newHead = reverseListRecursion(head.next);
            head.next.next = head; // reverse pointer between next node and head
        }
        head.next = null; // head becomes the new tail

        return newHead;
    }
    // T O(n)
    // M O(n) -> recursion stack

}
