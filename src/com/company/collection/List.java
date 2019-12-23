package com.company.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class List {
    public static void main(String[] args) {
        ArrayList<String> olivier = new ArrayList();
        olivier.add("goroshek");
        olivier.add("goroshek");
        olivier.add("morkovka");
        olivier.add("kolbasa");
        olivier.add("ogurec");
        olivier.add("egg");
        olivier.add("mazik");
        boolean empty = olivier.isEmpty();
        System.out.println(empty);

        Iterator<String> iterator = olivier.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        olivier.removeIf(Predicate.isEqual("goroshek"));
        olivier.set(1, "falafel");
        System.out.println(olivier);


    }

}

