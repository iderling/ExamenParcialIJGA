package Main;

import java.util.Scanner;

import IDE.convertidor1;
import IDE.convertidor2;

public class MenuP {

	private static Scanner leer;

	public static void main(String[]args) {
		
	  leer = new Scanner(System.in);
			  
	          int opc;
	          
	          System.out.println("Menu Principal\n1. Convertir Bytes a Kilobytes \n2. Convertir kiobytes a megabytes \n3. Salir");
		      opc = leer.nextInt();
		      
		      switch(opc) {
		      case 1:
		    	  convertidor1.main(args);
		    	  break;
		    	  
		      case 2:
		    	  convertidor2.main(args);
		    	  break;
		    	  
		      case 3:
		    	  System.exit(0);
		    	  default:
		    	  break;
		      }
		
	}
	
	
}
