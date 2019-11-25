package com.company.animals;

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