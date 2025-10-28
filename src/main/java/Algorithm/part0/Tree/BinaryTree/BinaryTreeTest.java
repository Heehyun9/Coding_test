package Algorithm.part0.Tree.BinaryTree;

public class BinaryTreeTest {

    public static void main(String[] args) {

        TreeNode nodeA = new TreeNode();
        TreeNode nodeB = new TreeNode();
        TreeNode nodeC = new TreeNode();
        TreeNode nodeD = new TreeNode();
        TreeNode nodeE = new TreeNode();
        TreeNode nodeF = new TreeNode();
        TreeNode nodeG = new TreeNode();
        TreeNode nodeH = new TreeNode();
        TreeNode nodeI = new TreeNode();
        TreeNode nodeJ = new TreeNode();
        TreeNode nodeK = new TreeNode();
        TreeNode nodeL = new TreeNode();
        TreeNode nodeM = new TreeNode();


        BinaryTree binaryTree = new BinaryTree();

        nodeA.data = 'A';
        nodeA = binaryTree.makeBinTree(nodeA);

        if (nodeA != null) {
            nodeB.data = 'B';
            nodeB = binaryTree.insertLeftChildNodeBT(nodeA, nodeB);

            nodeC.data = 'C';
            nodeC = binaryTree.insertRightChildNodeBT(nodeA, nodeC);
        }
        if (nodeB != null) {
            nodeD.data = 'D';
            nodeD = binaryTree.insertLeftChildNodeBT(nodeB, nodeD);
            nodeE.data = 'E';
            nodeE = binaryTree.insertRightChildNodeBT(nodeB, nodeE);
        }
        if (nodeC != null) {
            nodeF.data = 'F';
            nodeF = binaryTree.insertLeftChildNodeBT(nodeC, nodeF);

            nodeG.data = 'G';
            nodeG = binaryTree.insertRightChildNodeBT(nodeC, nodeG);
        }
        if (nodeD != null) {
            nodeH.data = 'H';
            nodeH = binaryTree.insertLeftChildNodeBT(nodeD, nodeH);

            nodeI.data = 'I';
            nodeI = binaryTree.insertRightChildNodeBT(nodeD, nodeI);
        }
        if (nodeE != null) {
            nodeJ.data = 'J';
            nodeJ = binaryTree.insertLeftChildNodeBT(nodeE, nodeJ);
        }
        if (nodeF != null) {
            nodeK.data = 'K';
            nodeK = binaryTree.insertRightChildNodeBT(nodeF, nodeK);
        }
        if (nodeG != null) {
            nodeL.data = 'L';
            nodeL = binaryTree.insertLeftChildNodeBT(nodeG, nodeL);

            nodeM.data = 'M';
            nodeM = binaryTree.insertRightChildNodeBT(nodeG, nodeM);
        }

        System.out.print("\n Preorder : ");
        binaryTree.preorder(nodeA);

        System.out.print("\n Inorder : ");
        binaryTree.inorder(nodeA);

        System.out.print("\n Postorder : ");
        binaryTree.postorder(nodeA);


    }
}
