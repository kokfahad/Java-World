public class Casting {
    public static void main(String[] args) {
//        byte < short < int < long < double
        int a = 2;
        short s = (short) a;
        long l = a + 5;
        String st = "1";

        System.out.println(s);
        System.out.println(l);
        System.out.println(Integer.parseInt(st));

    }
}
