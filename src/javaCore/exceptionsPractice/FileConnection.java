package javaCore.exceptionsPractice;

public class FileConnection implements AutoCloseable {

    public void open() {
        System.out.println("opened");
    }

    public void close() {
        System.out.println("closed");
    }
}
