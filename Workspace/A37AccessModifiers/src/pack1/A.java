package pack1;
import pack2.*;
public class A {
	
	
	public static void main(String[] args) {
		C c=new C();
		//System.out.println(c.DefaultMessagge); //non può accedere alla classe C perchè è in un altro package
		System.out.println(c.publicMessagge); // può accederci perchè abbiamo messo public nella classe c
}
}
