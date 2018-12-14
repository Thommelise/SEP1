package Handlers;

import Model.Meter;

public class CreateMeter {

    static public Meter createMeter(Enum role, int meterNr){
        return new Meter(meterNr, role);
    }
}
