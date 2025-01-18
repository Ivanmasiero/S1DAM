package ivan.tema5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ejercio4sudokuAleatorio {
    public static int MAX = 3;
    private static boolean comprobarnum(int sudoku[][]) {
        boolean comprobarnum = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[i][j] > 9 || sudoku[i][j] < 1) {
                    return comprobarnum = false;
                }
            }
        }
        return comprobarnum = true;
    }
    private static boolean comprobar(int sudoku[][]) {
        int contador = 0;
        boolean comprobar = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                contador += sudoku[i][j];
            }
        }
        if (contador == 45)
            return comprobar = true;
        else
            return comprobar = false;
    }
    private static void carga(int sudoku[][], Scanner sc) {
        boolean comprobacion = false;
        do {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (sudoku[i][j] == 0) {
                        System.out.println("introduce el valor para la posicion: " + "[" + (i + 1) + "," + (j + 1) + "]");
                        sudoku[i][j] = sc.nextInt();
                    }
                }
            }
            comprobacion = comprobarnum(sudoku);
            if (comprobacion == false)
                System.out.println("te has equivocado en algún número, vuelve a intentar");

        } while (comprobacion == false);
        sc.close();

    }

    private static int numAle(int n, int m) {
        Random r = new Random();

        int random = r.nextInt(n - m + 1) + m;
        return random;
    }

    private static void cargaAleatorio(int sudoku[][], int it) {
        int valor = 0;
        int posi = 0;
        int posj = 0;
        boolean flag = false;
        for (int a = 0; a < it; a++) {
            do {
                flag = true;
                valor = numAle(9, 1);
                posi = numAle(2, 0);
                posj = numAle(2, 0);
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (valor == sudoku[i][j])
                            flag = false;
                        if (sudoku[posi][posj] != 0)
                            flag = false;
                    }
                }
            } while (!flag);
            sudoku[posi][posj] = valor;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int it=0;
            System.out.println("Cuantos huecos deseas rellenar?");
                do {
                    it = sc.nextInt();
                    if (it < 1 || it > 9)
                        System.out.println("por favor mete un numero entre 1 y 9");
                } while (it < 1 || it > 9);

            int sudoku[][] = new int[3][3];
            cargaAleatorio(sudoku,it);
            System.out.println("El resultado es el siguiente:");
            System.out.println(Arrays.deepToString(sudoku));
            carga(sudoku, sc); //modificar para que no sobreescribir en las posiciones que se han generado numeros
            boolean correcto = comprobar(sudoku);
            if (correcto)
                System.out.println("Es correcto!");
            else
                System.out.println("Es incorrecto!");
        }
    }