package lab6;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueLoop;

        do {
            System.out.println("\nBMI information:");
            System.out.println("BMI (18.5-24.9) → Normal");
            System.out.println("BMI (25-29.9) → Over Weight");
            System.out.println("BMI (30-34.9) → Obese");
            System.out.println("BMI (35-39.9) → Severely Obese");
            System.out.println("BMI (>=40) → Morbidly Obese");
            System.out.println("********************************************");
            System.out.println("CAUTION!!");
            System.out.println("Women – waist size > 35 inches");
            System.out.println("Men – waist size > 40 inches");
            System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
            System.out.println("********************************************");

            System.out.println("\nHEALTH CALCULATOR");
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            
            System.out.print("Enter your gender (M/F): ");
            String gender = input.nextLine();

            System.out.print("Enter your height in meters: ");
            double height = input.nextDouble();

            System.out.print("Enter your weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.print("Enter your waist size in inches: ");
            double waist = input.nextDouble();
            input.nextLine();

            double bmi = weight / (height * height);
            String category;
            
            if (bmi >= 18.5 && bmi <= 24.9)
            	
                category = "Normal";
            else if (bmi >= 25 && bmi <= 29.9)
            	category = "Over Weight";
            else if (bmi >= 30 && bmi <= 34.9)
            	category = "Obese";
            else if (bmi >= 35 && bmi <= 39.9)
            	category = "Severely Obese";
            else if (bmi >= 40)
            	category = "Morbidly Obese";
            else
            	category = "Underweight";
      
            boolean highRisk = (gender.equals("F") && waist > 35) || (gender.equals("M") && waist > 40);

            System.out.printf("%s, your BMI is %.2f, so that means you are %s", name, bmi, category);

            if (highRisk) {
                System.out.println(" and has higher risk for heart disease and diabetes!!!");
            } else {
                System.out.println(" and has a good life style..Congratss!!!!.");
            }

            System.out.print("Continue with next person? (Y/N): ");
            continueLoop = input.nextLine();

        } while (!continueLoop.equals("N"));

        System.out.println("Thank you for using this system……");
        input.close();
    }
}


