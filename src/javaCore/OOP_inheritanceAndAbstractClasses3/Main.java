package javaCore.OOP_inheritanceAndAbstractClasses3;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Programmer();
        worker.startWork();
        worker.doWork();
        worker.finishWork();
    }
}
