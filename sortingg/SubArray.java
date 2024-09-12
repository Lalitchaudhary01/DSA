package sortingg;

public class SubArray {
    public static void subArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                
                    System.out.println("The subarray is: " + current + " " + numbers[j]);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        subArray(numbers);
        
        
    }
    
}
