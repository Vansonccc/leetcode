package Interview;

import Model.ListNode;
import Model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Interview0304 {
    public static void main(String[] args) {
        listOfDepth(new TreeNode(2,new TreeNode(3,new TreeNode(3),new TreeNode(3)),new TreeNode(1,new TreeNode(1),null)));
    }

    public static ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode node = new ListNode(-1);
            ListNode head = node;
            while (size-- > 0) {
                TreeNode treeNode = queue.poll();
                head.val = treeNode.val;
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
                node.next = new ListNode(-1);
                node = node.next;
            }
            res.add(head.next);
        }
        ListNode[] finalRes= new ListNode[res.size()];
        for (int i = 0; i <finalRes.length ; i++) {
            finalRes[i] = res.get(i);
        }
        return finalRes;
    }
}
