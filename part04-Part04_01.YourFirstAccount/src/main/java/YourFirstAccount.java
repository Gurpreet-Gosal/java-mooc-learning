
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account carlosAccount = new Account("Carlo's account", 100.00);

        System.out.println(carlosAccount);

        carlosAccount.deposit(20);
        System.out.println("The balance of Carlo's other account is now: " + carlosAccount);

    }
}
