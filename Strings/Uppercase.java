package Strings;

public class Uppercase {
    public string toUpperCase(String str){
        String upper = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 'a' + 'A');
            }
            upper += ch;
        }
        return upper;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.toUpperCase());
        
    }
}
