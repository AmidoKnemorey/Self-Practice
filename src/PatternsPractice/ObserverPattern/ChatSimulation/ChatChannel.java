package PatternsPractice.ObserverPattern.ChatSimulation;

import java.util.ArrayList;
import java.util.List;

public class ChatChannel {

    private final String name;

    private final List<BaseObserver> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();

    public ChatChannel(final String name) {
        this.name = name;
    }

    public void subscribe(final BaseObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void sendMessage(final String message, final String observerType) {
        messages.add(message);
        notifyAboutChange(message, observerType);
    }

    private void notifyAboutChange(final String message, final String observerType) {
        for (final var observer : observers) {
            observer.handleMessage(message, observerType);
        }
    }

    public String getName() {
        return name;
    }
}