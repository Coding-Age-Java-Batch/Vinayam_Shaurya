interface Notifier {
    void sendNotification(String msg);
}

// Email Notifier
class EmailNotifier implements Notifier {

    public void sendNotification(String msg) {
        System.out.println("Email Notification Sent: " + msg);
    }
}

// SMS Notifier
class SMSNotifier implements Notifier {

    public void sendNotification(String msg) {
        System.out.println("SMS Notification Sent: " + msg);
    }
}

// Push Notifier
class PushNotifier implements Notifier {

    public void sendNotification(String msg) {
        System.out.println("Push Notification Sent: " + msg);
    }
}

// Main class
public class NotificationTest {

    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();
        Notifier push = new PushNotifier();

        email.sendNotification("Welcome!");
        sms.sendNotification("Welcome!");
        push.sendNotification("Welcome!");
    }
}