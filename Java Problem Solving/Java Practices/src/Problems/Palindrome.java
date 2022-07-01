package Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String randString = "my gym";
        String newRandString = randString.replaceAll("\\s","");
        int length = randString.length();
//        char left = randString.charAt(0);
//        char right = randString.charAt(length-1);
        int left = 0;
        int right = length -1;
        while(left<right){
            {
                if (randString.charAt(left) == ' '){
                     left++;
                }
                if (randString.charAt(right) == ' '){
                    right--;
                }
                if (randString.charAt(left) != randString.charAt(right)){
                    System.out.println("Not palindrome");
                    return;
                }
                left++;
                right--;
            }
        }
        System.out.println("Paindrome");

    }
}
