import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_CF {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        ArrayList<String>list2 = new ArrayList<>();
        list2.add("Mango");
        list2.add("jam");
        list2.add("banana");
        list2.add("jackfruit");

        for (int i=0;i<list2.size();i++)
        {
            System.out.println(list2.get(i));
        }
        for (String st : list2){
            System.out.println("ForEach: " + st);
        }
        ArrayList<String>list3 = new ArrayList<>();
        System.out.println("******************");
        list3.add("Berry");
        list3.add("Bell");
        list2.addAll(list3);

        Iterator iterator = list2.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        list3.remove(1);
        System.out.println(list3);

        System.out.println("___________________");
        ArrayList<Integer>list4= new ArrayList<>();
        list4.add(2);
        list4.add(1);
        list4.add(7);
        list4.add(4);

        Collections.sort(list4);
        for (int i : list4){
            System.out.println("sort"+ i);
        }

    }
}
