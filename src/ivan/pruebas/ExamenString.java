package ivan.pruebas;

import java.util.Scanner;

public class ExamenString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.printf("Introduce una cadena de caracteres");
		StringBuilder cadena=new StringBuilder(sc.nextLine());
		int valor=0;
		for(int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)=='0') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsPar>");
			}
			if (cadena.charAt(i)=='1') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsImpar>");
			}
			if (cadena.charAt(i)=='2') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsPar>");
			}
			if (cadena.charAt(i)=='3') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsImpar>");
			}
			if (cadena.charAt(i)=='4') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsPar>");
			}
			if (cadena.charAt(i)=='5') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsImpar>");
			}
			if (cadena.charAt(i)=='6') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsPar>");
			}
			if (cadena.charAt(i)=='7') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsImpar>");
			}
			if (cadena.charAt(i)=='8') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsPar>");
			}
			if (cadena.charAt(i)=='9') {
				cadena.delete(i,i+1);
				cadena.insert(i,"<EsImpar>");
			}
			
			
			
		}
			
			System.out.printf("%s", cadena);
			*/
		int valor=0;
		StringBuilder cad=new StringBuilder("AA4SD3YY0");
		for (int i=0;i<cad.length();i++) {
			if(Character.isDigit(cad.charAt(i))) {
				valor=cad.charAt(i)-'0';
				if(valor%2==0) {
					cad.delete(i,i+1);
					cad.insert(i,"<Es Par>");
				}
				else {
					cad.delete(i,i+1);
					cad.insert(i,"<Es Impar>");
			
				}
			}
		

		}
		cad.toString();
		System.out.printf("%s",cad);
	
	}
}
