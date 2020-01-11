package com.company.cars;


public class CarRunner {
    public static void main(String[] args) {
        Car car92 = new Car("petrolCar", Fuel.P92, false);
        System.out.println("car running on petrol 92");

        car92.turnIgnitionKey();
        if (!car92.checkFuel()) {
            car92.refuel();
        }
        car92.goHome();
        car92.goHomeByCat();

        Car car95 = new Car("petrolCar", Fuel.P95, true);
        System.out.println("car running on petrol 95");

        car95.turnIgnitionKey();
        if (!car95.checkFuel()) {
            car95.refuel();
        }
        car95.goHome();

        Car car98 = new Car("petrolCar", Fuel.P98, false);
        System.out.println("car running on petrol 98");

        car98.turnIgnitionKey();
        if (!car98.checkFuel()) {
            car98.refuel();
        }
        car98.goHome();

        Car dieselCar = new Car("dieselCar", Fuel.DIESEL, false);
        System.out.println("car running on diesel");

        dieselCar.turnIgnitionKey();
        if (!dieselCar.checkFuel()) {
            dieselCar.refuel();
        }
        dieselCar.goHome();

        Car tesla = new Car("electroCar", Fuel.ELECTRICITY, true);
        System.out.println("car running on electricity");

        tesla.turnIgnitionKey();
        if (!tesla.checkFuel()) {
            tesla.refuel();
        }
        tesla.goHome();
    }

}
