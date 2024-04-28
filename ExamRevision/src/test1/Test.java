package test1;

import java.util.Scanner;

public class Test {

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Error: Division by zero!");
        }
    }
    
    public static void main(String[] args) {
        Test calculator = new Test();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                try {
                    result = calculator.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return; // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return; // Exit the program for invalid operator
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}