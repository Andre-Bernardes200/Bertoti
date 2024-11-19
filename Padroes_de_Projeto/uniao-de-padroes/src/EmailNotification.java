import interfaces.NotificationStrategy;

// Strategy: Implementação para envio por Email
public class EmailNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
