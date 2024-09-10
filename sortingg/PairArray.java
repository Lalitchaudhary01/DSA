package sortingg;

public class PairArray {
    public static void pairArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                
                    System.out.println("The pair is: " + current + " " + numbers[j]);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        pairArray(numbers);
    }
}
