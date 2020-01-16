package sort;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {9,4,6,8,66,55,18,3,25,7};

        int high = arr.length-1;
        int pivotkey = arr[0];
        int low = 0;

        while (low < high){
            while (low < high && arr[high] >= pivotkey){
                if (low < high){
                    arr[low++] = arr[high];
                }
                --high;

                System.out.println("--------");

            }
            while (low < high && arr[low] <= pivotkey){
                if(low < high){
                    arr[high--] = arr[low];
                }
                ++low;
                System.out.println("+++++++++++++");

        }

        }

        for (int i = 0;i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
