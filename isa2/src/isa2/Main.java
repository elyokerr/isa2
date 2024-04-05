package isa2;
//Vehicle class
class Vehicle {
 // Member variable
 protected int horsepower;

 // Constructor
 public Vehicle(int horsepower) {
     this.horsepower = horsepower;
 }

 // Method
 public void drive() {
     System.out.println("Vehicle is being driven.");
 }
}

//Car class - subclass of Vehicle
class Car extends Vehicle {
 // Additional member variable
 private String make;

 // Constructor
 public Car(int horsepower, String make) {
     super(horsepower); // Call superclass constructor
     this.make = make;
 }

 // Method overriding
 @Override
 public void drive() {
     super.drive(); // Call superclass method
     System.out.println("Car is being driven.");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     // Create an object of Car class
     Car myCar = new Car(80, "Toyota");

     // Call the drive method
     myCar.drive();
 }
}
















