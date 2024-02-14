package IFStatements;

import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {

		//if statement = performs a block of code if it's condition evaluates to be true
		
		Scanner scanner = new Scanner(System.in); //creo l'oggetto scanner di tipo Scanner
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt(); //input
		
		if(age>=18 && age<75) {
			System.out.println("Hey you are an Adult!");
		}
		else if(age >=75){
			System.out.println("Hey you are old");
		}
		else {
			System.out.println("Hey you are a Baby");
		}

		scanner.close();
	}

}
