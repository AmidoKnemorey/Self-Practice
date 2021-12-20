package PatternsPractice.ObserverPattern;

public class ObserverUsage {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observer1 = new AllChangesObserver(subject, "Jonathan");
        Observer observer2 = new AllChangesObserver(subject, "Istvan");
        Observer observer3 = new LoweredValueObserver(subject, "Andros");
        Observer observer4 = new LoweredValueObserver(subject, "Zoltan");
        Observer observer5 = new ByTenChangedObserver(subject, "Martin");
        Observer observer6 = new ByTenChangedObserver(subject, "Frederic");

        subject.setMainObservedValue(43);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(44);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(55);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        subject.setMainObservedValue(43);
    }
}