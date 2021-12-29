package PatternsPractice.ObserverPattern.ChatSimulation;

public class UserObserver extends BaseObserver {

    private final String userName;

    public UserObserver(final ChatChannel chatChannel, final String userName) {
        super(chatChannel);
        this.userName = userName;
        System.out.println(userName + " joined to the " + chatChannel.getName());
    }

    @Override
    public void handleMessage(final String message, final String userType) {
        if (!userType.equals("ADMIN")) {
            System.out.println(userName + " sees message " + message);
        }
    }

    @Override
    public String getObserverType() {
        return "USER";
    }
}