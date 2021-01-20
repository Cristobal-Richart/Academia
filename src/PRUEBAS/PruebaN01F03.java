package PRUEBAS;
import javax.swing.JOptionPane;
public class PruebaN01F03 {
public static void main(String[] args) {
	
	
	boolean valido =true;
	String cierto="año bisiesto.";
	String nocierto="año no bisiesto.";
	String tuañobisiesto= " naciste un año bisiesto";
	String tuañonobisiesto=" naciste un año no bisiesto";
	
	do{		
		
		for (int i=1896; i<=2004; i++) {
			
			if ((i % 100 != 0 && i % 4 == 0) || (i % 100 ==0 && i % 400 ==0)) System.out.println(i+ ", " + cierto);
			else System.out.println(i + ", " + nocierto);
			
		}System.out.println();
		int entradaño= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu fecha de nacimiento."));
		if ((entradaño % 100 != 0 && entradaño % 4 == 0) || (entradaño % 100 ==0 && entradaño % 400 ==0)) System.out.println(entradaño + ", " + tuañobisiesto);
		else System.out.println(entradaño + ", " + tuañonobisiesto);
	
			
		
	}while(valido==false);
}
}
