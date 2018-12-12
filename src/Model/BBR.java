package Model;

import java.util.ArrayList;

public class BBR {
    ArrayList<Meter> meters = new ArrayList<>();
    User user;
    String address;
    public BBR(String address){
        this.address=address;
    }

    public ArrayList<Meter> getMeters() {
        return meters;
    }
    public Meter getMeter(int index) {
        return meters.get(index);
    }


    public void removeMeter (Meter meter){
        meters.remove(meter);
    }

    public void addMeter (Meter meter){
        meters.add(meter);
    }

    public StringBuilder getMeterString(){
        StringBuilder meterString = new StringBuilder();
        for(int i = 0; i<meters.size(); i++){
            meterString.append(address).append(meters.get(i).getConsumptionString());
        }
        return meterString;
    }
}
