package Model;

public class UserInfo {

    Enum role;
    String emailAddress;
    String name;
    String username;
    String password;


    public UserInfo(String name, String emailAddress, String username,Role role,String password){
        this.name = name;
        this.emailAddress = emailAddress;
        this.username = username;
        this.role = role;
        this.password = password;
    }



    public Enum getRole() {
        return role;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setRole(){
       this.role = role;
    }
    public void setEmailAddress() {
        this.emailAddress = emailAddress;
    }
    public void setName(){
        this.name=name;
    }
    public void setUsername(){
        this.username=username;
    }
    public void setPassword(){
        this.password=password;
    }

    public String getUserString(){
        StringBuilder userSB = new StringBuilder();
        userSB.append(name).append(emailAddress).append(username).append(role);
        return String.valueOf(userSB);
    }
}

