package Module1;
import javax.swing.JOptionPane;
public class Nivell01Fase04 {
public static void main(String[] args) {
	
	String nom="Crist�bal Richart Barbeira";
	String data="06/11/1975";
	boolean valido= false;
	
	JOptionPane.showMessageDialog(null, "Este programa me dir� si mi a�o de nacimiento es bisiesto.");
	int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce dia de nacimiento:"));
	int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce mes de nacimiento:"));
	int a�o=Integer.parseInt(JOptionPane.showInputDialog("Introduce a�o de nacimiento:"));
	
	
	System.out.println("Mi nombre es: " + nom);
	System.out.println("Mi fecha de nacimiento es: " + dia + "/" + mes + "/" + a�o);
	
		if ((a�o % 100 != 0) && (a�o % 4 == 0) || (a�o % 400 == 0)) {
		System.out.println("Mi a�o de nacimiento es bisiesto.");
		valido=true;
		}else{System.out.println("Mi a�o de nacimiento no es bisiesto.");
			
	}
	
}
}
