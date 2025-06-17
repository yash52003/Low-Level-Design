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
 */
