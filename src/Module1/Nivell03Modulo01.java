package Module1;
import java.util.Scanner;
public class Nivell03Modulo01 {
public static void main(String [] args) {
	
	int [] array=new int [10];
	System.out.println("Introduce un número diez veces");
	Scanner entrada=new Scanner(System.in);
	
	for(int i=0; i<=9; i++){
		System.out.print(i + " Escribe un número:");
		array[i]=entrada.nextInt();
	}
	
	int numero9= array [9];
	
	for(int i=8; i>=0; i--) {
		array[i+1]=array[i];
	}
	
	array [0]=numero9;
	
	for(int i = 0; i<=9; i++) {
		
		System.out.println(i + " La rotación queda así: " + array[i]);
	}
	
}
}
