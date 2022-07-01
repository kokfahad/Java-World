package com.company.Map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String,Integer>map=new HashMap<>();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);

        System.out.println(map);

        map.putIfAbsent("four",4);
        System.out.println(map);

//        Iterating Map
        for (java.util.Map.Entry<String,Integer>e: map.entrySet()){
//            Iterating key-value pair in map
            System.out.println(e);

//            iterating over keys
            System.out.println(e.getKey());

//            iterating over values
            System.out.println(e.getValue());
        }

//        Iterating over only keys
        for (String key: map.keySet()){
            System.out.println("key : "+key);
        }

//        Iterating over values only
        for (Integer val: map.values()){
            System.out.println("Values: "+val);
        }

        //checking if key values present or not
        System.out.println(map.containsKey("Three"));
        System.out.println(map.containsKey("thirty"));
        System.out.println(map.containsValue(4));
        System.out.println(map.containsValue(70));
    }
}
