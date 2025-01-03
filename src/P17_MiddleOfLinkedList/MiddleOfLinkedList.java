package P17_MiddleOfLinkedList;

import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode nodeList = ListNode.createNodeList(List.of(1,2,3,4,5));
        ListNode middle = ListNode.middleNode(nodeList);

        System.out.print(middle.getVal());
    }
}
