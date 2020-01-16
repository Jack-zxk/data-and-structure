package sort;

public class SelectSort {


    public static void main(String[] args) {
        int[] arr = {55,64,25,9,15,54,28,66};

        for (int i = 0; i < arr.length-1; i++) {
            //将i坐标保存
            int min = i;
            //第二次循环 进行i与i+1的比较
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }

            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
