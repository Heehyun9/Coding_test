package Algorithm.Tree.BinarySearchTree;

public class TreeNode {
    Comparable key;
    TreeNode left;
    TreeNode right;

    public TreeNode(Comparable key, TreeNode left, TreeNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public TreeNode(Comparable key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
