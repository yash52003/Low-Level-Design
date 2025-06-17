package Lesson2.Example1.ProblematicCode;
import java.util.List;
public class NotifcationSender {
    public void sendNotifications(List<NotificationType> notificationTypes, String message) {

        for (NotificationType type : notificationTypes) {
            switch (type) {
                case EMAIL:
                    type.sendEmailNotification();
                    break;
                case SMS:
                    type.sendSMSNotification();
                    break;
                case WHATSAPP:
                    type.sendWhatsAppNotification();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown notification type: " + type);
            }
        }

    }
}

/*
We should not depend on the concrete classes in order to move forward instead of concreate classes we should depend on the abstractions Whenever we think about the abstractions Ploymorphism comes into the picture - We will have the interface. On that interface we can build multiple concrete classes
 */
