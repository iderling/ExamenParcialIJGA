package IDE;

import java.util.Scanner;

import Main.MenuP;

public class convertidor2 {
	 

	private static Scanner leer;

	public static void main(String[]args) {
		
		leer = new Scanner (System.in);
		double kilobytes;
		double mb; 
		
		
		System.out.println(" Digite la cantidad de kiloBytes a convertir ");
		kilobytes = leer.nextInt();
		
		mb = (int) (kilobytes / 1024) ;
	
		System.out.println(kilobytes+" Kilobytes gual a "+mb+" Megabytes");
		
		System.out.println("\n");
		MenuP.main(args);
	}

}
