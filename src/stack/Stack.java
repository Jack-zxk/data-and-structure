package stack;

import java.util.Arrays;

public class Stack<T> {

    int[] a = new int[5];
    int i = 0;

    //入栈
    public void push(int n){
        a[++i] = n;
    }

    //出栈
    public int pop(){
        if(i > 0){
            return a[i--];
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "a=" + Arrays.toString(a) +
                ", i=" + i +
                '}';
    }

    public static void main(String[] args) {
        Stack a = new Stack();
        a.push(1);
        a.push(2);
        a.push(3);

        System.out.println(a.pop());
        System.out.println(a.pop());
    }
}
