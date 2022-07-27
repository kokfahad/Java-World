import java.util.LinkedHashMap;
import java.util.Map;

public class First_Repeating_Element {

    public static int firstRepeatingElement(int arr[],int n){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int index: arr){
            if (map.containsKey(index)){
                map.put(index,map.get(index)+1);
            }else {
                map.put(index,1);
            }
        }

        for (Map.Entry<Integer,Integer> m: map.entrySet()){
            if (m.getValue() > 1){
                return m.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,-7,6,8,6,9,-7,14};
        int res = firstRepeatingElement(arr,8);
        if (res!= -1){
            System.out.println("First Repeating Element : "+ res);
        }else {
            System.out.println("No Repeating Element Found");
        }


    }
}
