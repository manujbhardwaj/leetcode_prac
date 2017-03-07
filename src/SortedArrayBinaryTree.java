/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*/
public class SortedArrayBinaryTree {
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length == 0)
        {
            return null;
        }
        TreeNode head = sortedArrayBSThelper(nums, 0,nums.length - 1);
        return head;
    }
    TreeNode sortedArrayBSThelper(int[] nums, int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayBSThelper(nums, left, mid-1);
        node.right = sortedArrayBSThelper(nums, mid+1,right);
        return node;
    }
}
