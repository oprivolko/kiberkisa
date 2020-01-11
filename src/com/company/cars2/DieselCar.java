package com.company.cars2;

public class DieselCar extends Car{
    public String carName;
    public DieselCar(String carType, Fuel fuelType, boolean isEnoughFuel, String carName) {
        super(carType, fuelType, isEnoughFuel);
        this.carName = carName;
    }

}
