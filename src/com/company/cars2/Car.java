package com.company.cars2;

public class Car implements CatDriving {

    String carType;
    Fuel fuelType;
    boolean isEnoughFuel;

    public void goHome() {

        System.out.println("go home but first:");
        this.turnIgnitionKey();
        if (!this.checkFuel()) {
            this.refuel();
        }
    }

    public void turnIgnitionKey() {
        System.out.println("turn the ignition key");
    }

    public boolean checkFuel() {
        System.out.println("check fuel");
        if (isEnoughFuel) {
            System.out.println("there's enough fuel so go the fuck home");
        } else {
            System.out.println("there's not enough fuel");
        }
        return isEnoughFuel;
    }

    public void refuel() {
        this.isEnoughFuel = true;
        this.fuelType.getFuel();
        System.out.println("fill in the tank and go the fuck home");
    }

        public Car(String carType, Fuel fuelType, boolean isEnoughFuel) {
        this.carType = carType;
        this.fuelType = fuelType;
        this.isEnoughFuel = isEnoughFuel;
    }

    @Override
    public void goHomeByCat() {
        System.out.println("Have you ever seen anyone being driven by a cat?");
    }
}