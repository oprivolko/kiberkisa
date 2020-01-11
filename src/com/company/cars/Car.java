package com.company.cars;

public class Car implements CatDriving {

    String carType;
    Fuel fuelType;
    boolean isEnoughFuel;

    public void turnIgnitionKey() {
        System.out.println("turn the ignition key");
    }

    public boolean checkFuel() {
        System.out.println("check fuel");
        if (isEnoughFuel) {
            System.out.println("there's enough fuel");
        } else {
            System.out.println("there's not enough fuel");
        }
        return isEnoughFuel;
    }

    public void refuel() {
        this.isEnoughFuel = true;
        this.fuelType.getFuel();
        System.out.println("fill in the tank");
    }

    public void goHome() {

        System.out.println("go home!");
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


