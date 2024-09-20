package Recursion;
java.util.*;
public class AllOccurence {
    public static void allOccurence(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return ;
        }
        if (arr[idx] == x) {
            System.out.println(idx);
        }
         allOccurence(arr, idx + 1, x);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 5, 4, 2, 4, 78, 2};
        int x = 2;
        allOccurence(arr, 0, x);
        System.out.println();
    }
}
