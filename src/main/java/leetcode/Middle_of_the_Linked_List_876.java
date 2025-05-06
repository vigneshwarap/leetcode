package leetcode;

// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class Middle_of_the_Linked_List_876 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast  = fast.next.next;
        }
        return fast.next == null ? slow : slow.next;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5, 6};
        ListNode head = ListNode.createLinkedList(arr);

        Middle_of_the_Linked_List_876 obj = new Middle_of_the_Linked_List_876();
        ListNode middle = obj.middleNode(head);
        System.out.println(middle.val);
    }
}
