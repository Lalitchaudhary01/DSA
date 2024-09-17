package Strings;

public class ShortestPath {
    public static void path(String str) {
        int x = 0, y = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'R'){
                x++;
            }
            else if(str.charAt(i) == 'L'){
                x--;
            }
            else if(str.charAt(i) == 'U'){
                y++;
            }
            else if(str.charAt(i) == 'D'){
                y--;
            }
        }
        System.out.println("("+x+","+y+")");


        
    }
    public static void main(String[] args){
        String str = "RRDDLL";
        
    }
    
}
