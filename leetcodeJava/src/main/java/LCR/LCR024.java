package LCR;

import Model.ListNode;

public class LCR024 {
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }

    private ListNode reverse(ListNode pre,ListNode cur){
        //当当前节点为null时，退出
        if (cur == null) {
            return pre;
        }
        //保存当前节点的下一个节点
        ListNode next = cur.next;
        //设当前节点的下一个节点为当前节点的上一个节点
        cur.next = pre;
        //递归，反转当前节点和下一个节点
        return reverse(cur,next);
    }
}
