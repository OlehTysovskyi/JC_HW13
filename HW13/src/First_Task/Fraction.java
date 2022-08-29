package First_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction {
	
	private String fractionName;
	
	Fraction(String fractionName) {
		this.fractionName = fractionName;
	}
		
	List <Deputy> deputies = new ArrayList<>();
	Scanner scn = new Scanner(System.in);	

	public void addDeputy() {
		System.out.print("-Enter deputy's firstname: ");
		String firstname = scn.next();
		System.out.print("-Enter deputy's lastname: ");
		String lastname = scn.next();
		System.out.print("-Enter deputy's weight: ");
		double weight = scn.nextInt();
		System.out.print("-Enter deputy's height: ");
		double height = scn.nextInt();
		System.out.print("-Enter deputy's bribe status(true/false): ");
		boolean bribe = scn.nextBoolean();
		
		deputies.add(new Deputy(weight, height, firstname, lastname, bribe));
		System.out.println("-Deputy was added successfully" + "\n" + deputies);	
	}

	public void removeDeputy() {//don't work
		System.out.println(deputies.toString());
		System.out.print("-To remove deputy enter his firstname: ");
		String firstName = scn.next();
		
		for(Deputy d : deputies) {
			if(d.getFirstname().equals(firstName)) {
				deputies.remove(deputies.indexOf(d));
				System.out.println("-Deputy was removed successfully" + "\n" + deputies);
			}
		}
	}

	public void showAllBribers() {//don't work!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("-There are all bribers:");
		
		for(Deputy d : deputies) {
			
			if(d.isBribe()) {
				System.out.print(d + " | ");
			}
		}		
	}

	public void showTheBiggestBriber() {//don't work!!!!!!!!!!!!!!!!!!!!!!!!
		
		
	}

	public void showAllDeputies() {
		System.out.println(deputies);
	}

	public void removeAllDeputies() {
		deputies.removeAll(deputies);
		System.out.println(deputies);
	}
	
	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	@Override
	public String toString() {
		return "Fraction [fractionName=" + fractionName + ", deputies=" + deputies + "]";
	}

	
}
