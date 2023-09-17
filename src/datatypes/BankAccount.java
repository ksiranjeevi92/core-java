package datatypes;

public class BankAccount {
    static String bankName = "Bank of America";

    String accountHolderName;

    String accountNumber;
    float balance;

    boolean isActive;

    BankAccount(){}

    public static void main(String[] args) {
        double interestRate = 7.5;

        BankAccount bankAccount = new BankAccount();

        System.out.println(BankAccount.bankName);

        System.out.println(bankAccount.accountHolderName);

        System.out.println(bankAccount.accountNumber);

        System.out.println(bankAccount.balance);
    }
}
