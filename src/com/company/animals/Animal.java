package com.company.animals;

public class Animal {
    String color;
    String weight;
    String type;
    String length;
    public void move(){
        System.out.println("animal moves");
    }

    public Animal(String color, String weight, String type, String length) {
        this.color = color;
        this.weight = weight;
        this.type = type;
        this.length = length;
    }
}
