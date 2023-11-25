package LCR;


import Model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LCR153 {
    public static void main(String[] args) {

    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        recursive(root,target,0);
        return res;
    }

    private void recursive(TreeNode root, int target, int sum) {
        if(root==null){
            return;
        }
        path.add(root.val);
        sum += root.val;
        if(sum == target && root.left==null && root.right==null){
            res.add(new ArrayList(path));
        }
        recursive(root.left,target,sum);
        recursive(root.right,target,sum);
        path.remove(path.size()-1);
    }

}
