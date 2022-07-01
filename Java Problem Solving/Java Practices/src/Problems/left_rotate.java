package Problems;

public class left_rotate {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
//        System.out.println(arr);
        int rotate =2;
        for(int j =0; j<rotate;j++) {
            int element = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = element;
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}
