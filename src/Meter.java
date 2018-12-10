import java.util.ArrayList;

public class Meter {
    Enum meterType;
    ArrayList<Consumption> consumptions = new ArrayList<>();
    int meterNr;


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
            consumptionString.append(meterNr).append(meterType).append(consumptions.get(i).getConsumptionString());
        }
        return consumptionString;
    }
}
