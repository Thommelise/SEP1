package Model;

import Handlers.CreateBBR;
import Handlers.CreateConsumption;
import Handlers.CreateMeter;
import Handlers.CreateUserHandler;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class MainDomain {

    Login login = new Login();

    public MainDomain(){
        login.addUser(CreateUserHandler.createUser("Admin","" , "Admin", Role.SUPERUSER, null, "123"));
    }

    private ArrayList<BBR> bbrArrayList = new ArrayList<>();

    public User login(String username, String password){
        return login.validate(username, password);
    }

    public BBR getBbrObject(String address){
        for (int i = 0; i<bbrArrayList.size(); i++){
            if (bbrArrayList.get(i).getAddress() == address){
                return bbrArrayList.get(i);
            }
        }
        return null;
    }

    public void addUser(String name, String emailAddress, String username, Role role, BBR bbrData, String password){
        login.addUser(CreateUserHandler.createUser(name, emailAddress, username, role, bbrData, password));
    }

    public void addBbr(String Address){
        bbrArrayList.add(CreateBBR.createBbr(Address));
    }

    public void addConsumption(Meter meter, double count, Role role){
        meter.addConsumption(CreateConsumption.createConsumption(count, role));
    }

    public void setBbr(User user, BBR bbr){
        user.setBbrData(bbr);
    }

    public String getConsumption(BBR bbr){
        StringBuilder consumptionString = new StringBuilder();
        for (int i = 0; i<bbr.getMeters().size(); i++){
            consumptionString.append(bbr.getMeter(i).getConsumptionString()).append(',');
        }
        consumptionString.deleteCharAt(consumptionString.length());
        return consumptionString.toString();
    }

    public void addMeter(BBR bbr, Enum meterType, int meterNr){
        bbr.addMeter(CreateMeter.createMeter(meterType,meterNr));
    }

    public void toggleMeter(Meter meter){
        meter.toggleActive();
    }

    public ArrayList<User> getUsers (){
        return login.getUsers();
    }

    public void removeUser(User user){
        login.removeUser(user);
    }
    public int bbrSize(){
        return bbrArrayList.size();
    }
    public ArrayList<BBR> getBbr(){
        return bbrArrayList;
    }


    public void writeToFile(){

        try {
            File bbrFile = new File("BBR.txt");
            FileWriter fr = new FileWriter(bbrFile, true);
            for (BBR bbr : bbrArrayList)
                fr.write(String.valueOf(bbr.getMeterString())+"\r\n");
            fr.close();
        }catch(Exception e){}

        try {
            File userFile = new File("Users.txt");
            FileWriter fr = new FileWriter(userFile, true);
            for (User user : login.getUsers())
                fr.write(String.valueOf(user.getInfo().getUsername()+','+user.getInfo().getPassword())+"\r\n");
            fr.close();
        }catch (Exception e){}
    }
}

