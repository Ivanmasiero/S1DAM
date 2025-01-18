package ivan.primerosPasos;

import java.util.Scanner;

public class ActividadAñoBisiesto {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("introduce un año para combrobar si es bisiesto");
		
	    int year = sc.nextInt();
		boolean esCierto = false;
		
	/* Resolución del problema de la primera forma que se me ha ocurrido, es decir, utililizando
	   solo if y else y sin utilizar ninguna variable boolean */
	   
	 /*	
		if (year %4==0) {
			if (year %100 == 0) {
				if (year % 400 == 0) { System.out.println("el año " + year + " es bisiesto");
				}else { System.out.println("el año " + year + " no es bisiesto");}
			}else { System.out.println("el año " + year + " es bisiesto");}			
		}else {  System.out.println("el año " + year + "  no es bisiesto");
				
		} 
		
		/* Resolución del problema de la misma forma que la anterior pero utilizando variables boolean
		   para no tener que estar haciendo print en cada caso, es algo mas rápido y eficiente. */
		 
		/*
		if (year % 4 == 0){ 
		 
			if (year%100==0) {
				if(year%400==0) { esCierto = true;
				}else esCierto=false;
			}else esCierto=true;
		}else {esCierto=false;}
		
		if (esCierto==true) {System.out.println("el año " + year + " es bisiesto");
		}else {System.out.println("el año " + year + " no es bisiesto");
		
		} 
		
		 
		 /* Aqui hemos resuelto el problema asumiendo que es falso y solo escribimos los casos que 
		    que sean ciertos, en este proble no tiene mucho sentido ya que hay 2 falsos y 2 verdaderos
		    pero si tuviera 100 verdaderos y 2 falsos, asumiriamos que es verdadero y solo escribimos
		    los falsos, de esta forma no estariamos ahorrando mucho tiempo y muchas lineas de código.
		  */
		  
		  /*
		if (year%4==0) 
			if (year%100==0) 
				{if(year%400==0) esCierto = true;}
			else esCierto = true;
			
		
		if (esCierto==true) {System.out.println("el año " + year + " es bisiesto");
		}else {System.out.println("el año " + year + " no es bisiesto");}
	*/
		
		if ((year%4==0) && (year%100==0) && (year%400==0)) esCierto = true;
		if ((year%4==0) && !(year%100==0)) esCierto = true;
		
		if (esCierto==true) {System.out.println("el año " + year + " es bisiesto");
		}else {System.out.println("el año " + year + " no es bisiesto");}
		
		
		
		
		
	}}
		
		// TODO Auto-generated method stub

	


