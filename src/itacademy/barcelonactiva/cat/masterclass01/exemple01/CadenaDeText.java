package itacademy.barcelonactiva.cat.masterclass01.exemple01;

public class CadenaDeText {
public static void main(String[] args) {
	
		int encontrar;
	
		String texto= "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que viv�a un hidalgo de los de lanza en astillero, adarga antigua, roc�n flaco y galgo corredor. Una olla de algo m�s vaca que carnero, salpic�n las m�s noches, duelos y quebrantos los s�bados, lantejas los viernes, alg�n palomino de a�adidura los domingos, consum�an las tres partes de su hacienda. El resto della conclu�an sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los d�as de entresemana se honraba con su vellor� de lo m�s fino. Ten�a en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que as� ensillaba el roc�n como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta a�os; era de complexi�n recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que ten�a el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas veros�miles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narraci�n d�l no se salga un punto de la verdad.";
		
		encontrar=texto.indexOf("acordarme");
		System.out.println(encontrar);
		
		
		
		
		int posicion=0;
		int nombraocurrencias=0;
		while(posicion != -1) {
			posicion=texto.indexOf("de", posicion);
			
			if(posicion != -1) {
			System.out.println(posicion);
			posicion++;
			nombraocurrencias++;
			}
			
		}
		System.out.println("Estas son las ocurrencias " + nombraocurrencias);
		
		System.out.println("----------------------------------------");
		
		int ulimaposicion=texto.lastIndexOf("de");
		
		
		
	}

}
