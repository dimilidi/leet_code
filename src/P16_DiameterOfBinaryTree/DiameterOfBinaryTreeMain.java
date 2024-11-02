package P16_DiameterOfBinaryTree;

import static P16_DiameterOfBinaryTree.TreeNode.createBinaryTree;

public class DiameterOfBinaryTreeMain {
    public static void main(String[] args) {
        DiameterOfBinaryTree_Recursion tree = new DiameterOfBinaryTree_Recursion();

        DiameterOfBinaryTree_Map tree_map = new DiameterOfBinaryTree_Map();

        // Sample input arrays to create binary trees
        int[] arr = new int[]{1, 2, 3, 4, 5}; // A binary tree with nodes 1, 2, 3, 4, 5
        int[] arr2 = new int[]{1, 2};         // A binary tree with nodes 1 and 2
        TreeNode node_1 = createBinaryTree(arr, 0); // Create the first binary tree
        TreeNode node_2 = createBinaryTree(arr2, 0); // Create the second binary tree

        // Calculate the diameters of recursive solution
        int diameter1 = tree.findDiameter(node_1);
        int diameter2 = tree.findDiameter(node_2);

        // Calculate the diameters of map-stack solution
        int diameter1_map = tree_map.diameterOfBinaryTree(node_1);
        int diameter2_map = tree_map.diameterOfBinaryTree(node_2);

        // Print the results
        System.out.println(diameter1);
        System.out.println(diameter2);

        System.out.println(diameter1_map);
        System.out.println(diameter2_map);
    }
}
