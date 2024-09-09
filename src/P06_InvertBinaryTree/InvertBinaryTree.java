package P06_InvertBinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree {

    public static void main(String[] args) {
        Integer[] values = {4, 2, 7, 1, 3, 6, 9};
        Integer[] values2 = {2, 1, 3};
        Integer[] values3 = {};

        TreeNode root = createBinaryTree(values);
        TreeNode root2 = createBinaryTree(values2);
        TreeNode root3 = createBinaryTree(values3);

        TreeNode invertedTree = invertTree(root);
        TreeNode invertedTree2 = invertTree(root2);
        TreeNode invertedTree3 = invertTree(root3);

        printTree(invertedTree);
        printTree(invertedTree2);
        printTree(invertedTree3);

    }



    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode temp= root.left; // swap nodes
        root.left= root.right;
        root.right= temp;

        invertTree(root.left); // left rec call
        invertTree(root.right); // right rec call
        return root;
    }

    // Method to create the binary tree from a level-order array
    public static TreeNode createBinaryTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();

            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    // Helper function to print the tree in level-order
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        // Use a queue to traverse the tree in level-order
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}




/*    Approach:

    Employs a recursive approach to traverse the binary tree.
    At each node:
    Swaps the left and right subtrees.
    Recursively inverts the left and right subtrees.

    Time Complexity: O(n)

    The code visits each node of the tree once, resulting in linear time complexity with respect to the number of nodes (n).

    Space Complexity: O(h)

    The space complexity is determined by the maximum depth of the tree (h).
    In the worst case (a skewed tree), the recursion stack can reach a depth of h, leading to O(h) space usage.*/




class TreeNode {
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
}
