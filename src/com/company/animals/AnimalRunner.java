package com.company.animals;

import javax.xml.catalog.CatalogFeatures;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat1=new Cat("black", "6kg", "kawaii", "50cm", "super-kawaii");
        Cat cat2=new Cat("black", "6kg", "badcat", "50cm");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat1.equals(cat2));
       cat1.move();
        Fish fish1=new Fish("silver", "1kg", "shark", "100cm", "like a diamond");
        Fish fish2=new Fish("silver", "1kg", "shark", "100cm");
        System.out.println(fish1.toString());
        System.out.println(fish2.toString());
        System.out.println(fish1.equals(fish2));
        fish1.move();
        Bird bird1=new Bird("pink", "1kg", "eagle", "100cm", "wider than your ego");
        Bird bird2=new Bird("pink", "1kg", "eagle", "100cm");
        System.out.println(bird1.toString());
        System.out.println(bird2.toString());
        bird1.move();
        System.out.println(bird1.equals(bird2));
    }
}
