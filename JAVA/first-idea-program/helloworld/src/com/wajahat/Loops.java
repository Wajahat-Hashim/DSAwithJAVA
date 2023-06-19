import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         Syntax of FOR loop:
           for ( initialization ; condition ; increment/decrement){
               //body
           }

         */
        // Q: print numbers from 1 to 5

        for ( int num = 1; num<=5; num++){
            System.out.println(num);
        }
        //Q; print numbers frm 1 to n - USER INPUT
        Scanner in = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = in.nextInt();
        for (int num1 = 1; num1 <= n ; num1++) {
            System.out.print(num1 + " " );

        }

        /* WHILE loop
          Syntax :
          while(condition){
           //body
           }
         */
        int num2 = 1;
        while ( num2<=5){
            System.out.println(num2);
            num2++;
        }

        //Do-While Loop
        /*  This will execute at least once
          Syntax:
           do{
            //body
            }while(condition)
         */
        int numm = 1;
        do {
            System.out.println("hello world");
             numm++;
        }while(numm<=4);
    }
}
