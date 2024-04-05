package isa2;

import java.util.Scanner;

//Parent class
class Teachers {
 // Member variable
 protected String type;

 // Method
 public void Teaches() {
     System.out.println("This teacher teaches " + type);
 }
}

//Subclass
class TeacherTeaches extends Teachers {
 // New member variable
 String name;

 // Method
 public void Subjects() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the subject taught by the teacher: ");
     String subject = scanner.nextLine();
     scanner.close();
     System.out.println("The teacher is teaching " + subject);
 }
}

//Main class
public class Main1{
 public static void main(String[] args) {
     // Create an object of TeacherTeaches class
     TeacherTeaches teacher = new TeacherTeaches();

     // Set values for type and name
     teacher.type = "Mathematics";
     teacher.name = "John Doe";

     // Call methods
     teacher.Teaches();
     teacher.Subjects();
 }
}









