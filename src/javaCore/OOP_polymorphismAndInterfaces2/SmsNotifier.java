package javaCore.OOP_polymorphismAndInterfaces2;

public class SmsNotifier implements Notifier{

    @Override
    public void notifyUser(String message) {
        System.out.println("SMS: " + message);
    }
}
