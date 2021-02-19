package Module04;
import java.util.*;
public class Nivell01Module04Arrays {
public static void main(String[] args) {
	
	int cinco= 5;
	int diez=10;
	int veinte=20;
	int cincuenta=50;
	int cien=100;
	int doscientos=200;
	int quinientos=500;
	
	
	
	// Creo Array de los platos y relleno con Bucle For Each.
	
	String [] plato={"Carrillada de cerdo Ibérico,", "Verduras a la plancha,", "Gazpacho Manchego,", "Paella," };
		
	ArrayList<String> menu=new ArrayList<String>();
	
	for (String nuevomenu: plato) {
		menu.add(nuevomenu);
		
	}
	
	// Creo un Array de precios y relleno con Bucle For each.
	
	int []precio= {10,8,6,5};
		
	ArrayList<Integer> precioplato=new ArrayList<Integer>();
	
	for (int nuevopre:precio ) {
		
		precioplato.add(nuevopre);
		
	}
	
	// Creo Iterator para mostrar en pantalla los platos ordenados por numero, con su precio.
	
	int[]contador= {1,2,3,4};
	ArrayList<Integer> contadorplatos=new ArrayList<Integer>();
	for(int nuevoconta:contador) {
		contadorplatos.add(nuevoconta);
	}
	Iterator<Integer> ITcontador=contadorplatos.iterator();
	Iterator<String> ITmenu=menu.iterator();
	Iterator<Integer> ITprecio=precioplato.iterator();
		
	while(ITmenu.hasNext())	{
				
		System.out.println(ITcontador.next()+ " "+ITmenu.next()+" cuesta " +ITprecio.next()+ " euros.");
	}
		
	/* Creamos el Array "pagar" para guardar los precios de los platos escogidos.
	 * Rellenamos el Array "pedido" y "pagar" de forma automática con un Bucle Do-While y un If anidado.
	 */

	ArrayList<Integer> pedido= new ArrayList<Integer>();
	ArrayList<Integer> pagar=new ArrayList<Integer>();
		
	int numeroplato = 0;
	System.out.println();
	System.out.println("¿Que desea pedir para comer?, pulse 0 para salir del menú.");
	do {
		Scanner entrada=new Scanner (System.in);
		numeroplato=entrada.nextInt();
		pedido.add(numeroplato);
		if(numeroplato==1) {
			System.out.println("Has escogido Carrillada de cerdo Ibérico, son " +precio[0]+ " euros.");
			System.out.println("¿Deseas algo más?");
			pagar.add(10);
			
		}else if(numeroplato==2) {
			System.out.println("Has escogido Verduras a la Plancha, son "+precio[1]+ " euros.");
			System.out.println("¿Deseas algo más?");
			pagar.add(8);
		}
		else if(numeroplato==3) {
			System.out.println("Has escogido Gazpacho Manchego, son " +precio[2]+ " euros.");
			System.out.println("¿Deseas algo más?");
			pagar.add(6);
		}
		else if(numeroplato==4) {
			System.out.println("Has escogido Paella, son " +precio[3]+ " euros.");
			System.out.println("¿Deseas algo más?");
			pagar.add(5);
		}
				
		else System.out.println("La comanda ha sido pasada a cocina, Gracias.");
		System.out.println();
	}while(numeroplato != 0);
	
	// Creamos Bucle For Each para sumar el precio total del menú.
	
	int suma=0;
	for (Integer nuevo: pagar) {
		suma=suma+nuevo;		
	}
	System.out.println("El precio total del menú es de: " +suma+ " euros.");
		
	
	System.out.println();
	System.out.println("Pase por caja y difrute de su menú.");
}

}

