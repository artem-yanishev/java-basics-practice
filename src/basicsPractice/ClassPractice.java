package basicsPractice;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Task 1
    void sayHello() {
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет/год(а)");
    }

    //Task 2
    void isAdult() {
        if (age >= 18) {
            System.out.println(name + " является совершеннолетним");
        } else {
            System.out.println(name + " не достиг 18 лет");
        }
    }

    //Task 3
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}

public class ClassPractice {
    public static void main(String[] args) {

        Person p1 = new Person("Артём", 22);
        Person p2 = new Person("ChatGPT", 2);
        p1.sayHello();
        p2.sayHello();
        p1.isAdult();
        p2.isAdult();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.setAge(0);
        p1.setAge(-1);
        p1.setAge(22);
    }
}
