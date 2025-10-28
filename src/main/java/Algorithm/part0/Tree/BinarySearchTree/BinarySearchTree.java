package Algorithm.part0.Tree.BinarySearchTree;

public class BinarySearchTree implements SearchInterface<TreeNode> {

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    @Override
    public TreeNode search(Comparable searchKey) {
        return searchItem(root, searchKey);
    }

    private TreeNode searchItem(TreeNode tNode, Comparable searchKey) {
        if (tNode == null)
            return null; // 검색 실패
        else if (searchKey.compareTo(tNode.key) == 0)
            return tNode;
        else if (searchKey.compareTo(tNode.key) < 0)
            return searchItem(tNode.left, searchKey);
        else
            return searchItem(tNode.right, searchKey);
    }

    @Override
    public void insert(Comparable newKey) {
        root = insertItem(root, newKey);
    }

    private TreeNode insertItem(TreeNode tNode, Comparable newItem) {
        if (tNode == null) {
            return new TreeNode(newItem, null, null);
        }

        if (newItem.compareTo(tNode.key) < 0) {
            tNode.left = insertItem(tNode.left, newItem);
        } else {
            tNode.right = insertItem(tNode.right, newItem);
        }

        return tNode;
    }

    @Override
    public void delete(Comparable searchKey) {
        root = deleteItem(root, searchKey);
    }

    private TreeNode deleteItem(TreeNode tNode, Comparable searchKey) {
        if (tNode == null) return null;

        if (searchKey.compareTo(tNode.key) < 0) {
            tNode.left = deleteItem(tNode.left, searchKey);
        } else if (searchKey.compareTo(tNode.key) > 0) {
            tNode.right = deleteItem(tNode.right, searchKey);
        } else {
            // key found
            tNode = deleteNode(tNode);
        }

        return tNode;
    }

    private TreeNode deleteNode(TreeNode tNode) {
        // Case 1: 리프 노드
        if (tNode.left == null && tNode.right == null) {
            return null;
        }
        // Case 2: 오른쪽만 있는 경우
        else if (tNode.left == null) {
            return tNode.right;
        }
        // Case 2: 왼쪽만 있는 경우
        else if (tNode.right == null) {
            return tNode.left;
        }
        // Case 3: 자식이 둘 다 있는 경우
        else {
            ReturnPair rPair = deleteMinItem(tNode.right);
            tNode.key = rPair.key;
            tNode.right = rPair.node;
            return tNode;
        }
    }

    private ReturnPair deleteMinItem(TreeNode tNode) {
        if (tNode.left == null) {
            return new ReturnPair(tNode.key, tNode.right);
        } else {
            ReturnPair rPair = deleteMinItem(tNode.left);
            tNode.left = rPair.node;
            rPair.node = tNode;
            return rPair;
        }
    }

    private class ReturnPair {
        private Comparable key;
        private TreeNode node;

        public ReturnPair(Comparable key, TreeNode node) {
            this.key = key;
            this.node = node;
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void clear() {
        root = null;
    }

    // 출력
    public void printPreOrder() {
        prPreOrder(root);
    }

    public void prPreOrder(TreeNode tNode) {
        if (tNode != null) {
            System.out.println(tNode.key);
            prPreOrder(tNode.left);
            prPreOrder(tNode.right);
        }
    }
}
