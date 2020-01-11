package com.company.collection;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 4);
        map.put("key5", 5);

        Integer i = map.get("key1");
        System.out.println(i);

        map.remove("key2");
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println(map.containsValue("666"));
        System.out.println(map.containsKey("keyTest"));

    }
}