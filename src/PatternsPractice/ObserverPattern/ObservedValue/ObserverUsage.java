package PatternsPractice.ObserverPattern.ObservedValue;

public class ObserverUsage {
    public static void main(String[] args) {

        Subject subject = new Subject();

        final Observer observer1 = new AllChangesObserver(subject, "Jonathan");
        final Observer observer2 = new AllChangesObserver(subject, "Istvan");
        final Observer observer3 = new LoweredValueObserver(subject, "Andros");
        final Observer observer4 = new LoweredValueObserver(subject, "Zoltan");
        final Observer observer5 = new ByTenChangedObserver(subject, "Martin");
        final Observer observer6 = new ByTenChangedObserver(subject, "Frederic");

        subject.setMainObservedValue(43);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(44);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(55);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(43);
    }
}