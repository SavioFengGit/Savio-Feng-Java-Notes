package Printf;

public class Main {

	public static void main(String[] args) {

		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
				
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Savio";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		System.out.printf("%b",myBoolean);
		System.out.print("\n");
		System.out.printf("%c",myChar);
		System.out.print("\n");
		System.out.printf("%s",myString);
		System.out.print("\n");
		System.out.printf("%d",myInt);
		System.out.print("\n");
		System.out.printf("%f",myDouble);
		System.out.print("\n");
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Welcome %10s",myString); // stampa la stringa "Welcome" seguita da 10 spazi e dalla stringa della variabile myString
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have this much money %.1f",myDouble); //stampa la stringa "You have this much money" seguita dal valore della variabile myDouble con una sola cifra decimale
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		//System.out.printf("You have this much money %,f",myDouble); // stampa la stringa "You have this much money" seguita dal valore della variabile myDouble con il separatore delle virgole
	}
}
