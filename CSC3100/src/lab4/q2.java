package lab4;

import java.util.Scanner;

public class q2 {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter your BMI : ");
		 double bmi = scanner.nextDouble();
		 scanner.nextLine();
         
	         System.out.print("Enter your waist size :");
	         double waistSize = scanner.nextDouble();
	         scanner.nextLine();
	         
	         System.out.print("Enter your gender (M/F) :");
	         String gender = scanner.nextLine().toLowerCase();
	
	         String bmiCategory;
	
	         if (bmi < 18.5) {
	             System.out.println("Invalid bmi. Must be greater than 18.5");
	             scanner.close();
	             return;
		 	 
	         } 
		 else if (bmi >= 18.5 && bmi <= 24.9) { bmiCategory = "Normal"; }
		 else if (bmi >= 25 && bmi <= 29.9) { bmiCategory = "Overweight"; }	 
		 else if (bmi >= 30 && bmi <= 34.9) {bmiCategory = "Obese"; }	 
		 else {
		 	bmiCategory = "Severely obese";
		 }
	
	         // Output
	         System.out.println("BMI info: " + bmiCategory);
	         
	         if ((gender.equals("m") && waistSize > 40) || (gender.equals("f") && waistSize > 35)) {
	    		 System.out.println("*************************************************************************");
	    		 System.out.println("CAUTION!!");
	    		 System.out.println("Women – waist size > 35 inches\nMen – waist size > 40 inches");
	    		 System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
	    		 System.out.println("*************************************************************************"); 	 
	         }
	              
	        scanner.close();	 
	}
}


