package javaCore.OOP_polymorphismAndInterfaces2;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Notifier a = new EmailNotifier();
        service.send(a, "Hello!");
        Notifier b = new SmsNotifier();
        service.send(b, "Hello!");
        Notifier c = new PushNotifier();
        service.send(c, "Hello!");

        Notifier notifier = new Notifier() {
            @Override
            public void notifyUser(String message) {
                System.out.println("TELEGRAM: " + message);
            }
        };
        service.send(notifier, "Hello!");

    }
}
