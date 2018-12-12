package Handlers;


import Model.Consumption;

public class CreateConsumption {

    static Consumption createConsumption(double count, Enum unit){
        Consumption consumption = new Consumption(count,unit);

        return consumption;

    }
}
