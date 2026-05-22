package basicsPractice;

public class ObjectMethodsPractice {

    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Некорректное значение!");
            return -1;
        }
    }

    static void check() {
        System.out.println("IN");
        throw new RuntimeException("fail");
    }

    static void check(int x) {
        if (x < 0) {
            throw new RuntimeException("negative");
        }
        System.out.println("OK");
    }

    static void a() {
        System.out.println("A");
        b();
    }

    static void b() {
        System.out.println("B");
        if (true) {
            throw new RuntimeException("fail");
        }
    }

    static void test() {
        System.out.println("A");
        inner();
    }

    static void inner() {
        System.out.println("B");
        if (true) {
            throw new RuntimeException();
        }
        System.out.println("C");
    }

    static int test1() {
        int x = 10;
        try {
            if (x > 5) {
                return x;
            }
        } finally {
            x = x + 100;
        }
        return x;
    }

    static int test2() {
        int x = 5;
        try {
            if (x == 5) {
                x = 20;
                return x;
            }
        } finally {
            x = 50;
        }
        return x;
    }

    public static void main(String[] args) {
        String text = null;
        System.out.println("Start");
        try {
            System.out.println(text.length());
            System.out.println("End");
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("Task 1");
        System.out.println("Start");
        try {
            check();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("END");

        System.out.println("Task 2");
        System.out.println("START");
        try {
            check(1);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("END");

        System.out.println("Task 3");
        System.out.println("START");
        try {
            a();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println("FINISH");
        System.out.println("END");

        System.out.println("Task 4");
        System.out.println(1);
        try {
            test();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        System.out.println(2);

        System.out.println("Task 5");
        try {
            int x = 10 / 0;
            System.out.println("TRY");
        } catch (Exception e) {
            System.out.println("CATCH");
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("Task 6");
        System.out.println(test1());

        System.out.println("Task 7");
        System.out.println(test2());
    }
}
