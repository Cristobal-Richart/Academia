package itacademy.barcelonactiva.cat.masterclass01.exemple01;

public class CadenaDeText {
public static void main(String[] args) {
	
		int encontrar;
	
		String texto= "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";
		
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
