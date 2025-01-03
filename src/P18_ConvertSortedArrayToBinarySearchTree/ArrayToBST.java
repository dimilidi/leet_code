package P18_ConvertSortedArrayToBinarySearchTree;

public class ArrayToBST {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};

        TreeNode bst = TreeNode.sortedArrayToBST(nums);

        // Print the tree in level order
        System.out.println(TreeNode.levelOrder(bst));
    }
}
