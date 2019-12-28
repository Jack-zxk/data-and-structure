package stack;


public  class LinkStack<T> {

    static class LinkNode<T>{
        private T data;
        private LinkNode<T> next;

        public  LinkNode() {
            this.data = null;
            this.next = null;
        }

        public LinkNode(T data) {
            super();
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public LinkNode<T> getNext() {
            return next;
        }

        public void setNext(LinkNode<T> next) {
            this.next = next;
        }
    }

    private LinkNode<T> top; //栈顶元素

    //初始化1
    public LinkStack() {
        top = new LinkNode<T>();
    }
    //初始化栈
    public  void initStack(){
        this.top.setData(null);
        this.top.setNext(null);
    }
    //判断栈是否为空
    public  boolean isNull(){
        boolean flag = top.getNext() == null ? true :false;
        return flag;
    }

    //压栈
    public void push(LinkNode<T> node){
        if(isNull()){
            top.setNext(node);
            node.setNext(null);
        }else {
            node.setNext(top.getNext());
            top.setNext(node);
        }
    }

    //弹栈
    public LinkNode<T> pop(){
        if (isNull()){
           return null;
        }else{
           LinkNode<T> delNode = top.getNext(); //取出删除结点
            top.setNext(top.getNext().getNext()); //删除结点
            return  delNode;
        }
    }


    public static void main(String[] args) {
        LinkStack<String> linkStack = new LinkStack<String>();

        System.out.println(linkStack.isNull()+"是否为空");

        linkStack.push(new LinkNode<String>("a"));
        linkStack.push(new LinkNode<String>("b"));
        linkStack.push(new LinkNode<String>("c"));
        linkStack.push(new LinkNode<String>("d"));
        linkStack.push(new LinkNode<String>("e"));

        System.out.println(linkStack.pop().getData());
    }
}
