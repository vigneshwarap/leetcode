package binarySearchTree;


import java.sql.SQLOutput;

//https://leetcode.com/problems/delete-node-in-a-bst/
public class Delete_Node_in_a_BST_450 {


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

    public static int findMin(TreeNode root) {
        if (root == null)
            return 0;

        if(root.left == null)
            return root.val;
        else
            return findMin(root.left);
    }


    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return root;
        }
        if(key < root.val) {
            root.left = deleteNode(root.left,key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right,key);
        } else {
            // No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // 1 Child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {        
                return root.left;
            }
            // 2 Child
            else {
                 root.val = findMin(root.right);;
                 root.right = deleteNode(root.right, root.val);
            }

        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = insertIntoBST(null,5);
        insertIntoBST(root,3);
        insertIntoBST(root,6);
        insertIntoBST(root, 2);
        insertIntoBST(root, 4);
        insertIntoBST(root,7);

        printInorder(root);

//        deleteNode(root, 2);
//        System.out.println();
//        printInorder(root);
//
        deleteNode(root, 3);
        System.out.println();
        printInorder(root);
//
//        deleteNode(root, 6);
//        System.out.println();
//        printInorder(root);
        
    }
}
