package lab2;

import java.util.Scanner;

public class discount {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("*Enter a price and a discount *\n");
		 
		 System.out.print("Enter price $: ");
		 double price = scanner.nextDouble();
		 
		 System.out.print("Enter discount as a decimal .e.g (0.50) for 50% : ");
		 double discount = scanner.nextDouble(); 	

		
		 double newPrice =  price - (price * discount) ;
		 
        System.out.println("The new price after discount is: " + newPrice);

        scanner.close();
		 
	 }
}
