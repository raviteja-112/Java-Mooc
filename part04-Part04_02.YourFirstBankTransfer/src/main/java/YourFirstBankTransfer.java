
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account matthwes = new Account("Matthews account",1000);
        Account my = new Account("My account",0);
        
        matthwes.withdrawal(100);
        my.deposit(100);
        
        System.out.println(matthwes.toString());
        System.out.println(my.toString());
    }
}
