package com.company.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
//        Hashset is like a bag where you can insert values
//        but cannot insert duplicate value
//        doesn't maintain inserting order
//        internally does hashing to insert

        Set<Integer>set = new HashSet<>(); //works in O(1)

//        Set<Integer>set = new LinkedHashSet<>();
//        Linked are same as HashSet but only difference is it maintains order while inserting

//        Set<Integer>set = new TreeSet<>(); //works in O(logn)
//        Same as HashSet but only differnec is it is sorted


        set.add(10);
        set.add(50);
        set.add(70);
        set.add(130);

        System.out.println(set);

//        to remove particular value
        set.remove(50);
        System.out.println(set);

//        to check a value is present in set or not
        System.out.println(set.contains(70));

//        to check the size of a set
        System.out.println("Set Size : "+ set.size());

//        set.clear();
        System.out.println(set.isEmpty());

    }
}
