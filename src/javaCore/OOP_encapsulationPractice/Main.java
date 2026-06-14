package javaCore.OOP_encapsulationPractice;

public class Main {
    public static void main(String[] args) {
        Book a = BookFactory.create(null, 1);
        if (a != null) {
            a.print();
        }
        Book warAndWorld = BookFactory.create("War and World", 1000000);
        if (warAndWorld != null) {
            warAndWorld.print();
        }
        Book b = BookFactory.create("Good", 0);
        if (b != null) {
            b.print();
        }
    }
}
