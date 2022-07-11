import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

        int [] arr = {3,1,2,88,5,7,0,18,9};
        Arrays.sort(arr);
//        System.out.println(arr);

        for (int val : arr){
            System.out.println(val);
        }

        int mulArr[][]= {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(mulArr));
    }
}
