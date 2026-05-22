package javaCore.OOP_EncapsulationPractice3;

public class BankAccount {

    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        if (owner == null || owner.isEmpty()) {
            throw new RuntimeException();
        }
        this.owner = owner;
        if (balance < 0) {
            throw new RuntimeException();
        }
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public void print() {
        System.out.println(owner + " " + balance);
    }
}
