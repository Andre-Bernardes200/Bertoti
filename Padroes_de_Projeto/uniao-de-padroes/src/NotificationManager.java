import interfaces.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

// Singleton: Gerencia notificações e observadores
public class NotificationManager {
    private static NotificationManager instance;
    private List<NotificationObserver> observers = new ArrayList<>();

    private NotificationManager() {}

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    public void addObserver(NotificationObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (NotificationObserver observer : observers) {
            observer.onNotificationSent(message);
        }
    }
}
