package lab7;

import java.util.Scanner;

public class q2 {

    static int countA = 0, countB = 0, countC = 0, countD = 0;
    static double totalWeightA = 0, totalWeightB = 0, totalWeightC = 0, totalWeightD = 0;

    public static char getGrade(double weight) {
        char grade;
        if (weight > 44) {
            grade = 'A';
            totalWeightA += weight;
        } else if (weight >= 30) {
            grade = 'B';
            totalWeightB += weight;
        } else if (weight >= 25) {
            grade = 'C';
            totalWeightC += weight;
        } else {
            grade = 'D';
            totalWeightD += weight;
        }
        return grade;
    }

    public static void countGrade(char grade) {
        switch (grade) {
            case 'A' -> countA++;
            case 'B' -> countB++;
            case 'C' -> countC++;
            case 'D' -> countD++;
        }
    }

    public static void displayReport() {
        int totalEggs = countA + countB + countC + countD;
        double totalWeight = totalWeightA + totalWeightB + totalWeightC + totalWeightD;

        System.out.println("\n*** Egg Grading Report ***");
        System.out.printf("Grade A: %d eggs, Avg weight: %.2f g\n", countA, countA == 0 ? 0 : totalWeightA / countA);
        System.out.printf("Grade B: %d eggs, Avg weight: %.2f g\n", countB, countB == 0 ? 0 : totalWeightB / countB);
        System.out.printf("Grade C: %d eggs, Avg weight: %.2f g\n", countC, countC == 0 ? 0 : totalWeightC / countC);
        System.out.printf("Grade D (rejected): %d eggs, Avg weight: %.2f g\n", countD, countD == 0 ? 0 : totalWeightD / countD);
        System.out.printf("Total eggs: %d, Total weight: %.2f g\n", totalEggs, totalWeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_EGGS = 2;

        for (int i = 1; i <= NUM_EGGS; i++) {
            System.out.print("Enter weight of egg #" + i + " (in grams): ");
            double weight = scanner.nextDouble();
            char grade = getGrade(weight);  
            countGrade(grade);
            System.out.println("Grade: " + grade);
        }

        displayReport();
        scanner.close();
    }
}
