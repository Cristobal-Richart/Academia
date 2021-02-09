package Module02;
import java.util.Scanner;
public class Nivell2EjercicioAsteriscos {
public static void main(String[] args) {
		p1(); //Aquí hare el ejercicio de la media pirámide de números.
		p2(); //Aquí haré la pirámide invertida de asteriscos.
}		
private static void p1(){
	
	int numeros=5;
	
	for (int i=0; i<numeros; i++) {
		
		for(int j=numeros+i; j>=5; j--) {
			System.out.print((i-j)+6);
		
		}System.out.println("");
	}
}

private static void p2() {
	
	System.out.println("Introduce un valor:");
	Scanner entrada=new Scanner(System.in);
	int asterisco=entrada.nextInt();
	
	for(int i=0; i<asterisco; i++) {
		for (int j=asterisco-i; j>0; j--) {
			System.out.print(" ");
		}
		for (int j=0; j<i; j++) {
			System.out.print(" *");
		}
		System.out.println("");
	}
	
	entrada.close();
	
	
}

}
