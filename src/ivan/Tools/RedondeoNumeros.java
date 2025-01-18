package ivan.Tools;
/*Vamos a ver la diferencias que hay entre aproximar los numeros de un decimal a un entero, en concreto entre usar
 *  int y Math.floor.
 *  Siempre redondeareos a la baja, aunque por el metodo int no es del todo cierto
 *  Por el metodo int quitaremos siempre decimal, es decir, si el numero es positivo sera a la baja pero si es negativo
 *  sera alrrevés.
 *  En cambio si utilizamos math.floor siempre sera a la baja sin importar si es positivo o negativo.
 */
public class RedondeoNumeros {

	public static void main(String[] args) {
		//Los dos aproximan hacia abajo, quitan la parte decimal
		
		System.out.println("Aproximaciones método int y math.floor con positivos");
		
		double d=2.34;
		
		int i=(int)d;//Aqui convertimps el double en int
		System.out.println(i);
		
		double fd=Math.floor(d);//Aqui aproximamos el numero siempre a la baja	
		System.out.println(fd);
		
		System.out.println((int)fd); // Si lo queremos convertir en entero
		
		System.out.println("Aproximaciones método int y math.floor con negativos");
		
		
		//EJEMPLO CON NEGATIVOS, AQUI SE VE LA DIFERENCIA
		double a=-3.30;
		
		int aEnt=(int)a;
		System.out.println(aEnt);
		
		double aDoub = Math.floor(a);
		System.out.println(aDoub);
		
		int aConv2=(int)aDoub;
		System.out.println(aConv2);
		
		//Aqui vamos a ver el metodo para redondearlo siempre para arriba tanto negativo como positivo
		//en concreto utilizaremos math.ceil
		// Esto lo redondeara siempre arriba pero si lo queremos pasar a entero debemos utilizar (int)
		System.out.println("Aproximación al alza");
		
		double q = 4.2;
		
		double qConv=Math.ceil(q);
		System.out.println(qConv);
		
		System.out.println((int)Math.ceil(q)); 
		
		
		
		
		

	}

}
