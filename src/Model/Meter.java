package Model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Meter {
    Enum meterType;
    ArrayList<Consumption> consumptions = new ArrayList<>();
    int meterNr;
    LocalDate date = LocalDate.now();
    boolean active = true;


    public Meter(int meterNr, Enum meterType) {
        this.meterNr = meterNr;
        this.meterType = meterType;

    }

    public ArrayList<Consumption> getConsumptions() {
        return consumptions;
    }

    public void addConsumption(Consumption consumption) {
        consumptions.add(consumption);
    }

    public StringBuilder getConsumptionString() {

        StringBuilder consumptionString = new StringBuilder();
        for (int i = 0; i < consumptions.size(); i++) {
            consumptionString.append(meterNr).append(',').append(active).append(',').append(meterType).append(',').append(consumptions.get(i).getConsumptionString())
            .append(',').append(date.getDayOfMonth()).append('-').append(date.getMonthValue()).append('-').append(date.getYear());
        }
        return consumptionString;
    }
    public void toggleActive(){
        active = !active;
    }

    public boolean isActive(){
        return active;
    }

    public Enum getType(){
        return meterType;
    }

}
