package Array2;

public class sum {
    public static void main(String[] args) {
        // Given 2D array
        int[][] nums = { {1, 4, 9}, {11, 4, 3}, {2, 2, 3} };
        
        // Variable to store the sum of the second row
        int sum = 0;
        
        // Access the second row (nums[1]) and iterate through its elements
        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];  // Add each element to the sum
        }
        
        // Print the sum
        System.out.println("The sum of the numbers in the second row is: " + sum);
    }
}
