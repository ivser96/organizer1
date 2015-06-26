package classes;

import java.util.ArrayList;

/**
 * Created by Иван on 26.06.2015.
 */
public interface UserDAO {
    void addUser(User bank);
    void delete(int id);
    User getByName(String name);
    User editUser(User user);
    ArrayList<User> getAll();
}
