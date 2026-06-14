package javaCore.exceptionsPractice;

public class FileConnection implements AutoCloseable {

    public FileConnection() {
        super();
        System.out.println("Connection opened");
    }

    public void close() {
        System.out.println("Connection closed");
    }
}
