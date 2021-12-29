package PatternsPractice.DaoPattern;

import java.util.Optional;

public class UserApplication {

// The most relevant facet of this process is how UserDao hides from the application
// all the low-level details on how the objects are persisted, updated and deleted.

    private static Dao<User> userDAO;

    public static void main(String[] args) {

        userDAO = new UserDao();

        userDAO.save(new User ("Jack", "jack@domain.com"));
        userDAO.save(new User ("John", "john@domain.com"));
        userDAO.save(new User ("Mark", "mark@domain.com"));
        showAllUsers();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        User user1 = getUser(0);
        userDAO.update(user1, new String[] {"Joanna", "joanna@domain.com"});
        showAllUsers();

//        userDAO.delete(temporary);
//
//        showAllUsers();
//
//        userDAO.save(new User ("Joanna", "joanna@domain.com"));
//
//        userDAO.getAll().forEach(User -> System.out.println(User.getName()));

    }

    private static User getUser(long id) {
        Optional<User> user = userDAO.get(id);
        return user.orElseGet(() -> new User("non-existing user", "no-email"));
    }

    public static void showAllUsers() {
        for (User user : userDAO.getAll()) {
            System.out.println(user);
        }
    }
}
