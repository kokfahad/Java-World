package Problems;

public class String_reverse {
    public static void main(String[] args) {
        String name = "fahad";
        char[] newName = name.toCharArray();
        System.out.println(newName);
        int left =0;
        int right = name.length()-1;

        while(left<right){
            char temp = newName[left];
            newName[left]= newName[right];
            newName[right] = temp;
            left++;
            right--;
        }

        System.out.println(newName);

    }
}
