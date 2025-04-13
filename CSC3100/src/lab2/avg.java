package lab2;

import java.util.Scanner;

public class avg {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("*Enter three numbers to get the avg *\n");
		 
		 System.out.print("Enter number 1 : ");
		 double num1 = scanner.nextDouble();
		 
		 System.out.print("Enter number 2 : ");
		 double num2 = scanner.nextDouble(); 	

		 System.out.print("Enter number 3 : ");
		 double num3 = scanner.nextDouble(); 
		
		 double average = (num1 + num2 + num3) / 3;
		 
        System.out.println("The aver1age of the numbers is: " + average);

        scanner.close();
		 
	 }
}
