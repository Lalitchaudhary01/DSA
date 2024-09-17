package Strings;

public class Compare {
    public static void comparing(String str1, String str2) {
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        
    }
    public static void main (String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "world";
        comparing(str1, str2);
        comparing(str1, str3);
         
    }
}
