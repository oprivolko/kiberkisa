package com.company.animals;

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
