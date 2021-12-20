package PatternsPractice.ObserverPattern;

public abstract class Observer {

    protected abstract void update(int newValue, int oldValue);

    protected String markerOfChannel;
    protected Subject subject;
    protected String name;

    public Observer(Subject subject, String name, String markerOfChannel) {
        this.subject = subject;
        this.name = name;
        this.markerOfChannel = markerOfChannel;
        this.subject.addObserver(this);
    }

}
