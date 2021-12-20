package PatternsPractice.ObserverPattern;

public class AllChangesObserver extends Observer {

    public AllChangesObserver(Subject subject, String name) {
        super(subject, name, "AllChangesObserver");
    }

    @Override
    public void update(int newValue, int oldValue) {
        System.out.println("Observer "+super.name+" has got new value: "+subject.getMainObservedValue());
    }
}