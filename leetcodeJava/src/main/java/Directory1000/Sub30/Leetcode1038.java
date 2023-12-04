package Directory1000.Sub30;

import Model.TreeNode;

public class Leetcode1038 {
    public TreeNode bstToGst(TreeNode root) {
        recursive(root,0);
        return root;
    }

    private void recursive(TreeNode root,int total) {
        if(root==null){
            return;
        }
        if(root.right!=null){
            recursive(root.right,total);
        }
        root.val +=total;
        if(root.left!=null){
            recursive(root.left,total);
        }
    }
}
