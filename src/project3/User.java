package project3;

public class User {

    private String login;
    private int age;

    public User(String login, int age) {
        if (login == null || login.isEmpty()) {
            throw new RuntimeException();
        }
        this.login = login;
        if (age <= 0) {
            throw new RuntimeException();
        }
        this.age = age;
    }

    public void changeAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public void print() {
        System.out.println(login + " " + age);
    }
}
