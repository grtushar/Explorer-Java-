package com.prime.TheBridgePattern;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Fan implements IElectricalEquipment {
    @Override
    public void PowerOn() {
        System.out.println("Fan started");
    }

    @Override
    public void PowerOff() {
        System.out.println("Fan shutting down");
    }
}
