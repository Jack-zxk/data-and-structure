package tree;

public class ErchaSortTree {

    class Node{
        private int data;
        private Node leftChild = null;
        private Node  rightChild = null;


        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }


    public Node addNode(Node root,int data){

        Node node = new Node(data);
        if(node == null){   //第一次插入时，root必为空
            root = node;    //让root指向新new出来的node
            return root;
        }
        Node temp = root;
        Node pre = root;
        int flag = -1;      //左边为0，右边为1

        while (temp != null){
            if(temp.getData() == data){
                return root;    //如果相等，则不插入
            }else if (temp.getData() > data){   //如果当前的值大于插入的值，则遍历左子树
                pre = temp;
                temp = temp.getLeftChild();     //进入左子树
                flag = 0;
            }else {
                pre =temp;
                temp = temp.getRightChild();    //进入右子树
                flag = 1;
            }
        }

        //根据标志决定往哪个子树添加
        if(flag == 0){
            pre.setLeftChild(node);     //指向node
        }
        if(flag == 1){
            pre.setRightChild(node);
        }
        flag = -1;
        return node;
    }

    //中序遍历
    //对于中序遍历，二叉排序树的输出有序数列
    public void traverseErChaSortTree(Node root){
        if (root.getLeftChild() != null)
            traverseErChaSortTree(root.getLeftChild());
        System.out.println(root.getData());
        if (root.getRightChild() != null)
            traverseErChaSortTree(root.getRightChild());
    }

    public static void main(String[] args) {
        ErchaSortTree erchaSortTree = new ErchaSortTree();

        Node node = null;
        node = erchaSortTree.addNode(node, 4);
        erchaSortTree.addNode(node, 2);
        erchaSortTree.addNode(node, 5);
        erchaSortTree.addNode(node, 1);
        erchaSortTree.traverseErChaSortTree(node);
    }
}
