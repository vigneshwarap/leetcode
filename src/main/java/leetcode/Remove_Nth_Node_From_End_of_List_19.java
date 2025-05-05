package leetcode;

// 19. Remove Nth Node From End of List
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class Remove_Nth_Node_From_End_of_List_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        int cnt = 0;

        while (right != null) {
            cnt++;

            if (cnt > n + 1) {
                left = left.next;
            }
            right = right.next;
        }

        if (cnt == n) {
            return left.next;
        } else {
            left.next = left.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 2;

        ListNode head = ListNode.createLinkedList(arr);
        Remove_Nth_Node_From_End_of_List_19 obj = new Remove_Nth_Node_From_End_of_List_19();
        head = obj.removeNthFromEnd(head, n);
        ListNode.printLinkedList(head);
    }
}
