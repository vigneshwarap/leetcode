package leetcode;

// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/description/
public class Linked_List_Cycle_141 {
    public boolean hasCycle(ListNode head) {
        if (head == null ||  head.next  == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
