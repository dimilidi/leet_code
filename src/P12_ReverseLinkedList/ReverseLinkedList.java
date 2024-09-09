package P12_ReverseLinkedList;

import static P12_ReverseLinkedList.ListNode.createListNode;
import static P12_ReverseLinkedList.ReverseLinkedList_Loop.*;

public class ReverseLinkedList {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1, 2};


        ListNode listNode = createListNode(arr);
        ListNode listNode2 = createListNode(arr2);
        ListNode listNode3 = createListNode(arr3);

        // Print the original list
        System.out.print("Original List1: ");
        print(listNode);
        System.out.print("Original List2: ");
        print(listNode2);
        System.out.print("Original List3: ");
        print(listNode3);

        // Reverse the list
        ListNode reversedList = reverseListLoop(listNode);
        ListNode reversedList2 = reverseListLoop(listNode2);
        ListNode reversedList3 = reverseListLoop(listNode3);

        // Print the reversed list
        System.out.print("Reversed List1: ");
        print(reversedList);
        System.out.print("Reversed List2: ");
        print(reversedList2);
        System.out.print("Reversed List3: ");
        print(reversedList3);
    }
}
