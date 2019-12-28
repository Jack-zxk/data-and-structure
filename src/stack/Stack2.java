package stack;

public class Stack2<T> {

    private T data[];
    private int top;     //相当于指针 指向栈中的元素
    private int maxSize;

    public Stack2(int maxSize) {
        this.data = (T[]) new Object[maxSize]; //泛型数组不能直接new创建，需要用Object来创建
        this.top = -1;                          // =0的话会占用内存
        this.maxSize = maxSize;
    }

    //判断栈是否为空
    public boolean isNull(){
        boolean flag = this.top <= -1 ? true : false;
        return flag;
    }
    //判断栈是否为满状态
    public boolean isFull(){
        boolean flag = this.top == this.maxSize-1 ? true : false ;
        return flag;
    }

    //压栈
    public boolean push(T value){
        if(isFull()){
            return false;
        }else {
            data[++top] = value; //栈顶指针+1并赋值
            return true;
        }
    }

    //出栈
    public T pop(){
        if(isNull()){
            return null;
        }else {
            T value = data[top];
            --top;
            return value;
        }
    }


    public static void main(String[] args) {
        Stack2 stack2 = new Stack2(5);

        stack2.push("aaa");
        stack2.push("bbb");
        stack2.push("ccc");

        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }

}
