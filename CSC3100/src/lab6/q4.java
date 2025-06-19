package lab6;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        final int TOTAL_STAFF = 20;
        final double RATE_FIRST_500 = 0.70;
        final double RATE_AFTER_500 = 0.50;

        Scanner input = new Scanner(System.in);

        double total = 0;
        for (int i = 1; i <= TOTAL_STAFF; i++) {
            System.out.print("Enter distance traveled by staff #" + i + " in km: ");
            double distance = input.nextDouble();

            double claim;
            if (distance <= 500) {
                claim = distance * RATE_FIRST_500;
            } else {
                claim = (500 * RATE_FIRST_500) + ((distance - 500) * RATE_AFTER_500);
            }
            total += claim;
            System.out.printf("Staff #%d's total mileage claim: RM%.2f\n", i, claim);
        }

        System.out.printf("Total Claimed is: %.2f", total);
        input.close();
    }
}
