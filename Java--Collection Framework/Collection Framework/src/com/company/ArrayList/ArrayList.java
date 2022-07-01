package com.company.ArrayList;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer>list= new java.util.ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(50);
        System.out.println(list);

//        Inserting element at a particular index
        list.add(1,80);
        System.out.println(list);

//        Inserting a list into another list
        List<Integer>list1=new java.util.ArrayList<>();
        list1.add(100);
        list1.add(200);

        list.addAll(list1);
        System.out.println(list);

//        Getting a particular element from list

        System.out.println("Element at pos three: "+list.get(2));

//        Removing element
//        method 1: using index
        list.remove(3);
        System.out.println(list);

//        method 2: using value
        list.remove(Integer.valueOf(40));
        System.out.println(list);

//        updating a particular element
        list.set(0,1000);
        System.out.println(list);

//        checking if a particular element is present in list or not: returns boolean
        System.out.println(list.contains(500));

//        Iterating over a list

//    method: 1
        for (int i=0;i<list.size();i++)
        {
            System.out.println("The value is : "+ list.get(i));
        }

//        method: 2
        for(Integer listVal : list){
            System.out.println("Foreach elemenet val: "+ listVal);
        }

//        method: 3
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator val: "+ it.next());
        }

//        clearing all the values
        list.clear();
        System.out.println(list);


    }
}
