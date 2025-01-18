package ivan.pruebas;

import java.util.Scanner;

public class ExamenFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("introduce el valor de n");
		int n=sc.nextInt();
		int valorNum=2; //deberia haber empezadp en 2 y no en 0
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.printf("=");
				
			}
			for (int j=0;j<(2*i)+1;j++) {
				System.out.printf("%03d-", valorNum);//aqui tenia que poner %03d ya que pide 2 ceros
				valorNum+=2;
				
			}
			valorNum=2; //en el examen se me a olvidado restablecer el contador de valor Num
			System.out.printf("%n");
		}

	}

}
