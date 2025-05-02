package leetcode.binarySearchTree;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/
public class Minimum_Absolute_Difference_in_BST_530 {

    public static TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }


    public static void printInorder(TreeNode node)
    {
        if (node == null)
            return;

        // First recur on left subtree
        printInorder(node.left);

        // Now deal with the node
        System.out.print(node.val + " ");

        // Then recur on right subtree
        printInorder(node.right);

    }

    static Integer mini = Integer.MAX_VALUE ,prev = null;

    public static int getMinimumDifference(TreeNode root) {
        if (root == null){
            return 0;
        }
        getMinimumDifference(root.left);
        if (prev != null) {
            mini = Math.min(mini, root.val - prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return mini;
    }


    public static void main(String[] args) {
        TreeNode root = insertIntoBST(null, 4);
        insertIntoBST(root, 2);
        insertIntoBST(root, 6);
        insertIntoBST(root, 1);
        insertIntoBST(root, 3);

        printInorder(root);
        System.out.println(getMinimumDifference(root));

    }
}
