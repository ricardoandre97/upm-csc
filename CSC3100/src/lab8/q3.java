package lab8;
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int states = 2;
        int days = 7;

        String[] stateNames = new String[states];
        int[][] cases = new int[states][days];
        int[] stateTotals = new int[states];
        int overallTotal = 0;

        // a. Read daily cases
        for (int i = 0; i < states; i++) {
            System.out.print("Enter state name: ");
            stateNames[i] = scanner.next();

            System.out.println("Enter daily cases for " + stateNames[i] + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                cases[i][j] = scanner.nextInt();
                stateTotals[i] += cases[i][j];
            }

            overallTotal += stateTotals[i];
            System.out.println();
        }

        // d. Display summary table
        System.out.printf("%-10s", "State");
        for (int d = 1; d <= days; d++) {
            System.out.printf("  Day%d", d);
        }
        System.out.printf("  Total\n");

        for (int i = 0; i < states; i++) {
            System.out.printf("%-10s", stateNames[i]);
            for (int j = 0; j < days; j++) {
                System.out.printf(" %5d", cases[i][j]);
            }
            System.out.printf("  %5d\n", stateTotals[i]);
        }

        System.out.println("\nOverall Total Cases: " + overallTotal);

        // e. line graph 
        System.out.println("\nLine Graph of Total Cases by State (percentage):");

        for (int i = 0; i < states; i++) {
            double percent = (stateTotals[i] * 100.0) / overallTotal;
            System.out.printf("%-10s (%.2f%%): ", stateNames[i], percent);

            int barLength = (int)(percent / 2); 
            for (int j = 0; j < barLength; j++) {
                System.out.print("-");
            }
            System.out.println(">");
        }

        scanner.close();
    }
}
