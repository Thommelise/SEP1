package Model;

import java.util.ArrayList;

public class MainDomain {

    String username;
    String password;
    String address;
    Login login = new Login();
    private ArrayList<BBR> bbrArrayList = new ArrayList<>();

    public User login (String username, String password){
        this.username = username;
        this.password = password;

        return login(username, password);
    }

    public BBR getBbrObject (String address) { this.address = address; return getBbrObject(address);}

    public void addUser (User user) { login.addUser(user);

    }


}

