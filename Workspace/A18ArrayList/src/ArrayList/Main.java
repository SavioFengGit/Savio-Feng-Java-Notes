package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// ArrayList = 	a resizable array. 
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		
		ArrayList<String> film = new ArrayList<String>();
		
		film.add("Heroes");
		film.add("Spiderman");
		film.add("Superman");
		
		//film.set(0, "Batman"); //cambio il primo film
		//film.remove(2); //rimuovo il terzo film
		//film.clear(); //rimuovo tutti gli elementi
		
		
		//output
		for(int i=0; i<film.size(); i++) {
			
			System.out.println(film.get(i));
		}
	}
}
