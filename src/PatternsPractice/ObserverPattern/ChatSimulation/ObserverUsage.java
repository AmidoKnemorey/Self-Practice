package PatternsPractice.ObserverPattern.ChatSimulation;

public class ObserverUsage {

    public static void main(String[] args) {
        final ChatChannel chatChannel = new ChatChannel("Design-Patterns");

        final BaseObserver userA = new UserObserver(chatChannel, "Andrzej");
        final BaseObserver userB = new UserObserver(chatChannel, "Ala");
        final BaseObserver adminA = new AdminObserver(chatChannel, "Janusz");
        final BaseObserver adminB = new AdminObserver(chatChannel, "Ania");

        userA.sendMessage("Hello all");
        userB.sendMessage("Hi Andrzej");
        adminA.sendMessage("Ania they can't see what we write");
        adminB.sendMessage("Yes I know");

    /* output programu:
      andrzej is joining the design-patterns
      ala is joining the design-patterns
      janusz joined design-patterns as admin.
      ania joined design-patterns as admin.
      andrzej sees message Hello all
      ala sees message Hello all
      janusz sees Hello all from user whose type is USER
      ania sees Hello all from user whose type is USER
      andrzej sees message Hi Andrzej
      ala sees message Hi Andrzej
      janusz sees Hi Andrzej from user whose type is USER
      ania sees Hi Andrzej from user whose type is USER
      janusz sees ania they can't see what we write from user whose type is ADMIN
      ania sees ania they can't see what we write from user whose type is ADMIN
      janusz sees Yes I know from user whose type is ADMIN
      ania sees Yes I know from user whose type is ADMIN
     */
    }
}