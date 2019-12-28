package HuffmanTree;

import java.util.List;

public class HuffmanTree {

    public static class Node<E>{

        E data; //数据
        double weight;// 权重
        Node leftChild; //左叶子结点
        Node reighrChild; //右叶子结点

        public Node(E data, double weight) {
            this.data = data;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", weight=" + weight +
                    '}';
        }
    }

    private static Node createTree(List<Node> nodes){
        while (nodes.size() > 1){
            quickShort(nodes);
            //获取权值最小的两个点
            Node left = nodes.get(nodes.size()-1);
            Node reight = nodes.get(nodes.size()-2);

            //生成新节点，新节点的权值为两个子节点的权值之和
            Node parent = new Node(null, left.weight+reight.weight);

            //让新节点作为两个权值最小的节点父节点
            parent.leftChild = left;
            parent.reighrChild = reight;

            //删除权值最小的两个点
            nodes.remove(nodes.size()-1);
            nodes.remove(nodes.size()-1);

            //将新节点加入到集合中
            nodes.add(parent);

        }

        return nodes.get(0);
    }

    private static void subSort(List<Node> nodes, int start, int end) {
        if (start < end) {
            // 以第一个元素作为分界值
            Node base = nodes.get(start);
            //i从左边搜索，搜索大于分界值得元素的索引
            int i= start;
            //j从右边搜索，搜索小于分界值得元素索引
            int j = end + 1;
            while (true){
                //找到大于分界值得元素索引，或者i已经到了end处
                while (i <end && nodes.get(++i).weight >= base.weight){
                    ;
                }
                //找到小于分界值元素的索引，或者j已经到了start处
                while (j > start &&nodes.get(--j).weight <= base.weight){
                    ;
                }
                if (i < j){
                    swap(nodes,i,j);
                }else {
                    break;
                }
                swap(nodes,start,end);

                //递归左边子序列
                subSort(nodes, start, j-1);
                //递归右边子序列
                subSort(nodes, j+1, end);
            }
        }
    }

    public static void swap(List<Node> nodes,int i, int j) {
        Node temp;
        temp = nodes.get(i);
        nodes.set(i, nodes.get(j));
        nodes.set(j, temp);
    }

    public  static void quickShort(List<Node> nodes){
        swap(nodes, 0, nodes.size()-1);
    }
}
