package sortingg;

public class ArrayAsArgument {
    public static void printArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
           marks[i]= marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {3, 10, 20, 30};
        printArray(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.err.println("");
    }
    
}
