
import java.util.ArrayList;
import java.util.List;

/*
 Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5

All root-to-leaf paths are:

["1->2->5", "1->3"]
*/











public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root != null)
            binTreeHelper(root, "", list);
        return list;
    }
    void binTreeHelper(TreeNode node, String path, List<String> list)
    {
        if(node.left == null && node.right == null)
            list.add(path + node.val);
        if(node.right != null)
            binTreeHelper(node.right, path+node.val+"->", list);
        if(node.left != null)
            binTreeHelper(node.left, path+node.val+"->", list);
    }
}
