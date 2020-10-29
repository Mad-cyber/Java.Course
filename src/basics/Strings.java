package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle ="The Lord of the Rings";
		
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
			
		}
		
		String browser = "Chrome";
		if (browser =="Chrome") {
			if(browser.equalsIgnoreCase("Chrome")) {
				System.out.println("The browser is Chrome");
				
			}
			
			String firstName = "Kerrie";
			String lastName = "Ryan";
			String number = "123456";
			
			System.out.println("there are  " + number.length() + "digits in you SSN ");
			
			//print the intials plus the last 4 digits of number
			System.out.println(firstName.substring(0, 1));
			System.out.println(lastName.substring(0, 4));
			System.out.println(number.substring(5));
			
		}
	}

}
