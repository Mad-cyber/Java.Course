package basics;

/**
 * @author Kerrie
 *Date: 27th of April 2020
 *SalaryCalculator.java
 */
public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		//create a variable to define career
		
		//declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Software developer";
		System.out.println("My career is a  " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		//compute our yearly salary
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " is  €" + rate + "per hour, meaning my salary is " + salary);
		
		//rate times hours per weeks times weeks per year
		
	}
	
	
	

}
