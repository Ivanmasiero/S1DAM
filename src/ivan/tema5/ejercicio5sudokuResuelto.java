package ivan.tema5;

import java.util.Arrays;
import java.util.Random;

public class ejercicio5sudokuResuelto {
    private static int numAle(int n, int m){
        Random r=new Random();

        int random=r.nextInt(n-m+1)+m;
        return random;
    }
    private static void cargaAleatorio(int sudoku[][],int it) {
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
            }   while (!flag);
            sudoku[posi][posj]=valor;
        }
    }
    public static void main(String []args){
        int sudoku[][]=new int[3][3];
        cargaAleatorio(sudoku,9);
        System.out.println(Arrays.deepToString(sudoku));

    }
}
