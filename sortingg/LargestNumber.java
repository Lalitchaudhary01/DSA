package sortingg;

public class LargestNumber {
    public static int largestNumber(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest   number is: " + min);
        return max;
        
    }
    public static void main(String[] args) {

        int numbers[] = {3, 10, 20, 30};
        int ans = largestNumber(numbers);   
        System.out.println(ans);
    }
    
}
