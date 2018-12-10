import sun.net.idn.StringPrep;

public class UserInfo {

    Enum role;
    String emailAdress;
    String name;
    String username;
    String password;

    public Enum getRole() {
        return role;
    }
    public String getEmailAdress(){
        return emailAdress;
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
    public void setRole(Enum role){
       this.role = role;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
}
