package ar.com.old.trees;

import ar.com.old.nodes.TreeNode;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    //  4  2  5 7
    public void add(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        TreeNode current = root;
        while (true) {
            if (data < current.data) {

                if (current.left == null) {
                    current.left = new TreeNode(data);
                    return;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new TreeNode(data);
                    return;
                } else {
                    current = current.right;
                }
            }
        }

    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public TreeNode getRoot() {
        return root;
    }

}
