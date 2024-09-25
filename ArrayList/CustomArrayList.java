package ArrayList;
import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new java.util.ArrayList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
         System.out.println(list);

         //get element
         int val = list.get(2);
            System.out.println(val);
            //Remove element
            list.remove(2);
            System.out.println(list);
            //set element at index
            list.set(1, 100);
            System.out.println(list);
            //size of list
            System.out.println(list.size());
            //check if list is empty
            System.out.println(list.isEmpty());
            //check if list contains element
            System.out.println(list.contains(100));
            //clear list
            list.clear();
            System.out.println(list);
            //add element at index

            
    }

    
}
