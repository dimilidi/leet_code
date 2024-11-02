package P16_DiameterOfBinaryTree;

import static P16_DiameterOfBinaryTree.TreeNode.createBinaryTree;

public class DiameterOfBinaryTree {

    // Variable to keep track of the maximum diameter found
    int diameter = 0;

    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        // Sample input arrays to create binary trees
        int[] arr = new int[]{1, 2, 3, 4, 5}; // A binary tree with nodes 1, 2, 3, 4, 5
        int[] arr2 = new int[]{1, 2};         // A binary tree with nodes 1 and 2
        TreeNode node_1 = createBinaryTree(arr, 0); // Create the first binary tree
        TreeNode node_2 = createBinaryTree(arr2, 0); // Create the second binary tree

        // Calculate the diameters for the two trees
        int diameter1 = tree.findDiameter(node_1);
        int diameter2 = tree.findDiameter(node_2);

        // Print the results
        System.out.println(diameter1);
        System.out.println(diameter2);
    }

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
