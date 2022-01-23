package PatternsPractice.DaoPattern;

public class UserApplication {

// The most relevant facet of this process is how DataBaseImitation hides from the application
// all the low-level details on how the objects are persisted, updated and deleted.

    private static Dao<User> userDAO;

    public static void main(String[] args) {

        userDAO = new DataBaseImitation();

        userDAO.save(new User ("Jack", "jack@domain.com", 4567));
        userDAO.save(new User ("John", "john@domain.com", 9867));
        userDAO.save(new User ("Mark", "mark@domain.com", 3453));
        showAllUsers();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

//        User user1 = getUser(4567);
//        System.out.println(user1);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

//
//        userDAO.update(user);
//        showAllUsers();

//        userDAO.delete(temporary);
//
//        showAllUsers();
//
//        userDAO.save(new User ("Joanna", "joanna@domain.com"));
//
//        userDAO.getAll().forEach(User -> System.out.println(User.getName()));

    }

//    private static User getUser(long id) {
//        Optional<User> user = userDAO.get(id);
//        return user.orElseGet(() -> new User("non-existing user", "no-email", 0));
//    }

    public static void showAllUsers() {
        for (User user : userDAO.getAll()) {
            System.out.println(user);
        }
    }
}
