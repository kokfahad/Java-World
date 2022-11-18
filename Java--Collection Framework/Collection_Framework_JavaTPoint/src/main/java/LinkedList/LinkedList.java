package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        System.out.println("get: "+ list.get(2));


        List<String>list1 = new java.util.LinkedList<>();
        list1.add("four");
        list1.add("six");
        list.addAll(list1);
        list.add(4,"five");
        System.out.println(list);

//        Collections.sort(list);

//        list.remove(0);
//        list.removeAll(list);

        for (String ele : list){
            System.out.println("Elem: "+ ele);
        }

        List<Integer>list3 = new java.util.LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(17);
        list3.add(6);

//        Iterator iterator = list3.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }







    }
}
