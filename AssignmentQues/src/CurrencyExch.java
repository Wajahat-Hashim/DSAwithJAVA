import java.util.Scanner;

public class CurrencyExch {
    public static void main(String[] args) {
        System.out.println("INR to DOLLAR conversion");
        Scanner in = new Scanner(System.in);
        System.out.println("Input indian currency");
        float inr = in.nextFloat();
        float dllr = inr / 84 ;
        System.out.println(dllr);
    }
}
