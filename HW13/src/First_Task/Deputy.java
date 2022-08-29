package First_Task;

import java.util.Scanner;

public class Deputy extends Human{
	
	private String firstname, lastname;
	private boolean bribe;
	private int bribeSize;
	
	public Deputy(double weight, double height, String firstname, String lastname, boolean bribe) {
		super(weight, height);
		this.firstname = firstname;
		this.lastname = lastname;
		this.bribe = bribe;
	}
	
	public void giveBribe(boolean bribe, int bribeSize) {
		Scanner scn = new Scanner(System.in);

		if(bribe == false) {
			System.out.println("-" + this.firstname + " " + this.lastname + " doesn't take bribes!");
		}
		else {
			System.out.print("-Enter the size of bribe: ");
			bribeSize = scn.nextInt();
			
			if(bribeSize > 5000) {
				System.out.println("-The police will arest " + this.firstname + " " + this.lastname);
			}
			else {
				this.bribeSize = bribeSize;
			}
		}			
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isBribe() {
		return bribe;
	}

	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputy [firstname='" + firstname + "'; lastname='" + lastname + "'; bribe='" + bribe + "'; " + super.toString() + "]";
	}
	
	
	
	
}
