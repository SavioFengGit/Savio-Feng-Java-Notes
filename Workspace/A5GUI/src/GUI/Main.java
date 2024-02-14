package GUI;

import javax.swing.JOptionPane; //non me lo importava, diceva permission denied
// questo è successo con Java SE17, l'ho aggiungo sul module-info.java come
// requisito di modulo e si è debuggato
public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello my friend! " + name);
		
		
		//si converte il valore inserito in Intero in quanto la funzione restituisce una stringa
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your are! " + age);
		
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "Your are! " + height +"cm!");
		
	}

}
