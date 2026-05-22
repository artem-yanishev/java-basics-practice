package basicsPractice;

import java.util.Arrays;

public class MethodsPractice {

    //Task 1
    static void printHi() {
        System.out.println("Hi");
    }

    //Task 2
    static int sum() {
        return 5 + 7;
    }

    //Task 3
    static int multiply(int a, int b) {
        return a * b;
    }

    //Task 4
    static String greet(String name) {
        return "Hello, " + name;
    }

    //Task 5
    static int multiplyByThree(int number) {
        return number * 3;
    }

    //Task 6
    static int countVowels(String text) {
        int countVowels = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'а' || ch == 'е' || ch == 'ё' || ch == 'и' || ch == 'о' ||
                    ch == 'у' || ch == 'ы' || ch == 'э' || ch == 'ю' || ch == 'я') {
                countVowels++;
            }
        }
        return countVowels;
    }

    //Task 7
    static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Task 8
    static void printRepeat(String text, int times) {
        if (times > 0) {
            for (int i = 0; i < times; i++) {
                System.out.println(text);
            }
        }
    }

    //Task 9
    static int square(int number) {
        return number * number;
    }

    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    //Task 10
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //Task 11
    static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number == 0) {
            return "Zero";
        }
        return "Negative";
    }

    //Task 12
    static int sum(int a, int b) {
        return a + b;
    }

    static int doubleSum(int a, int b) {
        return sum(a, b) * 2;
    }

    //Task 13
    static int cube(int number) {
        return number * number * number;
    }

    //Task 14
    static int sumOfSquaresAndCube(int a, int b, int c) {
        return sumOfSquares(a, b) + cube(c);
    }

    //Task 15
    static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                counter++;
            }
        }
        return counter;
    }

    //Task 16
    static int findMaxEven(int[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int maxEven = 0;
        boolean foundEven = false;
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                if (!foundEven || numbers[i] > maxEven) {
                    maxEven = numbers[i];
                    foundEven = true;
                }
            }
        }
        if (!foundEven) {
            return -1;
        }
        return maxEven;
    }

    // Task 17
    static int findMinOdd(int[] numbers1) {
        if (numbers1.length == 0) {
            return -1;
        }
        int minOdd = 0;
        boolean foundOdd = false;
        for (int i = 0; i < numbers1.length; i++) {
            if (!isEven(numbers1[i])) {
                if (!foundOdd || numbers1[i] < minOdd) {
                    minOdd = numbers1[i];
                    foundOdd = true;
                }
            }
        }
        if (!foundOdd) {
            return -1;
        }
        return minOdd;
    }

    //Task 18
    static int[] removeElement(int[] arr, int index, int counter) {
        if (arr.length != 0 && counter != 0) {
            for (int i = index; i < counter - 1; i++) {
                arr[i] = arr[i + 1];
            }
            counter--;
        }
        System.out.println("Массив после удаления: " + Arrays.toString(arr));
        System.out.println("Текущая длина (counter): " + counter);
        return arr;
    }

    //Task 19
    static int[] replaceElement(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
            System.out.println("Массив после изменения значения по индексу " + index + ": " + Arrays.toString(arr));
        } else {
            System.out.println("Неверный индекс! (от 0 до массив.length - 1)");
        }
        return arr;
    }

    //Task 20
    static void removeFirst(int[] arr, int value, int counter) {
        if (counter > 0) {
            if (counter <= arr.length) {
                int index = -1;
                for (int i = 0; i < counter; i++) {
                    if (arr[i] == value) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    for (int i = index; i < counter - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    counter--;
                    System.out.println("Значение " + value + " успешно удалено!" + '\n' +
                            "Текущее состояние массива: " + Arrays.toString(arr) + '\n' +
                            "Текущая длина массива: " + counter);
                    return;
                }
                System.out.println("Значение " + value + " не найдено!");
                System.out.println("Текущее состояние массива: " + Arrays.toString(arr));
            } else {
                System.out.println("Ошибка: counter больше длины массива!");
            }
        } else {
            System.out.println("Массив пустой!");
        }
    }

    //Task 21
    static void RemoveFirstElementByCharacter(String[] arrString, char character, int counter) {
        if (counter == 0) {
            System.out.println("Массив пустой!");
        } else if (counter > arrString.length) {
            System.out.println("Ошибка: counter больше длины массива!");
        } else if (counter < 0) {
            System.out.println("Ошибка: counter меньше нуля!");
        } else {
            int index = -1;
            for (int i = 0; i < counter; i++) {
                if (arrString[i].charAt(0) == character) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < counter - 1; i++) {
                    arrString[i] = arrString[i + 1];
                }
                counter--;
                System.out.println("Первый элемент, начинающийся на символ (" + character + ") успешно удалён.");
                System.out.print("Текущее состояние массива: ");
                for (int i = 0; i < counter; i++) {
                    System.out.print(arrString[i] + " ");
                }
                System.out.println();
                System.out.println("Текущая длина массива: " + counter);
            } else {
                System.out.println("Элемент, начинающийся на символ (" + character + ") не найден!");
            }
        }
    }

    public static void main(String[] args) {

        printHi();
        printHi();
        printHi();
        System.out.println(sum());
        System.out.println(multiply(7, 5));
        System.out.println(greet("Артём"));
        System.out.println(multiplyByThree(5));
        System.out.println(countVowels("Пиво ссать гоняет."));
        System.out.println(maxOfTwo(1, 0));
        System.out.println(maxOfTwo(2, -3));
        System.out.println(maxOfTwo(100, 100));
        printRepeat("Писька", 3);
        System.out.println(sumOfSquares(3, 4));
        System.out.println(isEven(4));
        System.out.println(checkNumber(1));
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(-1));
        System.out.println(doubleSum(1, 2));
        System.out.println(cube(3));
        System.out.println(sumOfSquaresAndCube(1, 2, 3));
        int[] numbers = {-99, -77, -2, 1, 2, 3, 4, 5, 6};
        System.out.println(countEvenNumbers(numbers));
        System.out.println(findMaxEven(numbers));
        int[] numbers1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(findMinOdd(numbers1));
        {
            int[] arr = {-3, -2, -1, 0, 1, 2, 3, 4, 5};
            int counter = 9;
            removeElement(arr, 2, counter);
            counter--;
            removeElement(arr, 2, counter);
            counter--;
            removeElement(arr, 2, counter);
            counter--;
        }
        int[] arr = {-1, 0, 1, 2, 3};
        replaceElement(arr, 1, 66);
        replaceElement(arr, 0, -55);
        replaceElement(arr, 4, 99);
        replaceElement(arr, 5, 111);
        arr = new int[]{5, 3, 7, 3, 9};
        removeFirst(arr, 3, 5);
        removeFirst(arr, 8, 4);
        arr = new int[]{};
        removeFirst(arr, 1, 0);
        removeFirst(arr, 1, 1);
        String[] arrString = {"apple", "banana", "avocado", "grape", "apricot"};
        RemoveFirstElementByCharacter(arrString, 'a', 5);
        RemoveFirstElementByCharacter(arrString, '1', 4);
    }
}
