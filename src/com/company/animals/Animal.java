package com.company.animals;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return color.equals(animal.color) &&
                weight.equals(animal.weight) &&
                type.equals(animal.type) &&
                length.equals(animal.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, type, length);
    }
}
