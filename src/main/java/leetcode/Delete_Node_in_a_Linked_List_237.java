package leetcode;// 237. Delete Node in a Linked List
// https://leetcode.com/problems/delete-node-in-a-linked-list/description/

public class Delete_Node_in_a_Linked_List_237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;

        node.next = node.next.next;
    }
}
