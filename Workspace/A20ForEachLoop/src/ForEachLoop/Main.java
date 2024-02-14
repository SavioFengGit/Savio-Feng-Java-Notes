package ForEachLoop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
		
		
		
		//Creazione array list
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat"); //aggiungo gli elementi
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		int count = 0;
		for(String i : animals) { //itero fino alla fine degli elementi di animals
			
			count++;
			System.out.println("In the position "+ count + " there is: " + i);
			
		}
	}
}
