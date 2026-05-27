package javaCore.exceptionsPractice;

public class Main {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("start");
            divide(10, 0);
            System.out.println("finish");
        } catch (RuntimeException r) {
            System.out.println("not finished");
            System.out.println(r);
        }
        System.out.println("Program continues");
    }
}
