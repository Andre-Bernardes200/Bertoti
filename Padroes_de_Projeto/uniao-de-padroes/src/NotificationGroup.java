import interfaces.NotificationComponent;

import java.util.ArrayList;
import java.util.List;

// Composite: Representa um grupo de notificações
public class NotificationGroup implements NotificationComponent {
    private List<NotificationComponent> notifications = new ArrayList<>();

    public void add(NotificationComponent notification) {
        notifications.add(notification);
    }

    public void sendNotifications() {
        for (NotificationComponent notification : notifications) {
            notification.sendNotifications();
        }
    }
}
