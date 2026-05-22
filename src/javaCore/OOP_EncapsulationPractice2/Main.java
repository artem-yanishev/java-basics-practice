package javaCore.OOP_EncapsulationPractice2;

public class Main {
    public static void main(String[] args) {
        User a = UserService.createUser(null, 1);
        if (a != null) {
            a.print();
            a.changeAge(2);
            a.print();
        }
        User b = UserService.createUser("aboba", 5);
        if (b != null) {
            b.print();
            b.changeAge(2);
            b.print();
        }
        User c = UserService.createUser("Good", 0);
        if (c != null) {
            c.print();
            c.changeAge(2);
            c.print();
        }
    }
}
