package leetcode;

// 61. Rotate List
// https://leetcode.com/problems/rotate-list/description/
public class Rotate_List_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int listLength = 1;
        ListNode tmp = head;

        while (tmp.next != null) {
            listLength++;
            tmp = tmp.next;
        }
        k = k % listLength;
        if (k == 0) {
            return head;
        }
        tmp.next = head;
        tmp = head;
        for (int i = 1; i < listLength - k; i++ ) {
            tmp = tmp.next;
        }
        head = tmp.next;
        tmp.next = null;

        return head;
    }

    public static void main(String[] args) {
        Rotate_List_61 obj = new Rotate_List_61();
        int[] arr = {1,2,3,4,5};
        int k = 2;
        ListNode head = ListNode.createLinkedList(arr);
        head = obj.rotateRight(head, k);
        ListNode.printLinkedList(head);
    }
}
