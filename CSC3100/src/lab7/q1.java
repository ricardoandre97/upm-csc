package lab7;

import java.util.Scanner;

public class q1 {

    public static int getAge(Scanner scanner) {
        System.out.print("Enter age: ");
        return scanner.nextInt();
    }

    public static double getWeight(Scanner scanner) {
        System.out.print("Enter weight (kg): ");
        return scanner.nextDouble();
    }

    public static double getHeight(Scanner scanner) {
        System.out.print("Enter height (cm): ");
        return scanner.nextDouble();
    }

    public static char getGender(Scanner scanner) {
        System.out.print("Enter Gender (f/m): ");
        return scanner.next().toLowerCase().charAt(0);
    }

    public static int getChoice(Scanner scanner) {
        System.out.print("Enter choice (1-BMI, 2-BMR): ");
        return scanner.nextInt();
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static double calculateBMR(int age, char gender, double weight, double heightCm) {
        if (gender == 'm') {
            return 66 + (6.23 * weight) + (12.7 * heightCm) - (6.8 * age);
        } else if (gender == 'f') {
            return 655 + (9.6 * weight) + (1.8 * heightCm) - (4.7 * age);
        } else {
            return -1; 
        }
    }

    public static void displayBMI(double bmi, double height, double weight) {
        System.out.printf("Your height is %.2fcm and weight is %.2fkg. So your BMI is %.2f\n", height, weight, bmi);
    }

    public static void displayBMR(double bmr, int age, char gender) {
        System.out.printf("Your age is %d. So your BMR is %.2f\n", age, bmr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("*****************************************");

            int age = getAge(scanner);
            double weight = getWeight(scanner);
            double height = getHeight(scanner);
            char gender = getGender(scanner);
            int choice = getChoice(scanner);

            if (choice == 1) {
                double bmi = calculateBMI(weight, height);
                displayBMI(bmi, height, weight);
            } else if (choice == 2) {
                double bmr = calculateBMR(age, gender, weight, height);
                if (bmr != -1) {
                    displayBMR(bmr, age, gender);
                } else {
                    System.out.println("Invalid gender input.");
                }
            } else {
                System.out.println("wrong code");
            }

            System.out.print("Do you want to continue?(y/n) ");
            char cont = scanner.next().toLowerCase().charAt(0);
            if (cont != 'y') {
                continueLoop = false;
            }
        }

        System.out.println("*****************************************");
        scanner.close();
    }
}
