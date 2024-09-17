package Strings;

public class Substring {
    public static String substr( String str, int si, int ei){
        String substr = "";

        for(int i=si; i<=ei; i++){
            substr += str.charAt(i);

        }
        return substr;

        
    }
    public static void main(String[] args) {
        
        String str = "Hello World";
        System.out.println(substr(str, 1, 4));
        
    }
}
