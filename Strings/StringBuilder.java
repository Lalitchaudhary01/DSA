package Strings;

public class StringBuilder {

    public StringBuilder(String string) {
    }

    public StringBuilder append(char ch) {
        // Implementation of append method
        return this;
    }
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
    
}
