package com.company.animals;

import java.util.Objects;

public class Fish extends Animal {
    String cheshuya = "like Kirkorov";

    @Override
    public void move() {
        System.out.println("fish swims");
    }

    public Fish(String color, String weight, String type, String length) {
        super(color, weight, type, length);
    }

    public Fish(String color, String weight, String type, String length, String cheshuya) {
        super(color, weight, type, length);
        this.cheshuya = cheshuya;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return cheshuya.equals(fish.cheshuya);//сравнить только по чешуе, игнорируя суперские
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cheshuya);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "cheshuya='" + cheshuya + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}