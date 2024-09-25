package ArrayList;

import java.util.ArrayList;

public class SizeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new java.util.ArrayList<>();
        //add element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
         System.out.println(list);

         //print the array list
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) + "");
            };
           
    }
}
