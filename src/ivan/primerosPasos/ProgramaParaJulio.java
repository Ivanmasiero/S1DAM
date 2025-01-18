package ivan.primerosPasos;

import java.util.Locale;
import java.util.Scanner;
public class ProgramaParaJulio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduce el diametro");
		double diametro = sc.nextDouble();
		double seccion = diametro/ 2.0 * Math.PI * Math.PI;
		
		System.out.println("la seccion es " + seccion);
}
}