package PatternsPractice.ObserverPattern.ObservedValue;

public class AllChangesObserver extends Observer {
    //Observer which get news about all changes in main value
    public AllChangesObserver(Subject subject, String name) {
        super(subject, name, "AllChangesObserver");
    }

    @Override
    public void update(int newValue, int oldValue) {
        System.out.println("Observer "+super.name+" has got new value: "+subject.getMainObservedValue());
    }
}