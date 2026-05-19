package practice;

public class IfElsePractice {
    public static void main(String[] args) {

        //Task 1 Положительное или отрицательное
        int x = 0;
        if (x > 0) {
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        //Task 2 Чётное или нечётное
        int n = 0;
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //Task 3 Максимум из двух
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("equal");
        }

        //Task 4 Максимум из трёх
        int c = 10;
        int d = 20;
        int e = 15;
        if (c > d && c > e) {
            System.out.println(c);
        } else if (d > e) {
            System.out.println(d);
        } else {
            System.out.println(e);
        }

        //Челлендж (task 4)
        if (c == d && c == e) {
            System.out.println("all equal");
        } else if (c >= d && c >= e) {
            System.out.println(c + " is max");
        } else if (d >= e && d >= c) {
            System.out.println(d + " is max");
        } else {
            System.out.println(e + " is max");
        }

        //Task 5.1 Массив + for
        int[] arr = {3, 7, 2, 9, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        //Task 5.2
        arr = new int[] {3, 7, 2, 9, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        //Task 5.3
        arr = new int[]{3, 7, 2, 9, 5, 4, 6};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);

        //Task 5.4
        arr = new int[]{3, 7, 2, 9, 5, 4, 6};
        int sumresult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumresult += arr[i];
            }
        }
        System.out.println(sumresult);

        //Task 5.5
        arr = new int[]{3, 7, 2, 9, 5};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

        //Task 5.6
        arr = new int[]{3, -7, 2, 9, 5};
        boolean negative = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative = true;
                break;
            }
        }
        System.out.println(negative);

        //Task 1 (reboot)
        int temperature = -3;
        if (temperature < 0) {
            System.out.println("freezing");
        } else if (temperature >= 0 && temperature <= 20) {
            System.out.println("warm");
        } else {
            System.out.println("hot");
        }

        //Task 2 (reboot)
        int number = 14;
        if (number % 3 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("not divisible");
        }

        //Task 3 (reboot)
        String password = "qwerty123";
        if ("admin123".equals(password)) {
            System.out.println("access granted");
        } else {
            System.out.println("access denied");
        }

        //Task 4 (reboot)
        int age = 16;
        boolean hasPermission = true;
        if (age >= 18 || (age >= 16 && hasPermission)) {
            System.out.println("allowed");
        } else {
            System.out.println("not allowed");
        }
    }
}
