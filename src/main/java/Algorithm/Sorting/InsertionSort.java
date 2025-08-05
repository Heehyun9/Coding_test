package Algorithm.Sorting;

public class InsertionSort {


    public static void insertionSort(int[] a, int n){

        for(int i = 1; i<n; i++){
            int j;
            int temp = a[i];
            for(j = i; j > 0 && a[j-1] > temp; j--){
                a[j] = a[j-1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        insertionSort(arr, arr.length);

        System.out.println("오름차순으로...");
        for (int i = 0; i < arr.length; i++)
            System.out.println("x[" + i + "]＝" + arr[i]);
    }
}
