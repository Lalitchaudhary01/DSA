package Array2;

public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0, endRow = matrix.length-1, startCol = 0, endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //start row
            for(int i=startCol; i<=endCol; i++){
                System.out.println(matrix[startRow][i]);
            }
            startRow++;
            //end col
            for(int i=startRow; i<=endRow; i++){
                System.out.println(matrix[i][endCol]);
            }
            endCol--;
            //end row
            for(int i=endCol; i>=startCol; i--){
                System.out.println(matrix[endRow][i]);
            }
            endRow--;
            //start col
            for(int i=endRow; i>=startRow; i--){
                System.out.println(matrix[i][startCol]);
            }
            startCol++;
        }

        
    }
    public static void main(String[] args) {
           int matrix[][] = {
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12},
               {13,14,15,16}
           };  
              printSpiral(matrix);
              
    }
    
}
