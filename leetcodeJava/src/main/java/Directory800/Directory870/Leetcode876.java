package Directory800.Directory870;

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

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
