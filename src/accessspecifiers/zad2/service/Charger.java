package accessspecifiers.zad2.service;

import accessspecifiers.zad2.model.Telephone;

public class Charger {

    public void charge(Telephone telephone) {
        int batteryStatus = telephone.getChargeLevel();
        telephone.setChargeLevel(batteryStatus + 1);
    }

}
