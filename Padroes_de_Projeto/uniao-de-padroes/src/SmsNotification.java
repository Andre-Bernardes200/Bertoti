import interfaces.NotificationStrategy;

// Strategy: Implementação para envio por SMS
public class SmsNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
