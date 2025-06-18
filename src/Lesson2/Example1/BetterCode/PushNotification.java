package Lesson2.Example1.BetterCode;

public class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Push notification");
    }
}

/*
If you are following OCP then mostly SRP will also be sorted for us
 */
