package Handlers;

import Model.UserInfo;

public class AddUser {

    public User addUser (String name, String emailAdress, String username, Role role, BBR bbrData, String password){

        UserInfo userInfo = new UserInfo(name, emailAdress, username, role, password);
        User newUser = new User(userInfo, bbrData)

        return newUser;
    };



}

