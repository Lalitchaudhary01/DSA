public class RemoveDuplicates {
    public static String removeDuplicates(String name) {
        if (name.length() == 0) {
            return "";
        }
        char ch = name.charAt(0);
        String ans = removeDuplicates(name.substring(1));
        if (ans.length() > 0 && ans.charAt(0) == ch) {
            return ans;
        }
        return ch + ans;
    }
   public static void main(String[] args) {
        String name = "aaabbbccc";
        System.out.println(removeDuplicates(name));


   }

}
