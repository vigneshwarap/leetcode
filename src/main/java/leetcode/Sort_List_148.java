package leetcode;

// 148. Sort List
// https://leetcode.com/problems/sort-list/description/
public class Sort_List_148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode rightHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        return mergelinkedlist(left, right);
    }

    public ListNode mergelinkedlist(ListNode left, ListNode right) {
        ListNode dummyNode = new ListNode(-1);
        ListNode tmp = dummyNode;

        while(left != null && right != null) {
            if (left.val <= right.val) {
                tmp.next = left;
                left = left.next;
            } else {
                tmp.next = right;
                right = right.next;
            }
            tmp = tmp.next;
        }

        if (left != null) {
            tmp.next = left;
        } else {
            tmp.next = right;
        }

        return dummyNode.next;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Sort_List_148 obj = new Sort_List_148();
        int[] arr = {4,2,1,3};
        ListNode head = ListNode.createLinkedList(arr);
        head = obj.sortList(head);
        ListNode.printLinkedList(head);
    }
}
