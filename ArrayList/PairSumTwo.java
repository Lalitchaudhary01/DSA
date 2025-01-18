package ArrayList;
import java.util.ArrayList;

public class PairSumTwo {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;    

        while(lp != rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case2
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % list.size();
            }else{
                rp = (rp-1+list.size()) % list.size();
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         int target =5; 
            System.out.println(pairSum2(list, target));
         
    }
    
}
