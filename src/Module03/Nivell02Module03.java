package Module03;
import java.util.Scanner;
public class Nivell02Module03 {
public static void main(String[] args) {
	
	Scanner entrada=new Scanner(System.in);
	
	
	int [][]notantonio=new int[1][3];
	
	notantonio[0][0]=6;
	notantonio[0][1]=8;
	notantonio[0][2]=7;
	
	for (int i=0; i<notantonio.length; i++) {
		
		for(int j=0; j<3; j++) {
			
			System.out.println("Rellena la nota:");
				notantonio[i][j]=entrada.nextInt();
				
				System.out.println(notantonio[i][j]);
				
		}
		System.out.println("La nota media de Antonio es: "+(notantonio[0][0]+notantonio[0][2]+notantonio[0][2])/2);
		
		
	}
	
}	
}
