package basics;

public class Cities {

	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "Texas", "Limerick", "Dublin"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare array
		String[] countries;
		
		//define the array
		
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Europe";
		System.out.println(countries[1]);
		
		System.out.println("***********************");
		
		//declare and define the array (only size)
				String[] states = new String[5];
				states[0] = "NJ";
				states[1] = "Austin";
				states[2] = "Ireland";
				states[3] = "Ireland2";
				states[4] = "Ireland3";
				int i = 0;
				do {
				//do loop enters the loop then tests the condition
				System.out.println(states[i]);
				i = i + 1;
				} while (i < 5);
		//while loop tests condition first then enters loop
				
				int n = 0;
				boolean stateFound = false;
				while(!stateFound) {
				String state = states[n];
				System.out.println(state);
				if (state =="Ireland2") {
					System.out.println("State Found!");
					stateFound = true;
				}
					
				n++;
				
				}
				System.out.println("\nPRINTING WITH FOR LOOP");
			//For Loop; best structure for iterating through an array
				for(int x = 0; x < 5; x++) {
					System.out.println(states[x]);
					
				}
		

	}

}
