package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating new bank account >> instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "123673";
		
		//acc1.name = "Roger Hue";
		//with encapsulation: public API method
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("SSN:  " + acc1.getSsn());
		
		acc1.balance = 100000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		//polymorphism through overriding
		 System.out.println(acc1.toString());
		 
		//polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "223673";
		
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "323673";
		
		//acc3.checkBalance();
		
		/* //demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		*/

	}

}
