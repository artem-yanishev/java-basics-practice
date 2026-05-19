package project4;

public class BankService {

    public static BankAccount createAccount(String owner, int balance) {
        try {
            BankAccount bankAccount = new BankAccount(owner, balance);
            return bankAccount;
        } catch (Exception e) {
            return null;
        }
    }
}
