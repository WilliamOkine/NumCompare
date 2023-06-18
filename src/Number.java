import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First user, please enter your number: ");
        int num = getIntInput(scan);

        System.out.println("Second user, please enter your number: ");
        int num2 = getIntInput(scan);

        if (num2 > num) {
            System.out.println("First user's number is lower");
        } else if (num2 < num) {
            System.out.println("Second user's number is lower");
        } else {
            System.out.println("Both numbers are the same");
        }
    }

    public static int getIntInput(Scanner scan) {
        int num;
        while (true) {
            try {
                num = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer: ");
                scan.next(); // Clear the invalid input from the scanner
            }
        }
        return num;
    }
}

