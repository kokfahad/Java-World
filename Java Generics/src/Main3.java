public class Main3 {
    public static void main(String[] args) {
         shout("Tom",50);
    }

    private static <T,V> void shout(T name, V age){
        System.out.println("Hello "+ name+ '\n' +"Age "+ age );
    }
}
