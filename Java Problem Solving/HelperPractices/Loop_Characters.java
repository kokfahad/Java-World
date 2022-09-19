public class Loop_Characters {

    public static void main(String[] args) {
        char c = 'a';
        for (char ch = c ; ch< 'z'; ch++)
            System.out.print(ch + " ");

//        String ans ="";
//        char a='a';
//        System.out.println( ans + a);
        System.out.println();
        String message = "vkbs bs t suepuv";
        char [] arr = message.toCharArray();
        for (char a : arr)
            System.out.println(a);
    }
}
