import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Take Principal , Time and Rate as input and print simple interest");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        int p = in.nextInt();
        System.out.println("Enter Time in years:");
        int t = in.nextInt();
        System.out.println("Enter Rate in %:");
        int r = in.nextInt();
        float SI = 0;
        System.out.println("The simple interest for the principal amount is :");
        System.out.println(SI= p*r*t);
    }
}
