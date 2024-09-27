package ArrayList;
import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        ArrayList<String> list1 = new java.util.ArrayList<>();
        //add element
        list.add(10);
        list.add( 60);
        list.add(30);
        list.add(40);
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);

      
    }
}
