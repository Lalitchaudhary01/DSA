public class LengthString {
    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        }
        return length(str.substring(1)) + 1;

    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(length(str));
        
    }
}
