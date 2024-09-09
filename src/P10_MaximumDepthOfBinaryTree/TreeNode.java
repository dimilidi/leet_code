package P10_MaximumDepthOfBinaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // Method to create the entire binary tree from an array
    public static TreeNode createTree(Integer[] values) {
        return createTreeHelper(values, 0);
    }

    // Helper method to recursively create the tree
    private static TreeNode createTreeHelper(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }

        // Create the current node
        TreeNode node = new TreeNode(values[index]);

        // Recursively create the left and right subtrees
        node.left = createTreeHelper(values, 2 * index + 1);
        node.right = createTreeHelper(values, 2 * index + 2);

        return node;
    }
}
