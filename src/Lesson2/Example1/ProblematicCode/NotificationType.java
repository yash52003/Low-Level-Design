package Lesson2.Example1.ProblematicCode;

public enum NotificationType{
    EMAIL,
    SMS,
    WHATSAPP;

    public void sendSMSNotification() {
        System.out.println("Sending SMS notification: ");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email notification: ");
    }

    public void sendWhatsAppNotification() {
        System.out.println("Sending WhatsApp notification: ");
    }
}

/*
SRP if Followed - The only reason to change this class is add a new notification type

What are the problems in this code NotificationSender class knows toomuch about the NotificationType class
// Adding a new notification type bounds us to the modification of NotificationSender Class = We are not able to extend the code without modifying the class

This situation violates the open closed principle - A class should be open for extension but closed for modification.

How can we improve this code
 */
