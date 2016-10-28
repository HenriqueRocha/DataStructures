package net.henriquerocha.datastructures;

public class IntBinTree implements IntCollection {

    TreeNode root;

    public IntBinTree() {
        root = null;
    }

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

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void add(int element) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(int i) {
        throw new UnsupportedOperationException();
    }

    class TreeNode {
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
