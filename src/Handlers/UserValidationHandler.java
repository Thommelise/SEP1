package Handlers;

import Model.Login;
import Model.User;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;

import java.util.ArrayList;

public class UserValidationHandler {

    String username;
    String password;
    User user;

    public User validateUser (ArrayList<User> users, String username, String password) {


        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getInfo().getUsername() == username && users.get(i).getInfo().getPassword() == password){
                return users.get(i);
            }
        }


    }
}

