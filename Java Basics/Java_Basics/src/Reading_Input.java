import java.util.Scanner;

public class Reading_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's Your Name ?");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println(age);
        System.out.println(name);
    }
}
