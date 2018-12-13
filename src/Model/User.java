package Model;

public class User {

    UserInfo info;
    BBR bbrData;
    public User(UserInfo info, BBR bbrData){
        this.info = info;
        this.bbrData = bbrData;
    }


    public UserInfo getInfo() {
        return info;
    }

    public BBR getBbrData() {
        return bbrData;
    }

    public void setBbrData(BBR bbrData) {
        this.bbrData = bbrData;
    }
}
