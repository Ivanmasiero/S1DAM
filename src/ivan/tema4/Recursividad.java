package ivan.tema4;

import java.math.BigInteger;

//Sólo vamos a dar unas pequeñas pinceladas sobre recursividad
//un estudio profundo daría para meses, es una funcionalidad muy potente
//En esta ocasión implementamos la definición inductiva del factorial 
//Si devolvemos int sólo llegaremos a n=13


public class Recursividad {
	// Devolviendo long llegamos a n=20
	// Plantéate cómo llegar a n=100 (son 158 dígitos)
	/*private static BigInteger factorial(int n) {
		// caso trivial
		BigInteger prueba=BigInteger.valueOf(n).multiply(factorial(n-1));
		if (n==0) return BigInteger.ONE;
		else return BigInteger.valueOf(n).multiply(factorial(n-1));
	}*/
	private static long factorial(int n) {
		// caso trivial
		if (n==0) return 1;
		else return n*(factorial(n-1));
	}

 
	public static void main(String[] args) {
		// Datos de entrada
		int n=5;
		// Procesamiento
		long a=factorial(n);
        System.out.println(a);
		/*BigInteger res=factorial(n);
		System.out.printf("EL factorial de %d es %d \n",n,res);
		*/
		
	}

}
