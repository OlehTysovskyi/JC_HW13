package First_Task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Fraction fraction = new Fraction("vh");		
		VerhovnaRada VR = new VerhovnaRada();
		Scanner scn = new Scanner(System.in);
		int consoleKey = 0;
		
		while (true) {
			System.out.println("======================================================"
					+ "\n-Enter '1' to add a fraction" 
					+ "\n-Enter '2' to remove a fraction"
					+ "\n-Enter '3' to see all fractions" 
					+ "\n-Enter '4' to clear a fraction"
					+ "\n-Enter '5' to see a fraction" 
					+ "\n-Enter '6' to add deputy in a fraction"
					+ "\n-Enter '7' to remove deputy from a fraction" 
					+ "\n-Enter '8' to see all bribers"
					+ "\n-Enter '9' to see the biggest briber");
			consoleKey = scn.nextInt();
			
			switch (consoleKey) {
				case (1): {
					VR.addFraction();
					break;
				}
	
				case (2): {
					VR.removeFraction();
					break;
				}
	
				case (3): {
					VR.showAllFractions();
					break;
				}
	
				case (4): {
					VR.removeAllDeputiesFromFraction();
					break;
				}
	
				case (5): {
					VR.showConcretteFraction();					
					break;
				}
	
				case (6): {
					VR.addDeputyToFraction();
					break;
				}
	
				case (7): {
					VR.removeDeputyFromFraction();
					break;
				}
	
				case (8): {
					VR.showAllBribers();
					break;	
				}
	
				case (9): {
					VR.showTheBiggestBriber();
					break;	
				}
			}
		}

	}

}
