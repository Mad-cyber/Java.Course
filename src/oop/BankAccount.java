package oop;

public class BankAccount implements IRate {
//define variable
	String accountNumber;
	//static belongs to the class not the object instance
	//final >> constant often static final
	private static final String routingNumber = "235787";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructors define: unique method
    //1. they are used to define /setup/ initialise of an object
    //2. Constructors are IMPLICITY called upon instantiation
	//3.the same name as the class itself
	//4. Constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	//overloading:call same method name with different arguments
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accoutType, double initDeposit){
		//intiDeposit, accountType, Msg are all local variables can only be called in the block
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INTIAL DEPOSIT OF " + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "Error: min depost must be £1000";
		}else {
			Msg = "thanks for you deposit of :" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
		
	}
	
	//getters and setters
	//allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE: ");
		
	}
	
	public void increaseRate() {
		System.out.println(" Increased Rate; ");
		
	}
	
	

	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity ("DEPOSIT:");
		
		
	}
	
	public void withdraw(double amount)	{
		balance = balance + amount;
		showActivity("WITHDRAW");
		
		
	}
	//private; can only be called within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANS : " + activity);
		System.out.println ("New BALANCE IS " + balance);
	}
	
	void checkBalance() {
		
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME " + name + " ACCOUNT NO." + accountNumber + " BALANCE : $ " + balance + "]";
		
	}
	
}
	
	
