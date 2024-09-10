package sortingg;
public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        //low and high are the indexes of the array
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int numbers[] = {3, 10, 20, 30, 40, 50, 60, 70, 80, 90};
         int key = 30;
            int ans = binarySearch(numbers, key);
            System.err.println("The key is at index: " + ans);

        
    }
}
