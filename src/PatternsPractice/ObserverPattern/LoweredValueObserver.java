package PatternsPractice.ObserverPattern;

public class LoweredValueObserver extends Observer {


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