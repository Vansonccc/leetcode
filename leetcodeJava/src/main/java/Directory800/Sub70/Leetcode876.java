package Directory800.Sub70;

import Model.ListNode;

public class Leetcode876 {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
