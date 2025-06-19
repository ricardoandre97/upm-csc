package lab6;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gender;
	
	   	 
	    do {
	      	 System.out.print("Gender: (F/M) - To stop, type 0 ");
		   	 gender = scanner.nextLine();
	    }
        while (!gender.equals("0"));
        
       System.out.println("Loop exitted!");
    }
}