package OOPS;

public class AcccessModifiers {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.name = "John";
        
        // account.password = "password"; // This line will give an error
    }
    
}
class BankAccount{
    public  String name;
    private String  password;

}

