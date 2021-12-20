package PatternsPractice.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        SingletonServer.INSTANCE.addServer("bla");
        SingletonServer.INSTANCE.getWholeList();
    }
}