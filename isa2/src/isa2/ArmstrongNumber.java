package isa2;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning original number to a temporary variable
        originalNumber = number;

        // Calculating the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        // Assigning original number to another variable to retrieve it later
        originalNumber = number;

        // Finding the sum of digits raised to the power n
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if number is Armstrong
        return result == number;
    }
}


















