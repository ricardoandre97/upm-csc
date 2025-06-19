package lab6;

import java.util.Scanner;

public class q2 {

	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int visitorN = 1;
	    System.out.println("******VISITOR " + visitorN + " *******\n");
        while (true) {
	        while(true) {
	            System.out.print("Enter your nationality: (M - Malaysian. F - Foreigner ) ");
	            String nationality = scanner.nextLine();
	            
	            String foreignerType = null ;
	            if (nationality.equals("F")) {
	            	System.out.print("From which part? (I- Kad/Working Permit/Dependent Pass, E- Asean, O - Others):");
	    			foreignerType = scanner.nextLine();
	            }
	
		        System.out.print("Choose category of visitor (A- Adult, C - Children, S - senior) ");
		        String category = scanner.nextLine();
		        
		        System.out.print("Number of tickets: ");
		        double numberOfTickets = scanner.nextDouble();
		        scanner.nextLine();
	             
		        
		        double ticketPrice = 0;
	            switch (category) {
	            	case "A":
	            		
	            		if (nationality.equals("M")) {
	            			ticketPrice = 43;
	            		}
	            		else if (nationality.equals("F")) {
	            			
	            			switch (foreignerType) {
	            				case "I":
	            					ticketPrice = 50;
	            					break;
	            					
	            				case "E":
	            					ticketPrice = 61;
	            					break;
	            				case "O":
	            					ticketPrice = 82;
	            					break;
	            			}
	            		}
	            		
	            		
	            	case "C":
	            		if (nationality.equals("M")) {
	            			ticketPrice = 16;
	            		}
	            		else if (nationality.equals("F")) {
	            			
	            			switch (foreignerType) {
	            				case "I":
	            					ticketPrice = 25;
	            					break;
	            					
	            				case "E":
	            					ticketPrice = 33;
	            					break;
	            				case "O":
	            					ticketPrice = 43;
	            					break;
	            			}
	            		}
	            	case "S":
	            		if (nationality.equals("M")) {
	            			ticketPrice = 21;
	            		}
	            		else if (nationality.equals("F")) {
	            			
	            			switch (foreignerType) {
	            				case "I":
	            					ticketPrice = 50;
	            					break;
	            					
	            				case "E":
	            					ticketPrice = 61;
	            					break;
	            				case "O":
	            					ticketPrice = 82;
	            					break;
	            			}
	            		}	
	            		break;
	            	
	            		
	            }
	            
	            double visitorPrice = ticketPrice * numberOfTickets;
	            System.out.println("Visitor Type " + category + "  Charge " + visitorPrice);
	
	            System.out.print("Buy another ticket (Y/N) ");
	            String keepGoing = scanner.nextLine();
	            
	            if (keepGoing.equals("N")) {
	            	break;
	            }
	            
	        }
	    

	    System.out.print("Enter another visitor (Y/N)?");
        String addVisitor = scanner.nextLine();
        
        if (addVisitor.equals("N")) {
        	break;
        }
        visitorN += 1;

        }
        System.out.println("Bye!");
    }
}
