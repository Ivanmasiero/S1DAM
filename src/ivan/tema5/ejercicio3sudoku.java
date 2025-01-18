package ivan.tema5;
import java.util.Scanner;
public class ejercicio3sudoku {
    private static boolean comprobarnum(int sudoku[][]){
        boolean comprobarnum=false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sudoku[i][j]>9||sudoku[i][j]<1){
                    return comprobarnum=false;
                }
            }
        }
        return comprobarnum=true;
    }
    private static boolean comprobar(int sudoku[][]){
        int contador=0;
        boolean comprobar=false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                contador+=sudoku[i][j];
            }
        }
        if(contador==45)
            return comprobar=true;
        else
            return comprobar=false;
    }
    private static void carga(int sudoku[][],Scanner sc) {
        boolean comprobacion = false;
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("introduce el valor para la posicion: " + "[" + (i + 1) + "," + (j + 1) + "]");
                    sudoku[i][j] = sc.nextInt();
                }
            }
            comprobacion = comprobarnum(sudoku);
            if (comprobacion == false)
                System.out.println("te has equivocado en algún número, vuelve a intentar");

        } while (comprobacion == false);
        sc.close();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sudoku[][]=new int[3][3];
        carga(sudoku,sc);
        boolean correcto=comprobar(sudoku);
        if(correcto)
            System.out.println("Es correcto!");
        else
            System.out.println("Es incorrecto!");
    }
}
