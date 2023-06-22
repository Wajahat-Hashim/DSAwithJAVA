import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // to check whether a string is pallindrome or not
        System.out.println("Input the word");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String reverse = "";

        int strLength = word.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverse = reverse + word.charAt(i);
        }

        if (word.toLowerCase().equals(reverse.toLowerCase())) {
            System.out.println(word + " is a Palindrome String.");
        }
        else {
            System.out.println(word + " is not a Palindrome String.");
        }

    }
}
