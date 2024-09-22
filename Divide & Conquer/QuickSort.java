package Divide & Conquer;

public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
        System.out.println();

    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = arr[ei];
        int pi = partition(arr, pivot, si, ei);
        quickSort(arr, si, pi - 1);
        quickSort(arr, pi + 1, ei);
    }
    public static int partition(int arr[], int pivot, int si, int ei) {
        int pivot = arr[ei];
        int pi = si-1;
        for (int i = si; i <= ei; i++) {
            if (arr[i] < pivot) {
                pi++;
                int temp = arr[pi];
                arr[pi] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[pi + 1];
        arr[pi + 1] = arr[ei];
        arr[ei] = temp;
        return pi + 1;
        
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
