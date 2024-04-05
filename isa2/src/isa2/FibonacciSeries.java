package isa2;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series:");
        displayFibonacciSeries(n);

        scanner.close();
    }

    public static void displayFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        if (n >= 1) {
            System.out.print(firstTerm);
        }
        if (n >= 2) {
            System.out.print(", " + secondTerm);
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}

