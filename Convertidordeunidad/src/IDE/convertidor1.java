package IDE;

import java.util.Scanner;

import Main.MenuP;

public class convertidor1 {
	
	private static Scanner leer;

	public static void main (String[]args) {
		
		leer = new Scanner (System.in);
		double bytes ;
		double kb  ;
	
	
		
		System.out.println(" Digite la cantidad de Bytes a convertir ");
		bytes = leer.nextInt();
		
		kb= bytes / 1000;
		
		System.out.println(bytes+" bytes es igual a "+kb+" kilobytes");
		
		System.out.println("\n");
		MenuP.main(args);
		
	}

}
