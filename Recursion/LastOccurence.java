package Recursion;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int liisa = lastOccurence(arr, idx+1, x);
        if(liisa==-1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            } 
        }else{
            return liisa;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,8,1,8,8,7};
        int x = 8;
        System.out.println(lastOccurence(arr, 0, x));
    }
}
