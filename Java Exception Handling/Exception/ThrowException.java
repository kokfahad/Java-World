import java.io.IOException;

public class ThrowException {
    public static void main(String[] args) throws IOException {
        deposit(-1);
    }

    public static void deposit(int amount) throws IOException {
        if (amount <= 0)
//            throw new IllegalArgumentException();      unchecked exception
            throw new IOException();    //checked exception
    }

}
