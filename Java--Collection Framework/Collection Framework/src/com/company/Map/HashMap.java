package com.company.Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer,String>map = new java.util.HashMap<>();
        map.put(1,"fahad");
        map.put(2,"mayan");
        map.put(4,"rafi");
        System.out.println(map);
        System.out.println("*******************");
        for (Map.Entry m : map.entrySet()){
            System.out.println("Key: "+m.getKey());
            System.out.println("Value: "+m.getValue());
        }

        for (Integer m : map.keySet()){
            System.out.println("Key Traverse :"+ m);
        }

        for (String m : map.values()){
            System.out.println("values Traverse :"+ m);
        }
    }

}
