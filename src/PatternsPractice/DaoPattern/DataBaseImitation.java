package PatternsPractice.DaoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DataBaseImitation implements Dao<User> {

    private final List<User> users = new ArrayList<>();

    @Override
    public Optional<User> get (int id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update (User user, String[] params) {
        user.setName(Objects.requireNonNull(params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(params[1], "Email cannot be null"));
        //users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}