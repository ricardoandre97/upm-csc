package lab6;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            System.out.print("Enter product number (1-5) or 0 to stop: ");
            int productNumber = scanner.nextInt();

            if (productNumber == 0) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            int quantity = scanner.nextInt();

            double price = 0.0;

            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue;
            }

            double retailValue = price * quantity;
            total += retailValue;
        }

        System.out.printf("Total retail value of all products sold: RM%.2f\n", total);
        scanner.close();
    }
}
