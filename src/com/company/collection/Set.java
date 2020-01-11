package com.company.collection;

import java.util.*;


public class Set {
    public static void main(String[] args) {
        HashSet<String> luxuryShmotki = new HashSet<String>();
        luxuryShmotki.add("gucci");
        luxuryShmotki.add("gucci");
        luxuryShmotki.add("dolce&gabbana");
        luxuryShmotki.add("prada");
        luxuryShmotki.add("kenzo");
        System.out.println(luxuryShmotki);
        luxuryShmotki.removeAll(luxuryShmotki);
        boolean empty = luxuryShmotki.isEmpty();
        System.out.println(empty);

        HashSet<String> massMarket = new HashSet<String>();
        massMarket.add("mango");
        massMarket.add("mango");
        massMarket.add("zara");
        massMarket.add("stradivarius");
        massMarket.add("massimoDutti");

        System.out.println(massMarket);
        Iterator<String> iterator = massMarket.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        massMarket.remove("mango");
        System.out.println(massMarket);


    }
}

