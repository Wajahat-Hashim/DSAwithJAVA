import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the type of car");
        Scanner in = new Scanner(System.in);
        String carType = in.next();
        switch (carType){
            case "Sedan":
                System.out.println("Honda Civic");
                break;
            case "Hatchback":
                System.out.println("Mini Cooper");
                break;
            case "SUV":
                System.out.println("Land cruiser");
                break;
            case "MPV":
                System.out.println("Innova");
                break;
            default:
                System.out.println("Enter valid car type");
        }
    }
}