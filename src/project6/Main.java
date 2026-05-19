package project6;

public class Main {
    public static void main(String[] args) {

        Process process = new EmailProcess();
        process.preparation();
        process.execution();
        process.completion();
    }
}
