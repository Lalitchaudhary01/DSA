package sortingg.sorting;

public class Insertion {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = {3,1,4,2,5,6};
        insertionSort(arr);
        printArr(arr);
        
    }
    
}
