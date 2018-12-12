package Handlers;
import Model.BBR;


public class CreateBBR {

    static public BBR createBbr(String address){

    BBR newBBR = new BBR(address);

    return newBBR;
    }
}
