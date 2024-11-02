package P16_DiameterOfBinaryTree;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class DiameterOfBinaryTree_Map {
    public int diameterOfBinaryTree(TreeNode root) {

        Map<TreeNode, Integer> map = new HashMap<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        int diameter = 0;

        if (root != null)
            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();

            // Fill up stack to perform post-order traversal
            if (node.left != null && !map.containsKey(node.left)) {
                stack.push(node.left);
            } else if (node.right != null && !map.containsKey(node.right)) {
                stack.push(node.right);
            } else {

                // Process the root, once left and right sub-tree have been processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.left, 0);
                int rightDepth = map.getOrDefault(node.right, 0);

                // Put the max depth at a node in the map
                map.put(node, 1 + Math.max(leftDepth, rightDepth));

                // Update the max diameter found so far
                diameter = Math.max(diameter, leftDepth + rightDepth);
            }
        }
        return diameter;
    }

}
