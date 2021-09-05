package accessspecifiers.zad2.main;

import accessspecifiers.zad2.model.Telephone;
import accessspecifiers.zad2.service.Charger;

public class app {

    public static void main(String[] args) {

        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
//        System.out.println(telephone.brand
//                + " " + telephone.model
//                + ", bateria: " + telephone.batteryCapacity +"mAh"
//                + ", poziom naładowania: " + telephone.chargeLevel + "%");
//    }
        System.out.println(telephone);
        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println(telephone);

    }
}
