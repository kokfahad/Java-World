public class main {

    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<Integer>(3);
        System.out.println(integerGeneric.val);

        Generic<Double> doubleGeneric = new Generic<Double>(4.7);
        System.out.println(doubleGeneric.val);

        Generic<String> stringGeneric = new Generic<String>("fahad");
        System.out.println(stringGeneric.val);
    }
}
