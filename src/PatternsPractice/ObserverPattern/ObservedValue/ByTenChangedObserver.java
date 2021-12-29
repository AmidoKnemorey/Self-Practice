package PatternsPractice.ObserverPattern.ObservedValue;

public class ByTenChangedObserver extends Observer {
    //Observer which get news about changed value, only if changed value becomes greater or less much than 10
    public String getMarkerOfChannel() {
        return markerOfChannel;
    }

    public ByTenChangedObserver(Subject subject, String name) {
        super(subject, name, "ByTenChangedObserver");
    }

    @Override
    public void update(int newValue, int oldValue) {
        if (oldValue == 0) {
            System.out.println("Observer " + super.name + " has got new value: " + newValue);
        } else if (newValue - oldValue >= 10 || oldValue - newValue >= 10) {
            System.out.println("Observer " + super.name + " has got new value: " + newValue);
        }
    }
}
