package queue;

import java.util.Arrays;

public class Queue {
    int[] a = new int[5];
    int i = -1;
    int j = 0;

    //入栈
    public void push(int n){
        a[++i] = n;
    }

    //出栈
    public int pop(){
        if(i > -1){
            return a[j++];
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "a=" + Arrays.toString(a) +
                ", i=" + i +
                ", j=" + j +
                '}';
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);


        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
