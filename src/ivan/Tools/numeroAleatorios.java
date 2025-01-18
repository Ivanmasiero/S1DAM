package ivan.Tools;
import java.util.Random;
// Vamos a aprender a utilizar numeros aleatorios para ello necesitamos vamos a utilizar Math.random y Random

public class numeroAleatorios {

	public static void main(String[] args) {

	//Primero usaremos Math.random
		/*
		double a = Math.random(); //Esto generara un numero aleatorio entre 0.0 y 1.0
		System.out.println("numero aleatorio entre 0 y 1: " +a); 
		
		double b = Math.random()*10; // Esto generara un numero aleatorio entre 0 y 10
		System.out.println("Numero aleatorio entre 0 y 10: " + b);
		
		System.out.println("Lo aproximamos hacia abajo sin decimales pero double: " + Math.floor(b));
		
		System.out.println("Lo aproximamos hacia abajo pero entero: " + (int) b);
		// Entre 1 y 10
		//Para hacerlo desde un numero hasta otro solo debemos sumar ese numero aleatorio el primer rango (5) el math.random lo 
		//multiplicaremos por el rango maximo como antes. Entonces al utilizar el math.floor el numero nunca podra llegar al rango
		//final porque se ira hacia abajo.
		double c =Math.random()*10;
		c = Math.floor(c) + 1;
		System.out.println("Numero aleatorio entre 1 y 10: " + (int)c);
		
		//ahora lo haremos utilizando variables de valor maximo(n) y valor minimo (m)
		
		//aqui son todos los pasos necesarios para hacer numero aleatorio en un rango
		int n=50;
		int m=5;
		
		double random = Math.random()*(n-m+1);
		random = Math.floor(random);
		random = random+m;
		System.out.println("Numero aleatorio entre 5 y 50: " + (int)random );
		
		int random2=(int) Math.floor(Math.random()*(n-m))+m;
		System.out.println("numero aleatorio con los mismos parametros utilizando una sola formula " + random2);
		
		*/
		//Ahora lo haremos con la clase random, para ello la tenemos que importar: import java.util.Random;
		
		Random r= new Random();
		
		int random =r.nextInt();
		System.out.println("numero aleatorio con la clase random: " + random);
		
		//Ahora le pondremos parametros
		int n=9;
		int m=4;
		int random2=r.nextInt(n-m+1)+m;
		System.out.println("numero aleatorio entre 4 y 9: "+random2);
	}
	


}
