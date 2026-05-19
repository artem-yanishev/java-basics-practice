package project1;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        if (name != null && age >= 0) {
            this.name = name;
            this.age = age;
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public String toString() {
        if (name != null && age >= 0) {
            return "Имя: " + name + ", Возраст: " + age;
        }
        return "Некорректный объект Person";
    }

    void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
