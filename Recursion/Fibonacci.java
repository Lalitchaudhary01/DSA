package recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Base case: if n is 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: return the sum of the two previous Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;  // Change this value to compute a different Fibonacci number
        System.out.println(fibonacci(n));  // Print the nth Fibonacci number
    }
}
