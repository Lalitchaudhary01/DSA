package sortingg.sorting;

public class Slection {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    selectionSort(arr);
    printArr(arr);
    }
    
}
