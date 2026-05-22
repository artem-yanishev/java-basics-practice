package javaCore.OOP_PolymorphismAndInterfaces;

public class Main {
    public static void main(String[] args) {
        ProcessSystem system = new ProcessSystem();
        Processable a = new Document();
        system.makeProcess(a);
        Processable b = new Image();
        system.makeProcess(b);
        Processable c = new Video();
        system.makeProcess(c);
    }
}
