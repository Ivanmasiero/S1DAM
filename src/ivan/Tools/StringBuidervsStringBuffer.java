package ivan.Tools;

//Los string aunque son objetos, son un poco tontos, para remediarlo y poder hacer cosa chulas con ellos tenemos StringBuilder y StringBuffer
//El StringBuilder es mas eficiente pero no tiene Safe thread (el que usaremos este año) en cambio el StrinBuffer es menos eficiente pero
//pero tiene safe thread(lo usaremos en segundo)

public class StringBuidervsStringBuffer {

	public static void main(String[] args) {
		//Es impportante saber que cuando tengo un String y le añadimos cosas como un char, estamos creando un nuevo String, encontces si,
		//hacemos un programa que añada mil veces una letra al final de nuestro String estaremos creando 1000 objetos tipo Strings
		//mas el original.
		
		//Para juguetear con el String sin tener que crear otros objetos declaramos un StringBuilder
		
		StringBuilder cadenaSb=new StringBuilder("Ivan");
		System.out.printf("holaa soy %s", cadenaSb);
		
		cadenaSb.append('s');
		System.out.printf("%nle hemos añadido una s -> %s", cadenaSb);
		
		cadenaSb.insert(2, "a");
		System.out.printf("%nhemos añadido una a en la segunda posicion -> %s", cadenaSb);
		
		cadenaSb.insert(0,"ii");
		System.out.printf("%nhemos añadido ii al principio de la cadena -> %s", cadenaSb);
		
		cadenaSb.setCharAt(5,'n');
		System.out.printf("%nhemos cambiado la ultima s por una n -> %s",cadenaSb);
		
		cadenaSb.setLength(cadenaSb.length()-2);
		System.out.printf("%nhemos quitado los ultimos 2 caracteres de la cadena-> %s", cadenaSb);
		
		cadenaSb.delete(0, 2);
		System.out.printf("%nhemos quitado los dos primeros caracteres de la cadena -> %s", cadenaSb);
		
		cadenaSb.reverse();
		System.out.printf("%nhemos dao la vuelta a la cadena -> %s", cadenaSb);
		cadenaSb.reverse();
		
		cadenaSb.toString();
		System.out.printf("%nAhora tenemos un String comun y corriente -> %s",cadenaSb);
		
		
		
		
		
		
		
	} 

}
