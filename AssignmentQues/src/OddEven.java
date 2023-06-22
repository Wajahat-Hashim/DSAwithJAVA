import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("To check whether number is EVEN or ODD");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
