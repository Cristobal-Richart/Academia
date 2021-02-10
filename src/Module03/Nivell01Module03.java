package Module03;
import java.util.Scanner;
public class Nivell01Module03 {
public static void main(String[] args){
	
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
		
	System.out.println(ciutat01+"\n"+ciutat02+"\n"+ciutat03+"\n"+ciutat04+"\n"+ciutat05+"\n"+ciutat06);
		
		entrada.close();
}

}
