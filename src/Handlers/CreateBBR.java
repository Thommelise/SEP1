package Handlers;
import Model.BBR;


public class CreateBBR {

    static BBR createBbr(String address){

    BBR newBBR = new BBR(address);

    return newBBR;
    }
}
