package ivan.tema5;
import java.util.Arrays;
import java.util.Scanner;
/*Leer y almacenar n números enteros en una tabla, a partir de la que se construirán otras
dos tablas con los elementos con valores pares e impares de la primera, respectivamen-
te. Las tablas pares e impares deben mostrarse ordenadas.*/


public class ejercicioLirbo {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("cuantos numeros quieres meter");
        int cuantos=sc.nextInt();
        int numeros[]=new int[cuantos];

        int posA=0;
        int posB=0;
        for(int i=0;i< numeros.length;i++){
            System.out.println("ingresa el numero " + (i+1));
            numeros[i]=sc.nextInt();
        }
        int pares[]=new int[cuantosPares(numeros)];
        int impares[]=new int[numeros.length-cuantosPares(numeros)];

        for(int i=0;i<numeros.length;i++) {
            if (numeros[i] % 2 == 0) {
                pares[posA] = numeros[i];
                posA++;
            } else {
                impares[posB] = numeros[i];
                posB++;
            }
        }

        Arrays.sort(pares);
        Arrays.sort(impares);
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));

    }

    private static int cuantosPares(int nums[]){
        int cuantos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                cuantos++;
            }
        }
        return cuantos;


    }


}
