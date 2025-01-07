package P21_SymetricTree;

import java.util.*;

public class NodeTree {

    Integer val;
    NodeTree left;
    NodeTree right;

    NodeTree() {}
    NodeTree(Integer val) { this.val = val; }
    NodeTree(Integer val, NodeTree left, NodeTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Build tree from Integer[] with nulls
    public static NodeTree buildTree(Integer[] nums, int start, int end) {
        if (start > end || nums[start] == null) {
            return null;
        }

        NodeTree node = new NodeTree(nums[start]);

        // Recursively build the left and right subtrees
        node.left = buildTree(nums, 2 * start + 1, end);  // Left child index
        node.right = buildTree(nums, 2 * start + 2, end); // Right child index

        return node;
    }

    // Helper method to print the tree in level order (BFS)
    public static String levelOrder(NodeTree root) {
        if (root == null) {
            return "[]";
        }

        List<Integer> result = new ArrayList<>();
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            NodeTree current = queue.poll();
            if (current != null) {
                result.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                result.add(null); // Add null for missing children
            }
        }

        // Remove trailing nulls
        while (!result.isEmpty() && result.get(result.size() - 1) == null) {
            result.remove(result.size() - 1);
        }

        return result.toString();
    }
}
