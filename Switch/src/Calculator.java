import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator program using switch");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = in.nextInt();
        System.out.println("Enter num2 :");
        int num2 = in.nextInt();
        System.out.println("Enter the operation");
        char op = in.next().trim().charAt(0);
//        switch (op){
//            case '+':
//                System.out.println(num1+num2);
//                break;
//            case '-':
//                System.out.println(num1-num2);
//                break;
//            case '/':
//                System.out.println(num1/num2);
//                break;
//            case '*':
//                System.out.println(num1*num2);
//                break;
//            case '%':
//                System.out.println(num1%num2);
//                break;
//            default:
//                System.out.println("Enter valid operator");
//        }

        // ENHANCED SWITCH CASE
        switch (op) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '/' -> System.out.println(num1 / num2);
            case '*' -> System.out.println(num1 * num2);
            case '%' -> System.out.println(num1 % num2);
            default -> System.out.println("Enter valid operator");
        }

    }
}
