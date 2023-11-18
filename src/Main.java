public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, "Gulkaiyr Toktomusheva");

        account.deposit(1000.0);

        try {
            account.withdraw(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Transaction History for " + account.getAccountHolder());
        account.printTransactionHistory();

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
