package SuperKeyword;

public class Hero extends Person{


	String power;
	
	Hero(String name,int age,String power){	
		super(name,age); //con super accedo alla classe madre, in questo caso il costruttore lo avvia dalla classe madre, non serve farlo qui
		this.power = power;
	}
	
	public String toString() {
		return super.toString()+this.power;
	}
}
