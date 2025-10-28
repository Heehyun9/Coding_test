package Algorithm.part0.Sorting;

public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }


    static void selectionSort(int[] a, int n){
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j< n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(a,i,min);
        }
    }

    public static void main(String[] args) {

        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        selectionSort(arr, 8);

        System.out.println("오름차순으로...");
        for (int i = 0; i < arr.length; i++)
            System.out.println("x[" + i + "]＝" + arr[i]);
    }

}
