package lab5;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String firstString = input.nextLine();

        int length = firstString.length();
        if (length > 8) {
            System.out.println("Valid password!!");
            System.out.println("First String : \"" + firstString + "\" with length " + length);
        } else {
            System.out.println("Invalid password");
        }

        System.out.print("Enter second String: ");
        String secondString = input.nextLine();

        if (firstString.contains(secondString)) {
            System.out.println("Second String exists in First String");
        } else {
            System.out.println("Second String not exists in First String");
            String combined = firstString + secondString;
            System.out.println("New Statement in String 1 :" + combined);
        }

        input.close();
    }
}
