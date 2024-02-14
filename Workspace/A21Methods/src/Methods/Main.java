package Methods;

public class Main {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		int x = 1;
		int y = 2;
		int z = add(x,y); //inserisco gli argomenti e via, ci aspettiamo il return di un int

		System.out.println(z);
	}
	
	
	//definizione del metodo
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	
}