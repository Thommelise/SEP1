package Model;
import Handlers.UserValidationHandler;

import java.util.ArrayList;

public class Login {

    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean validate(String username, String password){
        return UserValidationHandler.validateUser(users, username, password) instanceof User;
    }

}
