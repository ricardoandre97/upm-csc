package lab5;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String firstString = input.nextLine();

        int length = firstString.length();
        if (length > 10) {

            String sub = firstString.substring(5, 11); 
            System.out.println("Substring from 5 to 10: " + sub + ", length " + length);
        } else {
            System.out.println("String length less than 10");
        }

        System.out.print("Enter second String: ");
        String secondString = input.nextLine();

        if (firstString.contains(secondString)) {
            System.out.println("Second String exists in First String");

   
            String newString = firstString.replaceFirst(secondString, "Selamat Datang");
            System.out.println("New Statement in String 1 : " + newString);
        } else {
            System.out.println("Second String not exists in First String");
        }

        input.close();
    }
}
