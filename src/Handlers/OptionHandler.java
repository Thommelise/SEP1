package Handlers;

import Model.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class OptionHandler {

    public OptionHandler(){

        Method[] domainMethods = MainDomain.class.getDeclaredMethods();
        Method[] loginMethods = Login.class.getDeclaredMethods();
        Method[] UserMethods = User.class.getDeclaredMethods();
        Method[] userInfoMethods = UserInfo.class.getDeclaredMethods();
        Method[] bbrMethods = BBR.class.getDeclaredMethods();
        Method[] meterMethods = Meter.class.getDeclaredMethods();

        //Stream.concat(Arrays.stream(domainMethods),Arrays.stream(loginMethods),Arrays.stream(UserMethods))

    }
}
