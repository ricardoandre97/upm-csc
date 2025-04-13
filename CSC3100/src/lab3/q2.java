package lab3;

import java.util.Scanner;

public class q2 {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Item 1: ");
		 String itemOne = scanner.nextLine();
		 
		 System.out.print("Quantity: ");
		 double itemOneQuantity = scanner.nextDouble();

		 System.out.print("Unit Price: ");
		 double itemOneUnitPrice = scanner.nextDouble();
		 scanner.nextLine();
	
		 System.out.print("Item 2: ");
		 String itemTwo =  scanner.nextLine();
		 
		 System.out.print("Quantity: ");
		 double itemTwoQuantity = scanner.nextDouble();

		 System.out.print("Unit Price: ");
		 double itemTwoUnitPrice = scanner.nextDouble();
		
		 double itemOneAmount = (itemOneQuantity * itemOneUnitPrice);
		 double itemTwoAmount = (itemTwoQuantity * itemTwoUnitPrice);
		 
	    	 System.out.println("******************************************");
  
	         System.out.println("Item 1: " + itemOne);
	         System.out.println("Quantity: " + itemOneQuantity);
	         System.out.println("Unit Price: " + itemOneUnitPrice);
	         System.out.println("Amount: " + itemOneAmount);

	   	 System.out.println("******************************************");
		     
	         System.out.println("Item 2: " + itemTwo);
	         System.out.println("Quantity: " + itemTwoQuantity);
	         System.out.println("Unit Price: " + itemTwoUnitPrice);
	         System.out.println("Amount: " + itemTwoAmount);
	         
	         double subtotal = (itemOneAmount + itemTwoAmount);
	         double tax = 0.7;
	         double serviceCharge = 1.16;
	         String total = String.format("%.2f", (subtotal + tax + serviceCharge));
	         System.out.println("\nSubtotal: RM " + subtotal );
	         System.out.println("Government Tax: RM " + tax);
	         System.out.println("Service Charge: RM " + serviceCharge);
	         
	         System.out.println("\nTotal: RM " + total);
	         
	         scanner.close();
		 
	 }
}
