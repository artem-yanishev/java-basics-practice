package project4;

public class Main {
    public static void main(String[] args) {
        BankAccount a = BankService.createAccount("A", -1);
        if (a != null) {
            a.print();
            a.deposit(100);
            a.print();
            a.withdraw(90);
            a.print();
        }
        BankAccount b = BankService.createAccount("B", 2);
        if (b != null) {
            b.print();
            b.deposit(100);
            b.print();
            b.withdraw(90);
            b.print();
        }
        BankAccount c = BankService.createAccount("", 3);
        if (c != null) {
            c.print();
            c.deposit(100);
            c.print();
            c.withdraw(90);
            c.print();
        }
    }
}
