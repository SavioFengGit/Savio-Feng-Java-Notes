package GenerateRandomNumbers;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Random random = new Random(); //creo l'oggetto random
		
		int x = random.nextInt(); //genero un numero random di tipo int
		System.out.println("The Random number int is: " + x);
		
		int y = random.nextInt(100); //limito da 0 a 100
		System.out.println("The Random number int in range is: " + y);
		
		double d = random.nextDouble();
		System.out.println("The Random number double is: " + d);
		
		boolean b = random.nextBoolean();
		System.out.println("The Random boolean state is: " + b);

	}

}
