package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate ");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("increase rate");
		
		
	}
	
	public void setTerm (int term) {
		System.out.prinln("Setting the term to: " + term + "years");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schdule");
	}

	
}
