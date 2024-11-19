import interfaces.NotificationStrategy;

// Strategy: Implementação para envio por Push
public class PushNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Enviando Push Notification: " + message);
    }
}
