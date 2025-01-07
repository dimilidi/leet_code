package P21_SymetricTree;

import java.util.*;

public class SymmetricTree {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1,2,2,3,4,4,3};
        Integer[] nums2 = new Integer[] {1,2,2,null,3,null,3};

        NodeTree root = NodeTree.buildTree(nums, 0, nums.length - 1);
        NodeTree root2 = NodeTree.buildTree(nums2, 0, nums.length - 1);

        System.out.println(isSymmetric(root));
        System.out.println(isSymmetric(root2));

        System.out.println(isSymmetricRecursion(root));
        System.out.println(isSymmetricRecursion(root2));
    }

    // TC - O(n);  visit each node in the tree exactly once
    // SC- O(n) - queues with nodes
    public static boolean isSymmetric(NodeTree root) {
        if (root == null) return true;

        Deque<NodeTree> leftTree = new LinkedList<>();
        Deque<NodeTree> rightTree = new LinkedList<>();

        leftTree.offer(root.left);
        rightTree.offer(root.right);

        while(!leftTree.isEmpty() && !rightTree.isEmpty()) {
            NodeTree leftNode = leftTree.poll();
            NodeTree rightNode = rightTree.poll();

            if (leftNode == null && rightNode == null) continue;

            if (leftNode == null || rightNode == null) return false;

            if (!leftNode.val.equals(rightNode.val)) return false;

            leftTree.offer(leftNode.left);
            leftTree.offer(leftNode.right);
            rightTree.offer(rightNode.right);
            rightTree.offer(rightNode.left);
        }
        return true;
    }

    // TC - O(n) - Visit each node in the tree exactly once;
    // SC- O(n) - The call stack can go as deep as the height of the tree -
        // O(n) in the worst case (for a skewed tree) and O(log n) for a balanced tree.
    public static boolean isSymmetricRecursion(NodeTree root) {
        if (root == null) return true;
        return  dfs(root.left, root.right);
    }

    public static boolean dfs(NodeTree left, NodeTree right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (left.val == right.val &&
                dfs(left.left, right.right) &&
                dfs(left.right, right.left));
    }
}
