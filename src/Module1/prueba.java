package Module1;

public class Nivell01Fase03 {
public static void main(String[] args) {
	
	int i=1948;
	boolean valido =true;
	String cierto="Any de traspàs";
	String nocierto="No any de traspàs";
	
	
	for (i=1948; i<=1976; i+=4) { 
		
	System.out.println(cierto + " " + i);	
		
	}
	
	
	System.out.println("Finito");
	
}
}

boolean valido =false;
double any_traspas=4;
	
do {
	int any=1948;
	int naixement=1975;
	
	String cierto="Any de traspàs";
	String nocierto="No any de traspàs";

for (int i=1948; i<=1976; i+=4) { 
	
	
	if(i==naixement) valido=true; 
		
	}if (valido=true) System.out.println(cierto);
	else System.out.println(nocierto);
	

	

	
}while(valido==false);


System.out.println("Finito");
