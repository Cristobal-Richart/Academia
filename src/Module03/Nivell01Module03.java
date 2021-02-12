package Module03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Nivell01Module03 {
public static void main(String[] args){
	
	// Fase 01
	
	String ciutat01="";
	String ciutat02="";
	String ciutat03="";
	String ciutat04="";
	String ciutat05="";
	String ciutat06="";
	
	
	
	System.out.println("Introduce el nombre de seis ciudades: ");
	Scanner entrada=new Scanner(System.in);
		ciutat01=entrada.next();
		ciutat02=entrada.next();
		ciutat03=entrada.next();
		ciutat04=entrada.next();
		ciutat05=entrada.next();
		ciutat06=entrada.next();
		System.out.println();
	System.out.println("Resultado de la Fase 01: ");
		System.out.println();
	System.out.println(ciutat01+"\n"+ciutat02+"\n"+ciutat03+"\n"+ciutat04+"\n"+ciutat05+"\n"+ciutat06);
		System.out.println();
		entrada.close();
	
		
	// Fase 02. Creamos Array y lo ordenamos alfabéticamente.
			
		
	ArrayList<String> ciudades= new ArrayList<String>();
	
		ciudades.add(ciutat01);
		ciudades.add(ciutat02);
		ciudades.add(ciutat03);
		ciudades.add(ciutat04);
		ciudades.add(ciutat05);
		ciudades.add(ciutat06);
		
		
		// Ordeno alfabéticamente ArrayList
		
		Collections.sort(ciudades,String.CASE_INSENSITIVE_ORDER);	
		
		System.out.println("Resultado de la Fase 02: Ordenado alfabéticamente. ");
			System.out.println();
		for(String nuevo:ciudades) {
			
			System.out.print(nuevo+"\n");
			
		}System.out.println();
		
		
	// Fase 03 Cambiamos la letra 'a' por el número '4'.
			
		System.out.println("Resultado de la Fase 03: replace la 'a' por el '4'. ");
		String str = ciudades.toString().replaceAll("\\[|\\]", "").replaceAll(", ",", ").replace('a','4');
			System.out.println();
			System.out.println(str);
			
	// Almaceno el String en un nuevo Array.
			
			List<String> ciudades02 = new ArrayList<String>(); 
			ciudades02 = Arrays.asList(str);
			System.out.println("Nuevo Array:");
			System.out.println(ciudades02);
	
	// Fase 04	Creamos un Array de Caracteres del String y le damos la vuelta.
			
			System.out.println();
			System.out.println("Resultado de la Fase 04: nuevo Array y le damos la vuelta.");
			System.out.println();
			
			char [] ciu01=new char[ciutat01.length()];
			
			for (int i=0; i<ciutat01.length(); i++) {
			
				ciu01[i]=ciutat01.charAt(i);
				System.out.print(ciu01[i]);
						
			}System.out.println();
			
			
					// Cogemos el Array de Caracteres y le damos la vuelta
					
					char[]ciu01rev=new char[ciu01.length];
			
					for (int i=ciu01.length-1;i>=0;i--) {
				
						ciu01rev[i]=ciu01[i];
						System.out.print(ciu01rev[i]);
				
			}
		
					
		/*Arriba lo he hecho tal como lo pide el ejercicio, ahora lo haré de otra forma
		 * que he conseguido más directa, donde se crea el Array de Caracteres desde el
		 * String y le damos la vuelta con el mismo Bucle For. 
		 */
					System.out.println();
					System.out.println("Le damos la vuelta con un Bucle For:");
					char[]ciu02rev=new char[ciutat02.length()];
					
					for(int i=ciutat02.length()-1; i>=0;i--) {
						
						ciu02rev[i]=ciutat02.charAt(i);
						System.out.print(ciu02rev[i]);
											
					}
					System.out.println();
					char[]ciu03rev=new char[ciutat03.length()];
					for(int i=ciutat03.length()-1; i>=0;i--) {
						
						ciu03rev[i]=ciutat03.charAt(i);
						System.out.print(ciu03rev[i]);
					}
					System.out.println();
					char[]ciu04rev=new char[ciutat04.length()];
					
					for(int i=ciutat04.length()-1;i>=0;i--) {
						
						ciu04rev[i]=ciutat04.charAt(i);
						System.out.print(ciu04rev[i]);
											
					}
					System.out.println();
					char[]ciu05rev=new char[ciutat05.length()];
					
					for (int i=ciutat05.length()-1; i>=0; i--) {
						
						ciu05rev[i]=ciutat05.charAt(i);
						System.out.print(ciu05rev[i]);
												
					}
					System.out.println();
					char[]ciu06rev=new char[ciutat06.length()];
					
					for(int i=ciutat06.length()-1;i>=0; i--) {
						
						ciu06rev[i]=ciutat06.charAt(i);
						System.out.print(ciu06rev[i]);
					}
					
			        }
					
					
					
}







