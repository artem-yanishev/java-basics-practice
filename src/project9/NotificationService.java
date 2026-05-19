package project9;

public class NotificationService {

    public void send(Notifier notifier, String message) {
        notifier.notifyUser(message);
    }
}
