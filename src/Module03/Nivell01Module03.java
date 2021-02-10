package Module03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Nivell01Module03 {
public static void main(String[] args){
	
	// Fase 01
	
	String ciutat01="";
	String ciutat02="";
	String ciutat03="";
	String ciutat04="";
	String ciutat05="";
	String ciutat06="";
	
	System.out.println("Introduce el nombre de una ciudad seis veces: ");
	Scanner entrada=new Scanner(System.in);
		ciutat01=entrada.next();
		ciutat02=entrada.next();
		ciutat03=entrada.next();
		ciutat04=entrada.next();
		ciutat05=entrada.next();
		ciutat06=entrada.next();
		
	//System.out.println(ciutat01+"\n"+ciutat02+"\n"+ciutat03+"\n"+ciutat04+"\n"+ciutat05+"\n"+ciutat06);
		
		entrada.close();
	
	// Fase 02
		
	ArrayList<String> ciudades= new ArrayList<String>();
	
		ciudades.add(ciutat01);
		ciudades.add(ciutat02);
		ciudades.add(ciutat03);
		ciudades.add(ciutat04);
		ciudades.add(ciutat05);
		ciudades.add(ciutat06);
		
		Collections.sort(ciudades,String.CASE_INSENSITIVE_ORDER);		
		
		for(String sElemento: ciudades){
		 System.out.println(sElemento);	
		}
		
		
	
}
}
