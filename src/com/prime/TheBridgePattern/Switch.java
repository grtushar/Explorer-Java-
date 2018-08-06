package com.prime.TheBridgePattern;

/**
 * Created by Golam Rahman Tushar on 7/31/2018.
 */
public class Switch {
    private IElectricalEquipment equipment;

    public IElectricalEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(IElectricalEquipment equipment) {
        this.equipment = equipment;
    }

    public void on() {
        this.equipment.PowerOn();
    }

    public void off() {
        this.equipment.PowerOff();
    }
}
