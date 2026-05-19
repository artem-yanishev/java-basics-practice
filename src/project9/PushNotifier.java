package project9;

public class PushNotifier implements Notifier{

    @Override
    public void notifyUser(String message) {
        System.out.println("PUSH: " + message);
    }
}
