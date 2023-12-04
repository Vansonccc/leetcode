package Directory1000.Sub80;

import Model.TreeNode;

public class Leetcode1080 {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean res = recursive(root, limit, 0);
        return res?null:root;
    }

    private boolean recursive(TreeNode root, int limit, int total) {
        if (root.left == null && root.right == null){
            return total+root.val<limit;
        }
        boolean deleteLeft =true;
        boolean deleteRight =true;
        if(root.left!=null){
            deleteLeft = recursive(root.left,limit,total+root.val);
            root.left = deleteLeft?null:root.left;
        }
        if(root.right!=null){
            deleteRight = recursive(root.right,limit,total+root.val);
            root.right = deleteRight?null:root.right;
        }
        return deleteLeft&deleteRight;
    }
}
