package queue;


public class Queue2<T> {
    private T[] data;
    private int top;
    private int maxSize;
    private int a;

    public Queue2(int maxSize) {
        this.data = (T[]) new Object[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
        this.a = 0;
    }

    //判断队列是否为空
    public boolean isNull(){
        boolean flag = this.top <= -1 ? true :false;
        return flag;
    }

    //判断队列是否为满
    public boolean isFull(){
        boolean flag = this.top == maxSize - 1 ? true :false;
        return flag;
    }

    //入队列
    public boolean push(T value){
        if(isFull()){
            return false;
        }else {
            data[++top] = value; //栈顶指针+1并赋值
            return true;
        }
    }

    //出队列
    public T pop(){
        if(isNull()){
            return null;
        }else {

            T value = data[a++];
            return value;
        }
    }


    public static void main(String[] args) {
        Queue2 queue2 = new Queue2(5);

        queue2.push(1);
        queue2.push(2);

        System.out.println(queue2.pop());
        System.out.println(queue2.pop());
        System.out.println(queue2.pop());
    }
}
