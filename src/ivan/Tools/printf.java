package ivan.Tools;

public class printf {

	public static void main(String[] args) {
		/* El comando printf en Java se utiliza para imprimir texto formateado en la salida, similar a cómo se usa en 
		 * lenguajes como C. Este comando permite incluir variables en una cadena de texto y especificar su formato,
		 * como el número de decimales, el ancho de campo, la alineación, y mucho más.
		 * La la estructura es: Sytem.out.print("texto con formato",argumentos);
		 * En el texto con formato vas escribiendo lo que quieres que salga como en un print normal y vas metiendo los 
		 * formatos en el sitio que quieras
		 * Los formatos son:
		 * %d para entero
		 * %f para decimales
		 * %s para string
		 * %\n para salto de linea
		 */
		int edad=20;
		double altura =1.80;
		String nombre="Juan";
		
		System.out.printf("Nombre:%s, Altura:%.2f, Años:%d %n",nombre,altura,edad);
		
		/* podemos especificar el formato como cuantos decimales queremos que salgan, la alineación, el ancho de campo.
		 * Para  poner un numero decimal con los decimales que queramos por ejemplo 2, se pondria %.2f 
		 */
		double num=2.2345/2;
		
		System.out.printf("Con 4 decimales: %.4f %nCon tres decimales %.3f %nCon dos decimales %.2f%n", num,num,num);
		
		/*Para alinearlo a la izq utilizazaremos %-x   y    a la derecha  %x
		 * Sustituyendo x por el numero de caracteres que reserva
		 */
		String nombre2="Alfonso";
		int edad2=100;
		double altura2=1.993;
		
		String nombre3="Carlos";
		int edad3=3;
		double altura3=1.6723;
		
	
	
		System.out.printf("%-10s %10s %10s%n","Nombre","Altura","Edad");
		System.out.printf("%-10s %10.2f %10d%n",nombre,altura,edad);
		System.out.printf("%-10s %10.2f %10d%n",nombre2,altura2,edad2);
		System.out.printf("%-10s %10.2f %10d%n",nombre3,altura3,edad3);

	}

}
