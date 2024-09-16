package Array2;
import java.util.Scanner;

public class Matrices {
    public static void search(int matrix[][], int x){
        int n = matrix.length, m = matrix[0].length;
        int i=0, j=m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==x){
                System.out.println("Element found at "+i+" "+j);
                return;
            }
            if(matrix[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int matrix [][] = new int[3][3];
        int n =matrix.length, m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }   

    }
    
}
