package com.company.cars2;

public class PetrolCar extends Car{
    public String carName;
    public PetrolCar(String carType, Fuel fuelType, boolean isEnoughFuel, String carName) {
        super(carType, fuelType, isEnoughFuel);
        this.carName = carName;
    }

}
