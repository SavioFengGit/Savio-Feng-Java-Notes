package ArrayList2D;

import java.util.*;


//Creazione di una lista di array
public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		//creazione primo ArrayList
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta"); //utilizzo il metodo add dell'array list per aggiungere elementi
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		
		//creazione secondo ArrayList
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		//creazione terzo ArrayList
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		//aggiungo alla lista gli array list creati
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//output
		System.out.println(groceryList);
		
	}
}
