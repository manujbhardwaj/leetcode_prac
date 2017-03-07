
import java.util.ArrayList;
import java.util.HashMap;

/*
Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

Assume a BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than or equal to the node's key.
    The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
    Both the left and right subtrees must also be binary search trees.

For example:
Given BST [1,null,2,2],

   1
    \
     2
    /
   2

return [2].

Note: If a tree has more than one mode, you can return them in any order. 
*/
public class ModeBinaryTree {
    private HashMap<Integer, Integer> map;
    private int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null)
        return new int[0];
        
        map = new HashMap<>();
        
        inOrder(root);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : map.keySet())
        {
            if(map.get(i) == max)
            {
                arr.add(i);
            }
        }
        
        int[] ans = new int[arr.size()];
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
    
    void inOrder(TreeNode node)
    {
        if(node.left != null)
        {
            inOrder(node.left);
        }
        map.put(node.val, map.getOrDefault(node.val, 0)+1);
        max = Math.max(max, map.get(node.val));
        if(node.right != null)
        {
            inOrder(node.right);
        }
    }
}
