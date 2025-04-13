package lab2;

import java.util.Scanner;

public class bmi {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("*BMI calculator *\n");
		 
		 System.out.print("Please enter your height in meters (e.g 1.72) :");
		 
		 double height = scanner.nextDouble(); 	
		 
		 System.out.print("Please enter your weight in kg (e.g 65) :");
		
		 double weight = scanner.nextDouble();
		 
		 double bmi = weight / (height * height);
		 
        System.out.println("Your BMI is " + bmi);

        scanner.close();
		 
	 }
}
