package javaCore.OOP_PolymorphismAndInterfaces2;

public class PushNotifier implements Notifier{

    @Override
    public void notifyUser(String message) {
        System.out.println("PUSH: " + message);
    }
}
