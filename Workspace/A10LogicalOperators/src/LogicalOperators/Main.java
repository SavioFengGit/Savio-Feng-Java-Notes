package LogicalOperators;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		//logical operators = used to connect two or more espressions
		//&& both conditions must be true (and)
		//|| one or more condition must be true (or)
		//! reverses boolean value of condition (not)
		
		
		int tmp = 20;
		System.out.println("CASE > = < && Operators");
		if(tmp > 30) {
			System.out.println("It's hot outside \n");
		}
		else if (tmp >=20 && tmp <=30) {
			System.out.println("It's warm outside \n");
		}
		else {
			System.out.println("It's cold outside \n");
		}

		
		System.out.println("CASE OR operator ||");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game, press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game \n");
		}
		else {
			System.out.println("You are still playing the game \n");
		}
		
		
		System.out.println("CASE NOT operator !=");
		
		System.out.println("You are playing a game, press q or Q to quit");
		String reverseresponse = scanner.next();
		
		if(!reverseresponse.equals("q") || !reverseresponse.equals("Q")) {
			System.out.println("You are still playing the game  \n");
		}
		else {
			System.out.println("You quit the game \n");
		}
		
		
	}

}
