package Handlers;

import Model.BBR;
import Model.Role;
import Model.User;
import Model.UserInfo;

public class CreateUserHandler {

    static public User createUser (String name, String emailAddress, String username, Role role, BBR bbrData, String password){

        UserInfo userInfo = new UserInfo(name, emailAddress, username, role, password);
        User newUser = new User(userInfo, bbrData);

        return newUser;
    };



}

