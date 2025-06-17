package Lesson2.Example1.BetterCode;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
