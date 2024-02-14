package Variables;
//a placeholder for a value that behaves as the value it contains

//boolean 1 bit primitive -> true or false
//byte 1 byte primitive -> -128 to 127
//short 2 bytes primitive -> -32,768 to 32,767
//int 4 bytes primitive -> -2billion to 2 billion
//long 8 bytes primitive -> -9 quintillion to 9 quintillion
//float 4 bytes primitive -> fractional number up to 6-7 digits  ex. 3,432142f
//double 8 bytes primitive -> fractional number up to 15 digits ex 3,132132123432123
//chat 2 bytes primitive -> single character/letter/ASCII value  ex 'f'
//String varies reference -> a sequence of characters ex. "hello friend"

//primitive: stores data -> can only hold 1 value -> less memory -> fast
//reference: stores an address -> could hold more than 1 value -> more memory -> slower

public class Variables {

	public static void main(String[] args) {

		int x; // dichiarazione
		x = 18; // assegnazione

		double y = 22.33; // inizializzazione = dichiarazione + assegnazione

		System.out.println("The double number is " + y);

		System.out.println("The best number is " + x);

		long l = 1238987129139841L; // best practice va la L alla fine

		System.out.println("The long number is " + l);

		float dec = 1321.32324f; // best practice va la f alla fine

		System.out.println("The decimal number is " + dec);

		char symbol = '@';

		System.out.println("The symbol is " + symbol);

		String name = "Savio";

		System.out.println("My name is " + name);
	}

}
