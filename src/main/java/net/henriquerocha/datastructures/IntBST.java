package net.henriquerocha.datastructures;

public class IntBST extends IntBinTree {
    @Override
    public void add(int i) {
        root = add(root, i);
    }

    private TreeNode add(TreeNode root, int i) {
        if (root == null) return new TreeNode(i);

        if (i < root.data) {
            root.left = add(root.left, i);
        } else {
            root.right = add(root.right, i);
        }

        return root;
    }

    @Override
    public boolean contains(int i) {
        return contains(root, i);
    }

    private boolean contains(TreeNode root, int i) {
        if (root == null) return false;
        if (root.data == i) return true;
        if (i < root.data) return contains(root.left, i);
        else return contains(root.right, i);
    }
}
