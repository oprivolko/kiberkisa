package com.company.cars2;

public enum Fuel {
    P92, P95, P98, DIESEL, ELECTRICITY;

    public void getFuel() {
        System.out.println("get fuel " + this.name());
    }
}
