package leetcode;

public class Delete_the_Middle_Node_of_a_Linked_List_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast  = head;
        ListNode prev = null;
        while (fast.next != null && fast.next.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next == null) {
            prev.next = prev.next.next;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Delete_the_Middle_Node_of_a_Linked_List_2095 obj = new Delete_the_Middle_Node_of_a_Linked_List_2095();
        int[] arr = {1};

        ListNode head = ListNode.createLinkedList(arr);
        head = obj.deleteMiddle(head);
        ListNode.printLinkedList(head);
    }
}
