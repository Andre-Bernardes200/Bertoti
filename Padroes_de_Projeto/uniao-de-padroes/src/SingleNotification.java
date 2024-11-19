import interfaces.NotificationComponent;
import interfaces.NotificationStrategy;

// Composite: Representa uma notificação individual
public class SingleNotification implements NotificationComponent {    private String message;
    private NotificationStrategy strategy;

    public SingleNotification(String message, NotificationStrategy strategy) {
        this.message = message;
        this.strategy = strategy;
    }

    public void sendNotifications() {
        strategy.send(message);
    }

}
