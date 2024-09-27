package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new java.util.ArrayList<>();
        //add element
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);
        // System.out.println(list);
        // //sort the array list
        // list.sort(null);
        // System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); 
    }
    
}
