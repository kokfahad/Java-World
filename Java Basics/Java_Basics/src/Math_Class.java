import java.lang.Math;
public class Math_Class {
    public static void main(String[] args) {
        int num = (int) Math.round(47.4);
        System.out.println(num);
        int num2 =(int) Math.ceil(66.2);
        System.out.println(num2);
        int num3 =(int) Math.floor(66.9);
        System.out.println(num3);
        int rand =(int) (Math.random()* 1000000);
        System.out.println("Random: "+ rand);
    }
}
