package Directory1400.Directory1450;

import Model.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode1457 {
    public static void main(String[] args) {
        pseudoPalindromicPaths(new TreeNode(2,new TreeNode(3,new TreeNode(3),new TreeNode(3)),new TreeNode(1,new TreeNode(1),null)));
    }

    public static int pseudoPalindromicPaths (TreeNode root) {
        int[] count = new int[10];
        return recursive(root,count);

    }

    private static int recursive(TreeNode root, int[] count) {
        if(root == null){
            return 0;
        }
        count[root.val]++;
        int res =0;
        if(root.left==null && root.right==null){
            if(check(count)){
                res= 1;
            }
        } else {
            res = recursive(root.left,count) + recursive(root.right,count);
        }
        count[root.val]--;
        return res;
    }

    private static boolean check(int[] count) {
        int oddNum = 0;
        for (int num: count) {
            if(num%2==1){
                oddNum++;
            }
        }
        return oddNum<=1;
    }

}
