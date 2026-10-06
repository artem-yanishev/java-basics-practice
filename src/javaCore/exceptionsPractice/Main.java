package javaCore.exceptionsPractice;

public class Main {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Division by zero");
        }
        return a / b;
    }

    public static void textLength(String text) {
        if (text == null) {
            throw new RuntimeException("Text is null");
        }
        System.out.println("Text length: " + text.length());
    }

    public static void safeDivide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Cannot divide by zero");
        }
        System.out.println(a / b);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new AgeTooLowException("Age too low");
        }
        System.out.println("Access allowed");
    }

    public static void checkPassword(String password) {
        if (password == null || password.length() < 8) {
            throw new InvalidPasswordException("Password too short");
        }
        System.out.println("Password is valid");
    }

    public static void withdraw(int balance, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new BalanceTooLowException("Too low balance");
        }
        System.out.println("Money withdrawn");
    }

    public static void main(String[] args) {
//        try {
//            System.out.println("start");
//            divide(10, 0);
//            System.out.println("finish");
//        } catch (RuntimeException r) {
//            System.out.println("not finished");
//            System.out.println(r);
//        }
//        System.out.println("Program continues");

//        try {
//            System.out.println("start");
//            textLength(null);
//            System.out.println("finish");
//        } catch (RuntimeException r) {
//            System.out.println("not finished");
//            System.out.println(r.getMessage());
//        }
//        System.out.println("Program still works");

//        try {
//            System.out.println("start");
//            safeDivide(10, 0);
//            System.out.println("finish");
//        } catch (RuntimeException r) {
//            System.out.println(r.getMessage());
//        } finally {
//            System.out.println("Method finished");
//        }

//        try {
//            System.out.println("start");
//            AccessService.checkAccess("ADMIN");
//            AccessService.checkAccess("USER");
//            AccessService.checkAccess(null);
//            System.out.println("finish");
//        } catch (RuntimeException r) {
//            System.out.println(r.getMessage());
//        }

//        try {
//            System.out.println("start");
//            checkAge(17);
//            System.out.println("finish");
//        } catch (AgeTooLowException a) {
//            System.out.println("Access denied");
//        }

//        try {
//            System.out.println("start");
//            checkPassword("QWERTY1");
//            System.out.println("finish");
//        } catch (InvalidPasswordException i) {
//            System.out.println(i.getMessage());
//        }

//        try {
//            System.out.println("start");
//            withdraw(100, 200);
//            System.out.println("finish");
//        } catch (IllegalArgumentException exception) {
//            System.out.println(exception.getMessage());
//        } catch (BalanceTooLowException b) {
//            System.out.println(b.getMessage());
//        }

        try (FileConnection connection = new FileConnection()) {
            System.out.println("start");
            throw new RuntimeException("exception");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Another code");
    }
}
