package sortingg;
import java.util.*;

public class Arrayinput {

    public static void main(String[] args) {
        // Remove the declaration of the marks array
        Scanner sc = new Scanner(System.in);
        
        int marks[] = new int[100];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Enter the number of elements you want to enter: " + marks[0]);
        System.out.println("Enter the elements: " + marks[1]);
        System.out.println("Enter the elements: " + marks[2]);
        System.out.println("Enter the elements: " + marks[3]);
          int percentage = (marks[1] + marks[2] + marks[3]) / marks[0];
        System.out.println("The percentage of the student is: " + percentage);



    }
}