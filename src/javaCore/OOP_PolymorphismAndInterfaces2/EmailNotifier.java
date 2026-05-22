package javaCore.OOP_PolymorphismAndInterfaces2;

public class EmailNotifier implements Notifier {

    @Override
    public void notifyUser(String message) {
        System.out.println("EMAIL: " + message);
    }
}
