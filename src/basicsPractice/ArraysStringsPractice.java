package basicsPractice;

import java.util.Arrays;

public class ArraysStringsPractice {
    public static void main(String[] args) {

        //Task 1
        {
            int[] arr = {2, 4, 6, 8, 10};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }

        //Task 2
        {
            int[] arr = {2, 4, 6, 8, 10};
            int largest = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println(largest);
        }

        //Task 3
        {
            int[] arr = {2, 4, 6, 8, 10};
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }

        //Task 4
        {
            int[] arr = {2, 4, 6, 8, 10};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        }

        //Task 5
        {
            int[] arr = {2, 4, 6, 8, 10};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        //Task 6
        {
            int[] arr = {2, 4, 6, 8, 10};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 5) {
                    System.out.println(arr[i]);
                }
            }
        }

        //Task 7
        {
            int[] arr = {3, 7, 2, 9, 4};
            int smallest = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println(smallest);
        }

        //Task 8
        {
            int[] arr = {3, 7, 2, 9, 4};
            int max = arr[0];
            int secondMax = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
            System.out.println(secondMax);
        }

        //Task 9
        {
            int[] arr = {3, 7, 2, 9, 4, 7, 1, 7};
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 7) {
                    result++;
                }
            }
            System.out.println(result);
        }

        {
            System.out.println("Контрольная.");
        }

        //Task 1
        {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }

        //Task 2
        {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int largest = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            System.out.println(largest);
        }

        //Task 3
        {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int odd = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    odd++;
                }
            }
            System.out.println(odd);
        }

        //Task 4
        {
            int[] arr = {5, 2, 9, 1, 5, 6};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }

        //Task 5
        {
            int[] arr = {5, 2, 9, 1, 5, 6};
            int max = arr[0];
            int secondMax = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
            System.out.println(secondMax);
        }

        //Task 6
        {
            int[] arr = {3, 3, 1, 2, 1};
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + arr[i] + " встречается " + counter + " раз(а).");
                }
            }
        }

        //Task 7
        {
            int[] arr = {4, 1, 4, 2, 1, 3, 2};
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + arr[i] + " встречается " + counter + " раз(а)");
                }
            }
        }

        //Task 8
        {
            int[] arr = {4, 1, 4, 2, 1, 3, 2};
            int maxRepetitions = 0;
            int mostFrequent = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + arr[i] + " встречается " + counter + " раз(а)");
                    if (counter > maxRepetitions) {
                        maxRepetitions = counter;
                        mostFrequent = arr[i];
                    }
                }
            }
            System.out.println("Самые частые числа: " + mostFrequent);
        }

        //Task 9
        {
            int[] arr = {8, 3, 5, 2, 9};
            int sum = 0;
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                sum += arr[i];
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(sum);
            System.out.println(max);
        }

        //Task 10
        {
            int[] arr = {8, 3, 5, 2, 9};
            int number = 3;
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == number) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + number + " встречается " + counter + " раз(а).");
                }
            }
        }

        //Task 10 (reboot)
        {
            int[] arr = {8, 3, 5, 2, 9};
            int number = 3;
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    counter++;
                }
            }
            System.out.println("Число " + number + " встречается " + counter + " раз(а). (reboot)");
        }

        //Task 11
        {
            int[] arr = {5, 3, 8};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        }

        //Task 12
        {
            int[] arr = {5, 3, 8, 2, 7};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        }

        //Task 13
        {
            int[] arr = {5, 3, 8, 2, 7};
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        //Task 14
        {
            int[] arr = {5, -3, 8, -2, 7};
            boolean negative = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    negative = true;
                    break;
                }
            }
            if (negative) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }

        //Task 15
        {
            int[] a = {1, 2, 3};
            int[] b = {1, 2, 3};
            boolean isEqual = true;
            if (a.length != b.length) {
                isEqual = false;
            } else {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) {
                        isEqual = false;
                        break;
                    }
                }
            }
            System.out.println(isEqual);
        }

        {
            System.out.println("Цикл for - each");
        }

        //Task 1
        {
            int[] numbers = {4, 7, 1, 8, 5};
            for (int a : numbers) {
                System.out.println(a);
            }
        }

        //Task 2
        {
            int[] arr = {2, 5, 7, 1, 4};
            int sum = 0;
            for (int a : arr) {
                sum += a;
            }
            System.out.println(sum);
        }

        //Task 3
        {
            int[] arr = {2, 5, 7, 1, 4};
            int counter = 0;
            for (int a : arr) {
                if (a % 2 == 0) {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        //Task 4
        {
            int[] arr = {2, 5, 7, 1, 4};
            int max = arr[0];
            for (int a : arr) {
                if (a > max) {
                    max = a;
                }
            }
            System.out.println(max);
        }

        //Task 5 (Неправильное решение)
        {
            int[] arr = {3, 5, 3, 2, 5, 3};
            for (int a : arr) {
                boolean alreadyCounted = false;
                for (int b = 0; b < a; b++) {
                    if (arr[b] == a) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int c : arr) {
                        if (c == a) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + a + " встречается " + counter + " раз(а).");
                }
            }
        }

        //Task 1
        {
            int[] arr = new int[3];
            arr[0] = 7;
            arr[1] = 8;
            arr[2] = 9;
            System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        }

        //Task 2
        {
            int[] arr = new int[5];
            int number = 10;
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                counter++;
                arr[i] = number * counter;
                System.out.println(arr[i]);
            }
        }

        //Task 2 (reboot)
        {
            int[] arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i + 1) * 10;
                System.out.println(arr[i]);
            }
        }

        //Task 3
        {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i * 2);
                System.out.println(arr[i]);
            }
        }

        //Task 4
        {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr[i] = 1;
                }
                System.out.println(arr[i]);
            }
        }

        //Task 8 (reboot)
        {
            int[] arr = {4, 1, 4, 2, 1, 3, 2};
            int maxRepetitions = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            counter++;
                        }
                    }
                    System.out.println("Число " + arr[i] + " встречается " + counter + " раз(а)");
                    if (counter > maxRepetitions) {
                        maxRepetitions = counter;
                    }
                }
            }
            boolean first = true;
            System.out.print("Самые частые числа: ");
            for (int i = 0; i < arr.length; i++) {
                boolean alreadyCounted = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == arr[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }
                if (!alreadyCounted) {
                    int counter = 0;
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] == arr[i]) {
                            counter++;
                        }
                    }
                    if (counter == maxRepetitions) {
                        if (!first) {
                            System.out.print(", ");
                        }
                        System.out.print(arr[i]);
                        first = false;
                    }
                }
            }
        }

        System.out.println();

        //Task 5
        {
            int[] arr = {3, 6, 9, 12, 15};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] / 3;
                System.out.println(arr[i]);
            }
        }

        //Task 6
        {
            int[] arr = {2, 4, 6, 8};
            for (int i = 0; i < arr.length; i++) {
                arr[i] += 5;
                System.out.println(arr[i]);
            }
        }

        //Task 7
        {
            int[] arr = new int[6];
            for (int i = 0; i < arr.length; i++) {
                if (i % 3 == 0) {
                    arr[i] = 9;
                } else {
                    arr[i] = 0;
                }
                System.out.println(arr[i]);
            }
        }

        System.out.println("Строки.");

        //Task 1
        {
            String text = "Hello";
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i) + " ");
            }
        }

        System.out.println();

        //Task 2
        {
            String text = "Hello";
            int counter = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'l') {
                    counter++;
                }
            }
            System.out.println(counter);
        }

        //Task 3
        {
            String text = "Hello";
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != 'e' && text.charAt(i) != 'o') {
                    System.out.print(text.charAt(i));
                }
            }
        }

        System.out.println();

        //Task 4
        {
            String text = "Hello";
            for (int i = text.length() - 1; i >= 0; i--) {
                System.out.print(text.charAt(i));
            }
        }

        System.out.println();

        //Task 5
        {
            String text = "Hello World";
            System.out.println(text.toUpperCase());
            System.out.println(text);
        }

        //Task 6
        {
            String text = "Hello World 123!";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
            }
        }

        System.out.println();

        //Task 7
        {
            String text = "Hello World 123!";
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                    result += ch;
                }
            }
            System.out.println(result);
        }

        //Task 8
        {
            String text = "He11o W0rld!";
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                    result += ch;
                }
            }
            System.out.println(result);
        }

        //Task 9
        {
            String text = "Java123Rocks!";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                    System.out.print(ch);
                }
            }
        }

        System.out.println();

        //Task 10
        {
            String text = "Hello2026World!";
            int letter = 0;
            int digit = 0;
            int other = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    letter++;
                } else if (Character.isDigit(ch)) {
                    digit++;
                } else {
                    other++;
                }
            }
            System.out.println("Букв: " + letter + '\n' + "Цифр: " + digit + '\n' + "Остальных символов: " + other);
        }

        //Task 11
        {
            String text = "Practice123";
            String result = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                if (Character.isLetter(text.charAt(i))) {
                    result = text.charAt(i) + result;
                }
            }
            System.out.println(result);
        }

        //Task 12
        {
            String text = "Java-2026-Rocks!";
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isDigit(ch)) {
                    ch = '*';
                } else if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                }
                result += ch;
            }
            System.out.println(result);
        }

        //Task 13
        {
            String text = "Java-2026-Rocks!";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isDigit(ch)) {
                    ch = '*';
                } else if (Character.isLetter(ch)) {
                    ch = Character.toLowerCase(ch);
                }
                sb.append(ch);
            }
            System.out.println(sb);
        }

        //Task 14
        {
            String text = "JaVa_2026_RoCkS!";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    sb.append(ch);
                }
            }
            String result = sb.toString();
            StringBuilder finalResult = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                char ch = result.charAt(i);
                if (i % 2 != 0) {
                    ch = Character.toUpperCase(ch);
                }
                finalResult.append(ch);
            }
            System.out.println(finalResult);
        }

        //Task 15
        {
            String text = "HeLlO_2026_wOrLd!";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    sb.append(ch);
                }
            }
            String result = sb.toString();
            StringBuilder finalResult = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                char ch = result.charAt(i);
                if (i % 2 != 0) {
                    ch = Character.toUpperCase(ch);
                }
                finalResult.append(ch);
            }
            System.out.println(finalResult);
        }

        //Task 16
        {
            String text = "JaVa_2026_RoCkS!";
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    counter++;
                    if (counter % 2 == 0) {
                        ch = Character.toUpperCase(ch);
                    }
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }

        //Task 17
        {
            String text = "CoDe_2026_IsFuN!";
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    counter++;
                    if (counter % 2 == 0) {
                        ch = Character.toUpperCase(ch);
                    }
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }

        //Task 18
        {
            String text = "Pa$$w0rd_2026!";
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            int letters = 0;
            String result = "";
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    counter++;
                    if (counter % 2 != 0) {
                        ch = Character.toUpperCase(ch);
                    }
                    letters++;
                    sb.append(ch);
                }
            }
            result = sb.toString();
            System.out.println("Вход: " + text + '\n' + "Выход: " + result + '\n' + "Количество букв: " + letters);
        }

        //Task 19
        {
            String text = "HeLlo_2026_WoRLd!";
            StringBuilder sb = new StringBuilder();
            String result = "";
            int counter = 0;
            int smallLetters = 0;
            int largeLetters = 0;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    counter++;
                    if (ch == Character.toUpperCase(ch)) {
                        largeLetters++;
                    } else {
                        smallLetters++;
                    }
                    if (counter % 2 == 0) {
                        ch = Character.toUpperCase(ch);
                    }
                    sb.append(ch);
                }
            }
            result = sb.toString();
            System.out.println("Вход: " + text + '\n' + "Выход: " + result + '\n' +
                    "Малые: " + smallLetters + '\n' + "Большие: " + largeLetters);
        }

        //Task 20
        {
            String text = "HeLlo_World!";
            text = text.replace("_", "");
            text = text.replace("!", "");
            text = text.toLowerCase();
            text = text.substring(1, 8);
            System.out.println(text);
        }

        //Task 21
        {
            String text = "user_2026_admin!";
            System.out.println(
                    text.contains("admin") + ", " +
                            text.startsWith("user") + ", " +
                            text.endsWith("!"));
        }

        //Task 22
        {
            String text = "user_2026_admin";
            int result = text.indexOf("admin");
            System.out.println("(admin) index: " + result);
        }

        //Task 23
        {
            String text = "user_2026_admin";
            String search = "admin";
            System.out.println(text.substring(text.indexOf(search)));
        }

        //Task 24
        {
            String text = "user_2026_admin";
            String text2 = "guest_2026_user";
            String search = "admin";
            if (text.indexOf(search) >= 0) {
                String result = text.substring(text.indexOf(search));
                if (result.equals(search)) {
                    System.out.println(text.substring(0, 4));
                }
            }
            if (text2.indexOf(search) >= 0) {
                String result2 = text2.substring(text2.indexOf(search));
                if (result2.equals(search)) {
                    System.out.println(text.substring(0, 5));
                }
            }
        }

        //Task 25
        {
            String text = "  user_2026_ADMIN_log  ";
            String search = "admin";
            String result = "";
            int numberOfLetters = search.length();
            text = text.replace(" ", "");
            text = text.toLowerCase();
            int index = text.indexOf(search);
            if (text.contains(search)) {
                result = text.substring(index, index + numberOfLetters);
            }
            System.out.println(result + '\n' + "Количество букв: " + numberOfLetters);
        }

        //Task 26
        {
            String data = "  UsEr_2026_AdMiN!  ";
            String data2 = data;
            data2 = data2.trim();
            data2 = data2.toLowerCase();
            String user = "";
            if (data2.contains("admin")) {
                user = "админ";
            }
            int numberOfLetters = 0;
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < data2.length(); i++) {
                char ch = data2.charAt(i);
                if (Character.isLetter(ch)) {
                    numberOfLetters++;
                    if (numberOfLetters % 2 == 0) {
                        sb2.append(ch);
                    }
                }
            }
            System.out.println("Исходная строка: " + data + '\n'
                    + "Чётные буквы: " + sb2 + '\n'
                    + "Количество букв: " + numberOfLetters + '\n'
                    + "Пользователь - " + user);
        }

        {
            String text = "user_2026_admin";

// 1. убираем цифры
            text = text.replaceAll("[0-9]", "");

// 2. делим по "_"
            String[] parts = text.split("_");

// 3. вывод
            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[i] + ", ");
            }
        }

        System.out.println();

        {
            String text = ", 1, 2, 3, 4, 5, 6, ";
            text = text.replace(" ", "");
            String[] arr = text.split(",");
            System.out.println(Arrays.toString(arr));
        }

        //Task 27
        {
            String text = " 1 , 2 ,  , 3 , 4 ";
            text = text.replace(" ", "");
            String[] arr = text.split(",");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();

        //Task 28
        {
            String text = " , a,  , b, c , , d ";
            text = text.replace(" ", "");
            String[] arr = text.split(",");
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].equals("")) {
                    counter++;
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.println();
            System.out.println("Букв: " + counter);
        }

        //Task 29
        {
            String text = " User1 , , AdMiN , , Guest , user2 , ";
            text = text.replace(" ", "");
            text = text.toLowerCase();
            String[] arr = text.split(",");
            int counter = 0;
            int numberOfLetters = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].isEmpty()) {
                    for (int j = 0; j < arr[i].length(); j++) {
                        if (Character.isLetter(arr[i].charAt(j))) {
                            numberOfLetters++;
                        }
                    }
                    counter++;
                    System.out.println(counter + ": " + arr[i]);
                }
            }
            System.out.println("Букв: " + numberOfLetters);
        }

        //Task 30
        {
            String text = "  apple, Banana , , ORANGE, apple , banana  , ";
            text = text.replace(" ", "");
            text = text.toLowerCase();
            String[] arr = text.split(",");
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].isEmpty()) {
                    boolean alreadyCounted = false;
                    for (int j = 0; j < i; j++) {
                        if (arr[i].equals(arr[j])) {
                            alreadyCounted = true;
                            break;
                        }
                    }
                    if (!alreadyCounted) {
                        counter++;
                        System.out.println(arr[i]);
                    }
                }
            }
            System.out.println("Уникальных: " + counter);
        }

        //Task 1 (Arrays)
        {
            int[] arr = {1, 2, 3, 4, 5};
            int counter = arr.length;
            int numberOfAdd = 1;
            int number = 10;
            int[] result = new int[counter + numberOfAdd];
            if (numberOfAdd != 0) {
                for (int i = 0; i < arr.length; i++) {
                    result[i] = arr[i];
                }
                result[result.length - 1] = number;
            }
            System.out.println(Arrays.toString(result));
        }

        //Task 2
        {
            int[] arr = {1, 2, 3, 4, 5};
            int counter = 5;
            for (int i = 2; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            counter--;
            for (int i = 0; i < counter; i++) {
                System.out.print(arr[i]);
            }
        }

        System.out.println();
    }
}
