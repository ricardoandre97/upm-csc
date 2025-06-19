package lab8;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENTS = 100;

        String[] matric = new String[MAX_STUDENTS];
        double[][] marks = new double[MAX_STUDENTS][5]; // Quiz, Assignment, Midterm, FinalExam, TotalMark
        char[] grades = new char[MAX_STUDENTS];

        int count = 0;

        String more = "y";
        while (more.equalsIgnoreCase("y") && count < MAX_STUDENTS) {
            System.out.print("Enter Matric number: ");
            matric[count] = scanner.next();

            // Quizzes
            double quizSum = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter mark for Quiz " + i + ": ");
                quizSum += scanner.nextDouble();
            }
            double quizAvg = quizSum / 3;
            marks[count][0] = quizAvg;

            // Assignments
            double assignmentSum = 0;
            for (int i = 1; i <= 2; i++) {
                System.out.print("Enter mark for Assignment " + i + ": ");
                assignmentSum += scanner.nextDouble();
            }
            double assignmentAvg = assignmentSum / 2;
            marks[count][1] = assignmentAvg;

            // Midterm
            System.out.print("Enter mark for Midterm: ");
            marks[count][2] = scanner.nextDouble();

            // Final exam
            System.out.print("Enter mark for Final Exam: ");
            marks[count][3] = scanner.nextDouble();

            // Total mark calculation
            double total = calculateTotalMark(quizAvg, assignmentAvg, marks[count][2], marks[count][3]);
            marks[count][4] = total;

            // Grade
            grades[count] = determineGrade(total);

            count++;
            System.out.print("More students? (y/n): ");
            more = scanner.next();
            System.out.println();
        }

        System.out.println("Matric\\Mark Quiz Assign MidTerm FExam TotalMark Grade");

        // Grade counters
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < count; i++) {
            System.out.printf("%s %7.0f %6.0f %7.0f %6.0f %10.2f %4c\n",
                    matric[i], marks[i][0], marks[i][1], marks[i][2], marks[i][3], marks[i][4], grades[i]);

            switch (grades[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
            }
        }

        // Summary
        System.out.println();
        printGradeSummary("A", countA, count);
        printGradeSummary("B", countB, count);
        printGradeSummary("C", countC, count);
        printGradeSummary("D", countD, count);
        printGradeSummary("F", countF, count);

        scanner.close();
    }

    public static double calculateTotalMark(double quizAvg, double assignmentAvg, double midTerm, double finalExam) {
        double quizScore = quizAvg / 15;
        double assignmentScore = assignmentAvg / 25;
        double midTermScore = midTerm / 50;
        double finalExamScore = finalExam / 80;

        return quizScore * 15 + assignmentScore * 25 + midTermScore * 20 + finalExamScore * 40;
    }

    public static char determineGrade(double mark) {
        if (mark >= 80) return 'A';
        else if (mark >= 70) return 'B';
        else if (mark >= 55) return 'C';
        else if (mark >= 45) return 'D';
        else return 'F';
    }

    public static void printGradeSummary(String grade, int count, int total) {
        if (count > 0) {
            double percent = (count * 100.0) / total;
            System.out.printf("Grade %s – %d students, %.2f%%\n", grade, count, percent);
        }
    }
}
