package ivan.pruebas;
import java.util.Scanner;

public class Ejercicio2_599238 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numTotal=0;
		int numDado=0;
		System.out.println("dame 4 numeros");
		
		for(int i=0;i<4;i++) {
			numDado=sc.nextInt();
			if (numDado%2==0) 
				numTotal+=numDado;
			else
				numTotal-=numDado;
		}
		System.out.println("El resultado es: "+numTotal);
		
		
		
		

	}

}
