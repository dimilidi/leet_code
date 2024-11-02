package P16_DiameterOfBinaryTree;

import static P16_DiameterOfBinaryTree.TreeNode.createBinaryTree;

public class DiameterOfBinaryTree_Recursion {

    // Variable to keep track of the maximum diameter found
    int diameter = 0;

    // Method to find the diameter of the binary tree
    public int findDiameter(TreeNode node) {
        diameter = 0; // Reset diameter for each tree
        findHeight(node); // Calculate height and update diameter
        return diameter; // Return the calculated diameter
    }

    // Helper method to calculate height of the tree and update diameter
    private int findHeight(TreeNode node) {
        if (node == null) return 0; // Base case: if the node is null, return 0

        // Recursively find the height of the left and right subtrees
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        // Update the maximum diameter found
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current node
        // Height is 1 + max of the heights of the left and right children
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

// TC - O(N)   (Tree traversal)
// SC - O(N)   (Recursive call stack)
