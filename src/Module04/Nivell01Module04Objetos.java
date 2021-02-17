package Module04;
import java.util.Scanner;
public class Nivell01Module04Objetos {

	public static void main(String[] args) {
		
	MenuRest plato1=new MenuRest("Carrillada de cerdo Ibérico", 12);
	MenuRest plato2=new MenuRest("Verdura a la Plancha", 8);
	MenuRest plato3=new MenuRest("Gazpacho Manchego", 10);
	MenuRest plato4=new MenuRest("Paella",9);
	System.out.println(plato1.getPlatos());
	System.out.println(plato2.getPlatos());
	System.out.println(plato3.getPlatos());
	System.out.println(plato4.getPlatos());
	
		
	System.out.println("Escoje plato:");
	
	Scanner entrada=new Scanner(System.in);
	int numeromenu=entrada.nextInt();
	
	
	switch(numeromenu){
	
	case 1:
		System.out.println("Has escogido Carrillada con cerdo Ibérico.");
		break;
		
	case 2:
		System.out.println("Has escogido Verdura a la Plancha.");
		break;
		
	case 3:
		System.out.println("Has escogido Gazpacho Manchego.");
		break;
		
	case 4:
		System.out.println("Has escogido Paella.");
		break;
		
		
	default:
		System.out.println("No has escogido nada.");
	}
	
	
	
	}	
	
}

class MenuRest{
	
	public MenuRest(String carta, int precio) {
		
		this.carta=carta;
		this.precio=precio;
		Id=IdSiguiente;
		IdSiguiente++;
			
	}
	public String getPlatos() {
		
		return "El plato número " +Id+ " es " +carta+ " y cuesta " +precio+ " euros.";
	}
		
	private String carta;
	private int precio;
	private int Id;
	private static int IdSiguiente=1;
		
}
