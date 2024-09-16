package sortingg.ass;

public class Repeat {
    public static boolean findRepeat(int numbers[]) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    return true; // Found a repeat
                }
            }
        }
        return false; // No repeat found
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 2, 7};
        boolean hasRepeats = findRepeat(numbers);
        
        if (hasRepeats) {
            System.out.println("Array contains repeated elements.");
        } else {
            System.out.println("No repeated elements in the array.");
        }
    }
}
