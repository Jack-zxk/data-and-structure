package sort;

public class QuickSort2 {

    public static int[] sort(int[] arr,int left, int right){

        if(left > right){
            int[] a = {};
            return a;
        }

        //以第一个记录作为支点
        int base = arr[left];
        int i = left,j = right;

        //从表的两端交替向中间扫描
        while (i != j){
            //先从右向左找，直到找到比base值小的数
            while (arr[j] >= base && i < j){
                j--;

            }
            //再从左向右找，直到找到比base大的数
            while (arr[i] <= base && i < j){
                i++;
            }

            //上面的循环结束表示找到了位置，交换两个数在数组中的位置
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //将基数放到中间位置
        arr[left] = arr[i];
        arr[i] = base;

        //递归 继续向基准的左右两边执行和上面同样的操作
        //i的索引处为上面已确定好的基准值得位置，无需再处理
        sort(arr, left, i-1);
        sort(arr, i+1, right);

        return arr;

    }

    public static void main(String[] args){
        int[]  arr = {55,64,25,9,15,54,28,66};
        int[] newArr = sort(arr, 0, arr.length-1);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

}
