package com.company.animals;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Wings.equals(bird.Wings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Wings);
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
