package PatternsPractice.ObserverPattern.ObservedValue;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    Set<Observer> allObservers = new HashSet<>();

    private int mainObservedValue;
    private int auxiliaryValue;

    public void setMainObservedValue(int mainObservedValue) {
        this.auxiliaryValue = this.mainObservedValue;
        this.mainObservedValue = mainObservedValue;
        notifyObservers();
    }

    public int getMainObservedValue() {
        return this.mainObservedValue;
    }

    public void addObserver (Observer observer) {
       allObservers.add(observer);
    }

    public void notifyObservers () {
        for (Observer observer : allObservers) {
            observer.update(mainObservedValue, auxiliaryValue);
        }
    }
}