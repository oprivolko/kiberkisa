package com.company.animals;

import java.util.Objects;

public class Cat extends Animal{
    String usiki="maximalno";
    @Override
    public void move() {
        System.out.println("cat sleeps");
    }

    public Cat(String color, String weight, String type, String length) {
        super(color, weight, type, length);
    }

    public Cat(String color, String weight, String type, String length, String usiki) {
        super(color, weight, type, length);
        this.usiki = usiki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);//сравнить по полям из супера (4 поля)
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), usiki);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "usiki='" + usiki + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
