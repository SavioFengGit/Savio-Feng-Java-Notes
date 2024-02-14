package PassingObjects;

public class Main {

	public static void main(String[] args) {
			
		Garage garage = new Garage();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		garage.park(car1);//passaggio dell'oggetto car1 come argomento
		garage.park(car2);
		
	}
}
