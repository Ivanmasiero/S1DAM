package ivan.tema5;

import tools.NumerosAleatoriosConMath;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio511 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        System.out.println("Dime la longitud");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            sb.append(ale(5,1));
        }
        boolean acertado=false;
        do {
            System.out.println("Dime tu la combinación");
            int combi=sc.nextInt();
            StringBuilder comb=new StringBuilder(Integer.toString(combi));
            for (int i=0;i<sb.length();i++) {
                if (sb.compareTo(comb)==0) {
                    System.out.println("Felicidades has acertado, la combinacion es -> " + comb);
                    acertado = true;
                    break;
                }
                if (sb.charAt(i) == comb.charAt(i))
                System.out.println("Posicion " + (i + 1) + "es correcto");
                if  (sb.charAt(i) > comb.charAt(i))
                System.out.println("Posicion " + (i + 1) + " es menor");
                if (sb.charAt(i) < comb.charAt(i))
                System.out.println("Posicion " + (i + 1) + " es mayor");

                }

        }while (!acertado);

    }
    public static int ale(int n, int m){
        Random r=new Random();
        return (r.nextInt((n-m+1)+n));
    }

}