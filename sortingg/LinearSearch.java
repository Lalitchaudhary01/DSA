package sortingg;

public class LinearSearch {
    public static int linearSearch(int marks[], int target) {
        if (marks.length == 0) {
            return -1;
        } 
        for (int i = 0; i < marks.length; i++) {
            int element = marks[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int marks[] = {3, 10, 20, 30};
        int target = 20;
        int ans = linearSearch(marks, target);
        System.out.println(ans);
    }
    
}
