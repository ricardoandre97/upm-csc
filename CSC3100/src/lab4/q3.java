package lab4;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("*Get your ticket sem fees:*\n");

        System.out.print("Code Program : ");
        String courseCode = scanner.nextLine().toUpperCase(); 

        System.out.print("Semester No : ");
        double sem = scanner.nextDouble();

        System.out.print("Credit hours : ");
        double credits = scanner.nextDouble();  
  
        if (sem < 1) {
            System.out.println("Invalid sem, must be greater than 0");
            scanner.close();
            return;
        }
 
        String courseName = null;
        double feePerCredit = 0;
        double firstSemFee = 0;
        double onwardsSemFee = 0;

        // Determine credits fee
        switch (courseCode) {

            case "MCS":
                courseName = "Master of Computer Science";
                feePerCredit = 250;
                firstSemFee = 1250;
                onwardsSemFee = 1000;
                break;

            case "ME":
                courseName = "Master of Environment";
                feePerCredit = 250;
                firstSemFee = 1400;
                onwardsSemFee = 1100;
                break;

            case "MPM":
                courseName = "Master in Plantation Management";
                feePerCredit = 275;
                firstSemFee = 1250;
                onwardsSemFee = 1000;
                break;

            case "MEOH":
                courseName = "Master of Environmental and Occupational Health";
                feePerCredit = 350;
                firstSemFee = 1250;
                onwardsSemFee = 1000;
                break;

            default:
                System.out.println("Invalid program code!");
                scanner.close();
                return;
        }
     
        double semFees = firstSemFee; // Default to first sem
        
        if (sem != 1) {
        	semFees = onwardsSemFee;
        }
     
        double totalFees = semFees + (feePerCredit * credits);

        // Output
        System.out.println("\n--- Fee Details ---");
        System.out.println("Master Program: " + courseName);
        System.out.println("Semester No: " + sem);
        System.out.println("Credit Hours: " + credits);
        System.out.println("Total Tuition Fees: RM " + totalFees);

        scanner.close();
    }
}

