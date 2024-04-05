package isa2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);

        scanner.close();
    }

    public static int countDigits(int number) {
        // Convert negative numbers to positive for counting digits
        number = Math.abs(number);

        // Initialize digit count to 0
        int count = 0;

        // Count digits by repeatedly dividing the number by 10
        // until it becomes 0
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}