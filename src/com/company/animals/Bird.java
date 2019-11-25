package com.company.animals;

public class Bird extends Animal {
    String Wings = "wide";

    @Override
    public void move() {
        System.out.println("bird flies");
    }

    public Bird(String color, String weight, String type, String length) {
        super(color, weight, type, length);
    }

    public Bird(String color, String weight, String type, String length, String Wings) {
        super(color, weight, type, length);
        this.Wings = Wings;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Wings='" + Wings + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
