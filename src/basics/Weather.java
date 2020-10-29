package basics;

public class Weather {
	public static void main (String[] args) {
		//this program will give suggestions of what to wear based on the weather 
		
		int temp = 45;
		String sunCondition = "Sunny";// create the variables
		
		if (temp > 80) { //create the loop. 
			System.out.println("Its lovely weather where shorts and a tshirt");//print if the temperature is greater then it will print the below sentence
		}
		
		else if ((temp > 60) && (sunCondition == "Sunny")) {
			System.out.println("Its a little cooler. Where a coat :)");
			System.out.println("Wear Sun Glases");
		}
		else if (( temp > 50)|| (sunCondition =="Overcast")) {
			System.out.println("this is a cold day where a hat and jacket");
		}
		
		else {
			System.out.println("Looks like a cold day. bring a sweather");
			
		}
		System.out.println(" The program is ending");

	}

}
