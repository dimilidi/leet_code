package P10_MaximumDepthOfBinaryTree;

import java.util.HashMap;
import java.util.Map;

import static P10_MaximumDepthOfBinaryTree.TreeNode.createTree;

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        Integer[] values = {3, 9, 20, null, null, 15, 7};
        Integer[] values2 = {1,null,2};

        TreeNode root = createTree(values);
        TreeNode root2 = createTree(values2);

        System.out.println("Max Depth: " + maxDepth(root));  //  3
        System.out.println("Max Depth: " + maxDepth(root2));  //  2





    }

    public static int maxDepth(TreeNode root) {
        // Base case: if the current node is null, we've hit the bottom of the tree
        if (root == null) return 0;

        // Recursive case: calculate the depth of the left and right subtrees
        // Return the maximum of the two subtree depths, plus 1 to account for the current node
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // Time Complexity: O(n),
        // where n is the number of nodes in the tree.
    //Space Complexity: O(h),
        // where h is the height of the tree.
        //  Balanced tree -> O(logN),
        //  Unbalanced tree -> O(logH),
}
