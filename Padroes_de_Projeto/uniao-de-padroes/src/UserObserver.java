import interfaces.NotificationObserver;

// Observer: Implementação de um observador
public class UserObserver implements NotificationObserver {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    public void onNotificationSent(String message) {
        System.out.println(name + " recebeu notificação: " + message);
    }
}
