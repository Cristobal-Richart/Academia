package PRUEBAS;
import javax.swing.JOptionPane;
public class PruebaN01F03 {
public static void main(String[] args) {
	
	
	boolean valido =true;
	String cierto="a�o bisiesto.";
	String nocierto="a�o no bisiesto.";
	String tua�obisiesto= " naciste un a�o bisiesto";
	String tua�onobisiesto=" naciste un a�o no bisiesto";
	
	do{		
		
		for (int i=1896; i<=2004; i++) {
			
			if ((i % 100 != 0 && i % 4 == 0) || (i % 100 ==0 && i % 400 ==0)) System.out.println(i+ ", " + cierto);
			else System.out.println(i + ", " + nocierto);
			
		}System.out.println();
		int entrada�o= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu fecha de nacimiento."));
		if ((entrada�o % 100 != 0 && entrada�o % 4 == 0) || (entrada�o % 100 ==0 && entrada�o % 400 ==0)) System.out.println(entrada�o + ", " + tua�obisiesto);
		else System.out.println(entrada�o + ", " + tua�onobisiesto);
	
			
		
	}while(valido==false);
}
}
