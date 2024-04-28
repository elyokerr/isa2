package Refactor;

public class Student {
Results data = new Results();
Student(String name, String rollno, int [] marks)
{
this.data.name = name;
this.data.rollno = rollno;
this.data.marks = marks;
}
String getName()
{
return data.name;
}
void display_resultS()
{
//compute average
computeAverage();
}
public void computeAverage() {
	int sum=0;
	float avg=0;
	char grade;
	for (int i=0; i< data.marks.length;i++)
	sum+= data.marks[i];
	avg = sum/data.marks.length;
	//compute grade
	computeGrade(avg);
}
public void computeGrade(float avg) {
	char grade;
	if(avg >80)
	grade = 'A';
	else if (avg >60 && avg <=80)
	grade = 'B';
	else if (avg >50 && avg <=60)
	grade = 'C';
	else if (avg >40 && avg <=50)
	grade = 'a';
	else
	grade = 'F';
	System.out.println("Result of " + data.name.toUpperCase());
	System.out.println("Rol no is " + "R/BCA-2019" + data.rollno);
	System.out.println("Grade is " + grade);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
int[] marks = {90,80,70,56,89};
Student sue = new Student("Anne Sue", "777", marks);
sue.display_resultS();
}
}