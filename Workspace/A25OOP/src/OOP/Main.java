package OOP;

public class Main {

	public static void main(String[] args) {
		
		Car myCar1 = new Car(); //creo l'oggetto myCar1 dalla classe Car
		Car myCar2 = new Car();

		System.out.println(myCar1.make); //output dell'attributo della classe madre, perchè non è stato definitov il costruttore e quindi non ha un model e make suo istanziabile
		System.out.println(myCar1.model);

		myCar1.drive(); //richiamo il metodo della classe madre
		myCar1.brake();
	}
}

