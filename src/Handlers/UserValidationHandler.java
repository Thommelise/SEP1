package Handlers;

import Model.Login;
import Model.User;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;

import java.util.ArrayList;

public class UserValidationHandler {

    String username;
    String password;
    User user;
    Login users;

    public boolean validateUser (ArrayList users) {

        for (int i = 0; i < users.size(); i++) {
            if (users.contains(username) && users.contains(password)) return true;

        }

        return false;
    }
}

