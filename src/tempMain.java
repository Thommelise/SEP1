public class tempMain {





    public static void main(String[] args) {

        Meter meter1 = new Meter(2, MeterType.Heat);
        Consumption consumption1 = new Consumption(2, Unit.KWH);
        meter1.addConsumption(consumption1);

        System.out.println(meter1.getConsomptionString());
    }


}