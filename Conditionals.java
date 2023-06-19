import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /*
            Syntax of IF statements:
            if (boolean exp T or F) {
                 //body } else {
                //do this
                 }
         */
        int salary;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the salary:");
        salary = input.nextInt();

        if (salary>10000) {
            salary += 2000;
        } else
        { salary+=1000;
        }
        System.out.println(salary);

        // Multiple if-else
        System.out.println("enter second salary: ");
        int salary2 = input.nextInt();
        if (salary2 > 10000) {
            salary2 += 3000;
        } else if (salary2 >2000){
            salary2 += 1500;
        } else {
            salary2 += 750;
        }
        System.out.println(salary2);
        System.out.println("Salary is:" + salary);
        System.out.println("salary2 is:" + salary2);
    }

}