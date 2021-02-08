package Module02;

import java.util.ArrayList;
import java.util.List;

public class NIvell01 {
public static void main(String[] args) {
	
	String nom="Cristobal";
	char[] nombre= nom.toCharArray();
	
	List<Character> nombrefinal=new ArrayList<Character>();
	
	for (char nombreMaster: nombre) {
		
		nombrefinal.add(nombreMaster);
		System.out.print(nombreMaster+" ");
		
		
}System.out.println();
	
for (Character nombreMaster:nombre) {
		
		if(nombreMaster.equals('a')||nombreMaster.equals('e')||nombreMaster.equals('i')||nombreMaster.equals('o')||nombreMaster.equals('u'))System.out.println(nombreMaster + " es una vocal ");
	
}




}	
}