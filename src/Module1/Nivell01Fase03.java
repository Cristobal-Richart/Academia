package Module1;
import javax.swing.JOptionPane;
public class Nivell01Fase03 {
public static void main(String[] args) {
		
	boolean valido =false;
	String cierto="Any de traspàs";
	String nocierto="No any de traspàs";
	
	
			do{
			int entradaño=Integer.parseInt(JOptionPane.showInputDialog("Introdueix data de naixement"));
			for (int i=1900; i<=2000; i+=4) { 
			System.out.println(cierto + " " + i);	
			}
			if((entradaño % 100 != 0) && (entradaño % 4 == 0) || (entradaño % 400 == 0)) {
			
				System.out.println(cierto);
				valido=true;
				}else {System.out.println(nocierto);
			}
			
			}while(valido=false);
		
}
}