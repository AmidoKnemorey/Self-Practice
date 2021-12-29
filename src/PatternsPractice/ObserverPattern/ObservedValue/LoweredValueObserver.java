package PatternsPractice.ObserverPattern.ObservedValue;

public class LoweredValueObserver extends Observer {
    //Observer which get news about changed value, only if changed value becomes less than it was before
    public String getMarkerOfChannel() {
        return markerOfChannel;
    }

    public LoweredValueObserver(Subject subject, String name) {
        super(subject, name, "LoweredValueObserver");
    }

    @Override
    public void update(int newValue, int oldValue) {
        if (oldValue == 0) {
            System.out.println("Observer " + super.name + " has got new value: " + newValue);
        } else if (newValue < oldValue) {
            System.out.println("Observer " + super.name + " has got new value: " + subject.getMainObservedValue());
        }
    }
}