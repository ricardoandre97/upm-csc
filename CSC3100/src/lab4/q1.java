package lab4;

import java.util.Scanner;

public class q1 {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("*Get your ticket price:*\n");
		 
		 System.out.print("Enter your age : ");
		 double age = scanner.nextDouble();
		 scanner.nextLine();

	         System.out.print("Enter park type (Theme, Water, Both) :");
	         String parkType = scanner.nextLine().toLowerCase();
	
	         String ageGroup;
	         double ticketPrice = 0;
	
	         if (age < 0) {
	             System.out.println("Invalid age entered.");
	             scanner.close();
	             return;
	         } else if (age < 3) {
	             ageGroup = "Baby";
	         } else if (age >= 3 && age <= 12) {
	             ageGroup = "Kid";
	         } else if (age >= 13 && age <= 20) {
	             ageGroup = "Teen";
	         } else if (age >= 21 && age <= 54) {
	             ageGroup = "Adult";
	         } else {
	             ageGroup = "Senior";
	         }
	
	         // Determine ticket price
	         switch (ageGroup) {
	         
	         case "Baby":
	             switch (parkType) {
	                 case "theme":
	                     ticketPrice = 0;
	                     break;
	                 case "water":
	                     ticketPrice = 7;
	                     break;
	                 case "both":
	                     ticketPrice = 5;
	                     break;
	                 default:
	                     System.out.println("Invalid park type.");
	                     scanner.close();
	                     return;
	             }
	             break;
	      
	             case "Kid":
	                 switch (parkType) {
	                     case "theme":
	                         ticketPrice = 10;
	                         break;
	                     case "water":
	                         ticketPrice = 15;
	                         break;
	                     case "both":
	                         ticketPrice = 20;
	                         break;
	                     default:
	                         System.out.println("Invalid park type.");
	                         scanner.close();
	                         return;
	                 }
	                 break;
	
	             case "Teen":
	                 switch (parkType) {
	                     case "theme":
	                         ticketPrice = 20;
	                         break;
	                     case "water":
	                         ticketPrice = 25;
	                         break;
	                     case "both":
	                         ticketPrice = 40;
	                         break;
	                     default:
	                         System.out.println("Invalid park type.");
	                         scanner.close();
	                         return;
	                 }
	                 break;
	
	             case "Adult":
	                 switch (parkType) {
	                     case "theme":
	                         ticketPrice = 25;
	                         break;
	                     case "water":
	                         ticketPrice = 30;
	                         break;
	                     case "both":
	                         ticketPrice = 45;
	                         break;
	                     default:
	                         System.out.println("Invalid park type.");
	                         scanner.close();
	                         return;
	                 }
	                 break;
	
	             case "Senior":
	                 switch (parkType) {
	                     case "theme":
	                         ticketPrice = 10;
	                         break;
	                     case "water":
	                         ticketPrice = 15;
	                         break;
	                     case "both":
	                         ticketPrice = 20;
	                         break;
	                     default:
	                         System.out.println("Invalid park type.");
	                         scanner.close();
	                         return;
	                 }
	                 break;
	         }
	
	         // Output
	         System.out.println("Age group: " + ageGroup);
	         System.out.println("Ticket price: $" + ticketPrice);
	 
	        scanner.close();
			 
	 }
}


