package insertsort;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {1,5,6,4,9,88,33,68,100,25};

        for(int i = 1;i < arr.length;i++){

            int tmp = arr[i];
            int j  = i;

            while (j > 0 && tmp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }

            if(j!=i){
                arr[j] = tmp;
            }
        }

        for (int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
