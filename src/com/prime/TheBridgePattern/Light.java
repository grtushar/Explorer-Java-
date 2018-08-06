package com.prime.TheBridgePattern;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Light implements IElectricalEquipment {
    @Override
    public void PowerOn() {
        System.out.println("Light started");
    }

    @Override
    public void PowerOff() {
        System.out.println("Light shutting down");
    }
}
