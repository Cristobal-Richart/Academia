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
		
		
	
	
	
	
	

	ArrayList<Integer> pedido= new ArrayList<Integer>();
	
	
	int numeroplato = 0;
	int salir=9;
	System.out.println();
	System.out.println("¿Que desea pedir para comer?, pulse 9 para salir del menú.");
	while(numeroplato!=salir) {
		
		Scanner entrada=new Scanner (System.in);
		numeroplato=entrada.nextInt();
		pedido.add(numeroplato);
		if(numeroplato==1) {
			System.out.println("Has escogido Carrillada de cerdo Ibérico.");
			System.out.println("¿Deseas algo más?");
			
		}else if(numeroplato==2) {
			System.out.println("Has escogido Verduras a la Plancha.");
			System.out.println("¿Deseas algo más?");
		}
		else if(numeroplato==3) {
			System.out.println("Has escogido Gazpacho Manchego.");
			System.out.println("¿Deseas algo más?");
		}
		else if(numeroplato==4) {
			System.out.println("Has escogido Paella.");
			System.out.println("¿Deseas algo más?");
		}
				
		else System.out.println("La comanda ha sido pasada a cocina, Gracias.");
		System.out.println();
	}
	
	for (int i=0; i<pedido.size();i++) {
		
		if(i==1) System.out.println(plato[0]+" "+precio[0]);
		if(i==2) System.out.println(plato[1]+" "+precio[1]);
		if(i==3) System.out.println(plato[2]+" "+precio[2]);
		if(i==4) System.out.println(plato[3]+" "+precio[3]);
		
		
		
	}
	int []suma=new int [precioplato.size()];
	for (int i=0; i<precioplato.size();i++) {
		suma[i]=precioplato(i);
		System.out.println(i);
		
	}
	
	
	
	
	
		
	
	
	System.out.println("Pase por caja y difrute de su menu.");
}

private static int precioplato(int i) {
	// TODO Auto-generated method stub
	return 0;
}

private static int pedido(int i) {
	// TODO Auto-generated method stub
	return 0;
}

}
