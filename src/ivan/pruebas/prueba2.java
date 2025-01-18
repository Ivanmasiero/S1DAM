package ivan.pruebas;
import java.util.Random;

import java.util.Arrays;

import java.util.Scanner;

public class prueba2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numA[]= {50,20,5,4};
	
	System.out.println("introduce 4 numeros, cada vez que metas un numero darle a intro");
	boolean flag=true;
	for(int i=0;i<4;i++) {
		
		if(numA[i]==sc.nextInt())
			flag=true;
		else { 
			System.out.println("Has fallado");
			flag=false;
			break;
		}
			
	}
	if(flag)
	System.out.println("has acertado");
		
		  
		
		

	}
	
}
	
