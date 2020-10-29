package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("495167879243", 1000);
		BankAccount acc2 = new BankAccount("123165879243", 5000);
		BankAccount acc3 = new BankAccount("398162779243", 7000);
		
		acc1.setName("Mary");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		

	}

}

class BankAccount implements iInterest {
	
	//data members of bank account
	private static int iD =1001;  			//Internal iD
	private String accountNumber; //ID + random 2 digit number + 2 SSN
	private static final String routingNumber = "9533002";
	private String name;
	private String SSN;
	private double balance;
	
	 
	
	//constructors
	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		//System.out.println("New Account Created");
		this.SSN = SSN;
		//iD++;
		setAccountNumber();
		//System.out.println(iD);
		
	}

	private void setAccountNumber () {
		int random = (int) (Math.random() * 10);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account number: " + accountNumber);		
		
		//System.out.println(random);
		//accountNumber = iD +;
		
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void payBill(double amount) {
		balance  = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
		
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Showing Deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
	}
	@Override
	public String toString() {
		return "Name:  " + name + " Account Number:  " + accountNumber + " Routing Number:  " + routingNumber + "  TOTAL BALANCE:  " + balance;
		
	}
}
