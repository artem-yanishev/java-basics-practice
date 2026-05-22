package javaCore.OOP_PolymorphismAndInterfaces2;

public class NotificationService {

    public void send(Notifier notifier, String message) {
        notifier.notifyUser(message);
    }
}
