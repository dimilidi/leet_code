package P18_ConvertSortedArrayToBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    protected static TreeNode buildTree(int[] nums, int start, int end) {
        // Base case: If the range is invalid, return null
        if (start > end) {
            return null;
        }

        // Find the middle index
        int middle = start + (end - start) / 2;

        // Create the root node with the middle value
        TreeNode node = new TreeNode(nums[middle]);

        // Recursively construct the left and right subtrees
        node.left = buildTree(nums, start, middle - 1); // Left subarray
        node.right = buildTree(nums, middle + 1, end);  // Right subarray

        return node; // Return the current root node
    }

    // Function to print tree in level order (BFS)
    public static String levelOrder(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            } else {
                result.add(null); // Add null for missing children
            }
        }

        // Remove trailing nulls (optional, based on the problem description)
        while (!result.isEmpty() && result.get(result.size() - 1) == null) {
            result.remove(result.size() - 1);
        }

        // Convert list to string representation
        return result.toString();
    }
}
