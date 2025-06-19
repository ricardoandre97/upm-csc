package lab7;

import java.util.Scanner;

public class q3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String more = "y";
        while (more.equalsIgnoreCase("y")) {
            String name = readStudentName();
            
            double quizAvg = calculateQuizAverage();
            System.out.printf("Quizzes average is: %.2f\n", quizAvg);
            
            double assignmentAvg = calculateAssignmentAverage();
            System.out.printf("Assignment average is: %.2f\n", assignmentAvg);
            
            double midTermMark = readMark("Mid-Term Exam mark");
            double finalExamMark = readMark("Final Exam mark");
            
            double totalMark = calculateTotalMark(quizAvg, assignmentAvg, midTermMark, finalExamMark);
            char grade = determineGrade(totalMark);
            
            displayResult(name, totalMark, grade);
            
            System.out.print("More grade computation? y/n: ");
            more = scanner.next();
            System.out.println();
        }
    }

    public static String readStudentName() {
        System.out.print("Enter student’s name: ");
        return scanner.next();
    }

    public static double readMark(String prompt) {
        System.out.print("Enter mark for " + prompt + ": ");
        return scanner.nextDouble();
    }

    public static double calculateQuizAverage() {
        double sum = 0;
        for (int i = 1; i <= 3; i++) {
            double mark = readMark("Quiz" + i);
            sum += mark;
        }
        return sum / 3.0;
    }

    public static double calculateAssignmentAverage() {
        double sum = 0;
        for (int i = 1; i <= 2; i++) {
            double mark = readMark("Assignment" + i);
            sum += mark;
        }
        return sum / 2.0;
    }

    public static double calculateTotalMark(double quizAvg, double assignmentAvg, double midTerm, double finalExam) {
   
        double quizScore = quizAvg / 15;
        double assignmentScore = assignmentAvg / 25;
        double midTermScore = midTerm / 50;
        double finalExamScore = finalExam / 80;

        return quizScore * 15 + assignmentScore * 25  + midTermScore * 20 + finalExamScore * 40;
    }

    public static char determineGrade(double finalMark) {
        if (finalMark >= 80)
            return 'A';
        else if (finalMark >= 70)
            return 'B';
        else if (finalMark >= 55)
            return 'C';
        else if (finalMark >= 45)
            return 'D';
        else
            return 'F';
    }

    public static void displayResult(String name, double totalMark, char grade) {
        System.out.printf("%s, your final mark for CSC3100 is %.2f and grade %c.\n", name, totalMark, grade);
    }
}
