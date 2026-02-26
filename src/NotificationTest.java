// Interface
interface Notification {
    void notifyUser(String message);
}

// Email Notification
class EmailNotification implements Notification {

    String email;

    EmailNotification(String email) {
        this.email = email;
    }

    boolean isValidEmail() {
        return email.contains("@");
    }

    public void notifyUser(String message) {
        if (isValidEmail()) {
            System.out.println("Email sent to " + email + ": " + message);
        } else {
            System.out.println("Invalid Email Address: " + email);
        }
    }
}

// SMS Notification
class SMSNotification implements Notification {

    String phone;

    SMSNotification(String phone) {
        this.phone = phone;
    }

    boolean isValidPhone() {
        return phone.length() == 10;
    }

    public void notifyUser(String message) {
        if (isValidPhone()) {
            System.out.println("SMS sent to " + phone + ": " + message);
        } else {
            System.out.println("Invalid Phone Number: " + phone);
        }
    }
}

// Main class
public class NotificationTest {

    public static void main(String[] args) {

        Notification email1 = new EmailNotification("user@gmail.com");
        Notification email2 = new EmailNotification("usergmail.com");

        Notification sms1 = new SMSNotification("9876543210");
        Notification sms2 = new SMSNotification("12345");

        email1.notifyUser("Welcome via Email!");
        email2.notifyUser("Welcome via Email!");

        System.out.println();

        sms1.notifyUser("Welcome via SMS!");
        sms2.notifyUser("Welcome via SMS!");
    }
}