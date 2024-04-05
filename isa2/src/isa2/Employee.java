package isa2;

public class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;

    // Constructor
    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for job title
    public String getJobTitle() {
        return jobTitle;
    }

    // Setter for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Getter for basic salary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Setter for basic salary
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        double da = 0.1 * basicSalary; // DA is 10% of basic salary
        double hra = 5000; // HRA is fixed at 5000
        return basicSalary + da + hra;
    }

    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John Doe", "Software Engineer", 50000);

        // Print details of the employee
        System.out.println("Details of the employee:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Total Salary: " + employee.calculateTotalSalary());

        // Update basic salary
        employee.setBasicSalary(60000);

        // Print updated details of the employee
        System.out.println("\nUpdated details of the employee:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Total Salary: " + employee.calculateTotalSalary());
    }
}
