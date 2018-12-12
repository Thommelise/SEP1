package Model;

public class Consumption {
    double count;
    Enum unit;

    public Consumption (double count,Enum unit) {
        this.count = count;
        this.unit = unit;
    }

    public double getCount() {
        return count;
    }

    public Enum getUnit() {
        return unit;
    }
    public String getConsumptionString() {
        return count +" "+ unit;
    }
}
