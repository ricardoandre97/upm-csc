package lab8;

import java.util.Scanner;

public class q1 {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obesity";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_USERS = 100;

        String[] names = new String[MAX_USERS];
        int[] ages = new int[MAX_USERS];
        double[] weights = new double[MAX_USERS];
        double[] heights = new double[MAX_USERS];
        double[] bmis = new double[MAX_USERS];
        String[] categories = new String[MAX_USERS];

        int count = 0;
        int countOverNormal = 0;

        double totalNormalBMI = 0;
        int countNormal = 0;

        double totalObesityBMI = 0;
        int countObesity = 0;

        while (true) {
            System.out.print("Enter name: ");
            names[count] = scanner.next();

            System.out.print("Enter age: ");
            ages[count] = scanner.nextInt();

            System.out.print("Enter weight (kg): ");
            weights[count] = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            heights[count] = scanner.nextDouble();

            bmis[count] = calculateBMI(weights[count], heights[count]);
            categories[count] = getBMICategory(bmis[count]);

            if (bmis[count] > 25) countOverNormal++;

            if (categories[count].equals("Normal")) {
                totalNormalBMI += bmis[count];
                countNormal++;
            } else if (categories[count].equals("Obesity")) {
                totalObesityBMI += bmis[count];
                countObesity++;
            }

            count++;

            System.out.print("Add another user? (y/n): ");
            if (scanner.next().toLowerCase().charAt(0) != 'y') break;
        }

        System.out.println("\nName\tAge\tWeight\tHeight\tBMI\tCategory");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s\t%d\t%.1f\t%.1f\t%.2f\t%s\n",
                names[i], ages[i], weights[i], heights[i], bmis[i], categories[i]);
        }

        if (countNormal > 0)
            System.out.printf("The average BMI for Normal category = %.2f\n", totalNormalBMI / countNormal);
        if (countObesity > 0)
            System.out.printf("The average BMI for Obesity category = %.2f\n", totalObesityBMI / countObesity);

        System.out.println("Number of users with BMI > Normal: " + countOverNormal);

        scanner.close();
    }
}
