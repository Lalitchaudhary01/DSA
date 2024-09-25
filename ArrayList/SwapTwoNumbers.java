package ArrayList;
import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new java.util.ArrayList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //swap two numbers
        int index1 = 1;
        int index2 = 2;
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        System.out.println(list);
    }
    
}
