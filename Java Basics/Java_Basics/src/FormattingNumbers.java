import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency =NumberFormat.getCurrencyInstance();
        String result = currency.format(123123421);
        System.out.println(result);

//        shortcut
        String numResult = NumberFormat.getNumberInstance().format(123214124.842);
        System.out.println(numResult);
    }
}
