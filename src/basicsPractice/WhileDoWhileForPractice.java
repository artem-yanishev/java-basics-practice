package basicsPractice;

public class WhileDoWhileForPractice {
    public static void main(String[] args) {

        //Task 1
        {
            int i = 1;
            while (i <= 5) {
                System.out.println(i);
                i++;
            }
        }

        //Task 2
        {
            int i = 5;
            while (i >= 1) {
                System.out.println(i);
                i--;
            }
        }

        //Task 3
        {
            int i = 1;
            while (i <= 10) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        //Task 4
        {
            int i = 1;
            while (i <= 15) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }

        //Task 5
        {
            int i = 0;
            int counter = 0;
            while (i <= 10) {
                counter += i;
                i++;
            }
            System.out.println(counter);
        }

        //Task 1
        {
            int i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= 5);
        }

        //Task 2
        {
            int i = 5;
            do {
                System.out.println(i);
                i--;
            } while (i >= 1);
        }

        //Task 2.1
        {
            int i = 6;
            do {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i--;
            } while (i >= 1);
        }

        //Task 3
        {
            int i = 1;
            int sum = 0;
            do {
                if (i % 2 != 0) {
                    sum += i;
                }
                i++;
            } while (i <= 10);
            System.out.println(sum);
        }

        //Task 4
        {
            int i = 8;
            do {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i--;
            } while (i > 0);
        }

        //Task 1
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }

        //Task 2
        {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }

        //Task 3
        {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        //Task 3.1
        {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(i);
            }
        }

        //Task 4
        {
            for (int i = 1; i <= 15; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        //Task 5
        {
            for (int i = 1; i <= 20; i++) {
                if (i % 4 == 0 && i % 6 == 0) {
                    System.out.println("QuadHex");
                } else if (i % 4 == 0) {
                    System.out.println("Quad");
                } else if (i % 6 == 0) {
                    System.out.println("Hex");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
