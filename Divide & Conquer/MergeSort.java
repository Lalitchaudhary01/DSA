package divide_and_conquer;

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
        System.out.println();

        

    }
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);    
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; //left
        int j = mid + 1; //right
        int k = 0; //temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }



        
    }


    public  static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
        
         
    }

}
    
