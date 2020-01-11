package com.company.cars2;

public class Runner {

    public static void main(String[] args) {
        PetrolCar car1 = new PetrolCar("petrolCar", Fuel.P92, false,"peugeot");
        System.out.println("car " + car1.carName + " running on petrol 92");

        car1.goHome();
        car1.goHomeByCat();

        PetrolCar car2 = new PetrolCar("petrolCar", Fuel.P95, true, "vw");
        System.out.println("car " + car2.carName + " running on petrol 95");

        car2.goHome();

        PetrolCar car3 = new PetrolCar("petrolCar", Fuel.P98, false, "audi");
        System.out.println("car " + car3.carName + " running on petrol 98");

        car3.goHome();

        DieselCar dieselCar = new DieselCar("dieselCar", Fuel.DIESEL, false,"lada");
        System.out.println("car " + dieselCar.carName + " running on diesel");

        dieselCar.goHome();

        ElectroCar tesla = new ElectroCar("electroCar", Fuel.ELECTRICITY, true,"cybertruck");
        System.out.println("car " + dieselCar.carName + " running on electricity");

        tesla.goHome();
    }

}
