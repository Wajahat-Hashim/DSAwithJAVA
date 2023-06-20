import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Input numbers a b and c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q. print the largest of the three numbers :
        //method 1
        System.out.println(" Input numbers a b and c:");
        int max1 = a;
        if (b > max1) {
            max1 = b;
        }
        if (c > max1) {
            max1 = c;
        }
        System.out.println("maximum is: " + max1);

        // Method 2
        System.out.println(" Input numbers a b and c:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
         int max2 =0;
         if ( a > b){
             max2 = a ;
         }
         else { max2 = b;}

         if (c > max2){
             max2 = c;
         }
        System.out.println("maximum is: " + max2);

        // method 3
        System.out.println(" Input numbers a b and c:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int max = Math.max(c , Math.max(a,b));
        System.out.println("maximum is: " + max);
    }
}
