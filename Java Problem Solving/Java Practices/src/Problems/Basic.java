package Problems;

import java.util.ArrayList;

public class Basic {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Username");
//        String username = scanner.nextLine();
//        System.out.println(username);
        String name = "My name is Fahad";
        String newName = name.replaceAll("\\s","");
        System.out.println("WhiteSpace remove: " + newName);

        int arr[] = {1,2,4,5,6};
        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        System.out.println(arrayList.get(2));
        for(int i:arr){
            System.out.println(i);
        }
        for (int arrl : arrayList){
            System.out.println(arrl);
        }
    }
}
