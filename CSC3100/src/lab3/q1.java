package lab3;

import java.util.Scanner;

public class q1 {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Matric: ");
		 double matricNumber = scanner.nextDouble();
		 
		 System.out.print("Enter marks for assesment 1: ");
		 double assesmementOneMarks = scanner.nextDouble();

		 System.out.print("Enter marks for assesment 2: ");
		 double assesmementTwoMarks = scanner.nextDouble();
	
		 System.out.print("Enter marks for Lab assignment: ");
		 double labMarks = scanner.nextDouble();
		  
		 System.out.print("Enter marks for your final exam: ");
		 double finalExamMarks = scanner.nextDouble();
		

		double finalMarks = ( 
				(assesmementOneMarks * 0.15) +
				(assesmementTwoMarks * 0.20) +
				(labMarks            * 0.35) +
				(finalExamMarks      * 0.30)
				
		);
        System.out.println("Your total mark for student " + String.format("%.0f", matricNumber) + " in CSC3100 is " + String.format("%.2f", finalMarks));

        scanner.close();
		 
	 }
}
