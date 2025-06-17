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
