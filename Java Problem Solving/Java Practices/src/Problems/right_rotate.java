package Problems;

public class right_rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int rotate =2;

        for (int j=0; j<rotate;j++) {
            int element = arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i + 1] = arr[i];
            }
            arr[0] = element;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
