package Divide & Conquer;

public class SortArrayString {
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
    public static void merge(String arr[], int si, int mid, int ei) {
        
        
    }
    public static void main(String[] args){
        String[] arr = { "sun", "earth", "mars", "mercury" };


    }
}
