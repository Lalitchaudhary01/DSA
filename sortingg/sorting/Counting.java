package sortingg.sorting;
public class Counting {

    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i =0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //sorting 
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }


        
    }
    
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        countSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
        
        
    }
}
