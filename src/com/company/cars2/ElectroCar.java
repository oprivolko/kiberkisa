package com.company.cars2;

public class ElectroCar extends Car{
    public String carName;
    public ElectroCar(String carType, Fuel fuelType, boolean isEnoughFuel, String carName) {
        super(carType, fuelType, isEnoughFuel);
        this.carName = carName;
    }
}
