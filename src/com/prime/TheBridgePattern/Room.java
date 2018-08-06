package com.prime.TheBridgePattern;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Room {
    public static void main(String[] args) {
        System.out.println(2<<4);
        IElectricalEquipment fan = new Fan();
        IElectricalEquipment light = new Light();

        Switch normalSwitch = new NormalSwitch();
        Switch fancySwitch = new FancySwitch();

        normalSwitch.setEquipment(fan);
        normalSwitch.on();
        normalSwitch.off();
    }
}
