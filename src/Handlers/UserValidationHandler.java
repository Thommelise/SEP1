package Handlers;

import Model.User;
import java.util.ArrayList;

public class UserValidationHandler {

    public static User validateUser (ArrayList<User> users, String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getInfo().getUsername().equals(username) && users.get(i).getInfo().getPassword().equals(password)){
                return users.get(i);
            }
        }
        return null;
    }
}

