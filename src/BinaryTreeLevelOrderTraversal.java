
import java.util.LinkedList;
import java.util.List;

/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
(ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its bottom-up level order traversal as:

[
  [15,7],
  [9,20],
  [3]
]
*/




public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        traverse(root, list, 0);
        return list;
    }
    void traverse(TreeNode root, List<List<Integer>> list,int level)
    {
        if(root == null)
        return;
        
        if(list.size() <= level)
        list.add(0, new LinkedList());
        
        traverse(root.left, list, level + 1);
        traverse(root.right, list, level + 1);
        list.get(list.size()-1-level).add(root.val);
    }
}
