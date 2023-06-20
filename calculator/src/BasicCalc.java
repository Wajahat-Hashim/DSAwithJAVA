import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        //take input from user till the user does not press X or x
        Scanner in = new Scanner(System.in);
        int ans=0;
        //take input as operator
        while(true){
            System.out.println("Enter the operatr:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%')
            {
                System.out.println("Enter two numbers :");
                int inp1 = in.nextInt();
                int inp2 = in.nextInt();
                if ( op == '+'){
                    ans = inp1 + inp2;
                }
                if ( op == '-'){
                    ans = inp1 - inp2;
                }
                if ( op == '*'){
                    ans = inp1 * inp2;
                }
                if ( op == '/'){
                    ans = inp1 / inp2;
                }
                if ( op == '%'){
                    ans = inp1 % inp2;
                }
            } else if (op == 'x' || op == 'X') {
                break;}
                else{
                System.out.println("The operator is not defined");
            } System.out.println(ans);
        }
    }

}
