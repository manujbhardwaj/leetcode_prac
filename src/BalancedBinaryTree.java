/*
Given a binary tree, determine if it is height-balanced.

For this problem, 
a height-balanced binary tree is defined as a binary tree in which 
the depth of the two subtrees of every node never differ by more than 1. 
*/























public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;
        return (Math.abs(depth(root.left) - depth(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }
    int depth(TreeNode node)
    {
        if(node == null)
            return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}
