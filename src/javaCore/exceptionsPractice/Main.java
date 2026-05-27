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

        try {
            System.out.println("start");
            AccessService.checkAccess("ADMIN");
            AccessService.checkAccess("USER");
            AccessService.checkAccess(null);
            System.out.println("finish");
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        }


    }
}
