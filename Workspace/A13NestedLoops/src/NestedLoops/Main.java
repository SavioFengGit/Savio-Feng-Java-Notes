package NestedLoops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// nested loops = a loop inside of a loop
		
		System.out.println("Creation of matrix with a specific symbols as values");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter numbers of rows: ");
		int rows = scanner.nextInt();
		
		System.out.println("Enter numbers of columns: ");
		int columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		String symbol = scanner.next();
		
		System.out.println("The Matrix in output is ");
		
		for(int i=1; i<=rows; i++) {
			
			System.out.println();
			
			for(int j=1; j<=columns;j++) {
				
				System.out.print(symbol);
				
			}
		}	
	}
}