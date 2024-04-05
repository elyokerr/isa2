package isa2;

public class Student {
    // Data members
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        this.name = "unknown";
        this.age = 0; // You can assign a different default value if needed
        this.address = "not available";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to print student details
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Create objects of Student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Set information for each student using both versions of setInfo method
        student1.setInfo("Alice", 20);
        student2.setInfo("Bob", 22, "123 Main Street");
        student3.setInfo("Charlie", 25, "456 Elm Street");

        // Print details of each student
        System.out.println("Details of student1:");
        student1.printInfo();
        System.out.println();

        System.out.println("Details of student2:");
        student2.printInfo();
        System.out.println();

        System.out.println("Details of student3:");
        student3.printInfo();
    }
}




