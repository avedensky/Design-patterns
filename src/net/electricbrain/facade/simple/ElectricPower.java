package net.electricbrain.facade.simple;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 01.06.17
 */
public class ElectricPower {
    boolean online = false;

    public boolean CheckPower () {
        return true;
    }

    public void powerButton () {
        if (online == false) {
            online = true;
            System.out.println("Power on");
        } else {
            System.out.println("Power off");
            online = false;
        }
    }
}
