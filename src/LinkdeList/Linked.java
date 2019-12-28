package LinkdeList;


public class Linked<T> {

    private class Node{
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t,null);
        }
    }


    private Node head; //头结点
    private int size;  //链表元素个数

    public Linked() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(T t){
        Node node = new Node(t);
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    @Override
    public String toString() {
        return "Linked{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Linked<Integer> linked = new Linked();
        linked.addFirst(123);
        System.out.println(linked);
    }
}
