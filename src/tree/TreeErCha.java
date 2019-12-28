package tree;

import sun.font.TextRecord;

public class TreeErCha {

    class TreeNode{

        private int key = 0;
        private String data = null;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;
        private boolean isVisted = false;

        public TreeNode() {
        }

        public TreeNode(int key, String data) {
            this.key = key;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    private TreeNode root = null;

    public TreeErCha() {
        this.root = new TreeNode(1,"rootNode(A)");
    }


    public void createBinTree(TreeNode root){
        TreeNode newNodeB = new TreeNode(2, "B");
        TreeNode newNodeC = new TreeNode(3,"C");
        TreeNode newNodeD = new TreeNode(4, "D");
        TreeNode newNodeE = new TreeNode(5, "E");
        TreeNode newNodeF = new TreeNode(6, "F");

        newNodeB.leftChild = newNodeD;
        newNodeC.leftChild = newNodeE;
        newNodeC.rightChild = newNodeF;

        root.leftChild = newNodeB;
        root.rightChild = newNodeC;
    }

    public void visted(TreeNode subTree){
        subTree.isVisted = true;
        System.out.println("key:"+subTree.key+"data:"+subTree.data);
    }

    public void preOrder(TreeNode subTree){
        if(subTree != null){
            visted(subTree);
            preOrder(subTree.leftChild);
            preOrder(subTree.rightChild);
        }
    }

    public void inOrder(TreeNode subTree){
        if(subTree != null){
            inOrder(subTree.leftChild);
            visted(subTree);
            inOrder(subTree.rightChild);
        }
    }


    public static void main(String[] args) {
        TreeErCha treeErCha = new TreeErCha();
        treeErCha.createBinTree(treeErCha.root);
        //treeErCha.preOrder(treeErCha.root);
        treeErCha.inOrder(treeErCha.root);
    }
}
