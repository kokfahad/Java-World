package Problems;

import java.util.Scanner;

public class String_Abbreavation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter your company name: ");
        String userString = scanner.nextLine();
        System.out.println("Your Company name: "+ userString);
        String ans ="";
        ans += userString.charAt(0);
        for (int i=0; i<userString.length(); i++){
            if (userString.charAt(i) == ' ') {
                ans += userString.charAt(i + 1);
            }
        }

        System.out.println("String abbreavation: "+ ans);
    }
}
