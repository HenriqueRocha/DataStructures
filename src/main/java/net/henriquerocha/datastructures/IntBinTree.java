package net.henriquerocha.datastructures;

public class IntBinTree {

    private TreeNode root;

    public IntBinTree(int i) {
        root = new TreeNode(i);
    }

    public IntBinTree(int data, IntBinTree left, IntBinTree right) {
        root = new TreeNode(
                data,
                left != null ? left.root : null,
                right != null ? right.root : null);
    }

    public IntLinkedList preOrderTraversal() {
        IntLinkedList result = new IntLinkedList();
        preOrderTraversal(root, result);
        return result;
    }

    private void preOrderTraversal(TreeNode root, IntLinkedList list) {
        if (root == null) return;
        list.add(root.data);
        preOrderTraversal(root.left, list);
        preOrderTraversal(root.right, list);
    }

    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
