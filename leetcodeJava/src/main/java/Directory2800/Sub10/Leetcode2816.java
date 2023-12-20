package Directory2800.Sub10;

import Model.ListNode;

public class Leetcode2816 {
    public static void main(String[] args) {
        doubleIt(new ListNode(1,new ListNode(8,new ListNode(9))));
    }

    public static ListNode doubleIt(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        for (ListNode curr = dummy; curr.next != null; curr = curr.next) {
            curr.next.val *= 2;
            curr.val += curr.next.val / 10;
            curr.next.val %= 10;
        }
        return dummy.val > 0 ? dummy : dummy.next;
    }
}
