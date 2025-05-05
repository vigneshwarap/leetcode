package leetcode;

// 328. Odd Even Linked List
// https://leetcode.com/problems/odd-even-linked-list/description/
public class Odd_Even_Linked_List_328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ListNode head = ListNode.createLinkedList(arr);
        Odd_Even_Linked_List_328 obj = new Odd_Even_Linked_List_328();
        head = obj.oddEvenList(head);
        ListNode.printLinkedList(head);
    }

}
