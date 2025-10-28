package Algorithm.part0.Sorting;

public class BubbleSort {

    static void swap(int[] a, int idx1, int idx2){

        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    public static void bubbleSort(int[] a, int n){

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        bubbleSort(arr, 8);

        System.out.println("오름차순으로...");
        for (int i = 0; i < arr.length; i++)
            System.out.println("x[" + i + "]＝" + arr[i]);
    }
}
