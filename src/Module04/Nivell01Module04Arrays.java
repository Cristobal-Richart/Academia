package Module04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Nivell01Module04Arrays {
public static void main(String[] args) {
	
	int cinco= 5;
	int diez=10;
	int veinte=20;
	int cincuenta=50;
	int cien=100;
	int doscientos=200;
	int quinientos=500;
	
	
	
	
	
	String [] plato={"Carrillada de cerdo Ibérico,", "Verduras a la plancha,", "Gazpacho Manchego,", "Paella," };
		
	ArrayList<String> menu=new ArrayList<String>();
	
	for (String menu1: plato) {
		menu.add(menu1);
	}
	
			
	int []precio= {10,8,6,5};
		
	ArrayList<Integer> precioplato=new ArrayList<Integer>();
	
	for (int nuevopre:precio ) {
		
		precioplato.add(nuevopre);
	}
	
	
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
		
		
	
	
	System.out.println();System.out.println("¿Que desea comer?");
	

	
	
}
}
