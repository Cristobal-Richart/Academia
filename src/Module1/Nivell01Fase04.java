package Module1;
import javax.swing.JOptionPane;
public class Nivell01Fase04 {
public static void main(String[] args) {
	
	String nom="Cristóbal Richart Barbeira";
	String data="06/11/1975";
	boolean valido= false;
	
	JOptionPane.showMessageDialog(null, "Este programa me dirá si mi año de nacimiento es bisiesto.");
	int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce dia de nacimiento:"));
	int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce mes de nacimiento:"));
	int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce año de nacimiento:"));
	
	
	System.out.println("Mi nombre es: " + nom);
	System.out.println("Mi fecha de nacimiento es: " + dia + "/" + mes + "/" + año);
	
		if ((año % 100 != 0) && (año % 4 == 0) || (año % 400 == 0)) {
		System.out.println("Mi año de nacimiento es bisiesto.");
		valido=true;
		}else{System.out.println("Mi año de nacimiento no es bisiesto.");
			
	}
	
}
}
