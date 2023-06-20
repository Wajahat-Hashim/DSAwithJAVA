import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reversing a given number\n Enter the number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n=0;
        while ( a > 0){
            int rem = a % 10;
            a /= 10;
            n = n * 10 +rem ;
        }
        System.out.println(n);
    }
}
