
import java.util.HashMap;

/*
You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
*/

/*
public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;

        int ans = findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
        return ans;
    }
    
    public int findPath(TreeNode root, int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);
        return res;
    }   
}
*/

public class PathSum {
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        int ans = pathSumHelper(root, sum, 0, map);
        return ans;
    }
    int pathSumHelper(TreeNode node,int sum,int currSum,HashMap<Integer,Integer> map)
    {
        if(node == null)
        return 0;
        
        currSum = currSum + node.val;
        
        int ans = map.getOrDefault(currSum - sum, 0);
        
        map.put(currSum, map.getOrDefault(currSum,0)+1);
        
        ans = ans + pathSumHelper(node.left, sum, currSum, map) + pathSumHelper(node.right, sum, currSum, map);
        
        map.put(currSum, map.get(currSum) - 1);
        
        return ans;
    }
}
