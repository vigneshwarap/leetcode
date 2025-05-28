package codingninjas;

// Add one to a number represented as Linked List
// https://www.naukri.com/code360/problems/add-one-to-a-number-represented-as-linked-list_920557
public class Add_one_to_a_number_represented_as_Linked_List {
    public static Node addOne(Node head) {
        int tmp = addOneToNode(head);
        if (tmp > 0) {
            Node newNode = new Node(tmp);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    public static int addOneToNode(Node head) {
        if (head.next == null) {
            int tmp = head.data + 1;
            if (tmp > 9) {
                head.data = tmp%10;
                return tmp/10;
            } else {
                head.data = tmp;
                return 0;
            }
        }

        int tmp = addOneToNode(head.next) + head.data;
        if (tmp > 9) {
            head.data = tmp%10;
            return tmp/10;
        } else {
            head.data = tmp;
            return 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int[] arr1 = {9,9,9};
        Node head = Node.createListFromArray(arr1);
        head = addOne(head);
        Node.printList(head);
    }
}
