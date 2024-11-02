package P16_DiameterOfBinaryTree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createBinaryTree(int[] values, int index) {
        if(values == null || values.length == 0) return null;

        if (index >= values.length) {
            return null;
        }

        TreeNode node = new TreeNode(values[index]);
        node.left = createBinaryTree(values, 2 * index + 1);
        node.right = createBinaryTree(values, 2 * index + 2);

        return node;
    }
}