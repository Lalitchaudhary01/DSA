package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        int fisa = firstOccurence(arr, idx+1, x);
        return fisa;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = 5;
        System.out.println(firstOccurence(arr, 0, x));
    }
}
