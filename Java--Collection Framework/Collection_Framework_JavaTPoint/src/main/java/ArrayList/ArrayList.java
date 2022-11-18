package ArrayList;

import java.util.*;

public class ArrayList<S> {
    public static void main(String[] args) {
        List<String> list1 = new java.util.ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        System.out.println("List1 : " + list1);

        java.util.ArrayList<String>list2 = new java.util.ArrayList<>();
        list2.add("four");
        list2.add("five");

        list1.addAll(list2);

        System.out.println(list1);

        System.out.println("For loop traversal: ");
        for (int i =0 ;i<list1.size(); i++ ){
            System.out.println(list1.get(i));
        }

//        Collections.sort(list1);

        System.out.println("For each loop: ");
        for (String elem : list1){
            System.out.println(elem);
        }

        System.out.println("Size of list1 : " + list1.size());

        System.out.println(" index 4 element : " + list1.get(3));
        System.out.println("Getting index of no. 4 element : " + list1.indexOf("four"));

        list1.remove(0);

        System.out.println("After remove: "+ list1);
//        list1.removeAll(list2);
//        System.out.println(list1);

//        list1.clear();
//        System.out.println(list1);

//        System.out.println("After retain: " + list1.retainAll(list2));

        System.out.println("Iterator traversing: ");

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Traversing using lamda expression: ");
        list1.forEach(list ->{
            System.out.println(list);
        });

        System.out.println("Empty ?" + list1.isEmpty());

        System.out.println(list1.contains("two"));




    }
}
