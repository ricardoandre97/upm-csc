package lab2;

import java.util.Scanner;

public class weight {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("*Enter a parcel in pounds (lbs) *: ");
		 
		 double weightPound = scanner.nextDouble(); 	
		 
		 // 1 pound = 0.45kg
		
		 double weightKg =  weightPound * 0.45 ;
		 
        System.out.println("The weight in kgs for a " + weightPound + " parcel is " + weightKg);

        scanner.close();
		 
	 }
}
