package oop;


class Person {
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println (name+ "is walking");
	}
	void eat () {
		System.out.println (email);
	}
	void sleep () {
		System.out.println (name + "is sleeping");
	}
}

public class Demo {
	public static void main(String[] args) {
		
		//instantiating the class
		
		Person person1 = new Person();
		
		//define some properties
		person1.name = "Joe  ";
		person1.email = "joe@email.com";
		person1.phone ="085222222";
		
		//Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "mary  ";
		person2.sleep();
		
		
		
		  /*   //person-
		
		//Attributes, variables, adjectives, descriptors
		
		String name ="Joe";
		String email = "joe@email.com";
		String phone = "08222225671";
		
		//Action, activity behavior 
		//System.out.println(name + " is walking ");
		//System.out.println(name + " is eating ");
		walking(name);
		System.out.println(name + "is eating");
		
		//what if we do this for another person??
		//System.out.println(name2 + walking)
		
		String name2 ="Mary";
		String email2 = "mary@email.com";
		String phone2 = "0811111111111";
		
		//Action, activity behavior 
		//System.out.println(name2 + " is walking ");
		//System.out.println(name2 + " is eating ");	
		
		//enhance by adding functions to minmize code
		static void walking (String name) {
		System.out.println(name = "is walking");
		
		}
		
		
		
		
			
			
		
		
	*/ }

}
