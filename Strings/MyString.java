
public class MyString {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++){
           System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        // la
        // strimg are immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
         
        //String le
        String name = "Rahul";
        System.out.println(name.length());
        
        //concatenation
        String name1 = "Rahul";
        String name2 = "Sharma";
        System.out.println(name1 + " " + name2);
        System.out.println(name1.concat(name2));

        //substring
        String name3 = "Rahul";
        System.out.println(name3.substring(1, 4));

        System.out.println(name3.charAt(3));

        

        
    }
}
