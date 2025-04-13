package lab3;

import java.util.Scanner;

public class q3 {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter the subtotal and a gratuity rate (e.g. 10 12): ");
		 String input = scanner.nextLine();
		 
		 double gratuity = Float.parseFloat(input.split(" ")[1]) / 10;
		 double total = gratuity + Float.parseFloat(input.split(" ")[0]);
	         System.out.println("The gratuity is $" + String.format("%.2f", gratuity) + " and total is $" +  String.format("%.2f",total));
	         scanner.close();
		 
	 }
}
