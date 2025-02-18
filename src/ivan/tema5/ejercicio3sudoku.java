package ivan.tema5;
import java.util.Scanner;
public class ejercicio3sudoku {
    private final static int MAX=3;

    public static void main(String[] args) {
        int sudoku[][]=new int [3][3];
        int valores[]=new int[3];
        boolean correcto=true;
        for(int i=0;i<MAX*MAX;i++){
            muestra(sudoku);
            valores=pregunta(sudoku);
            correcto=comprueba(sudoku,valores[2]);
            if(!correcto)
                break;
            coloca(sudoku,valores);
        }
        if (correcto) {
            muestra(sudoku);
            System.out.println("Felicidades es correcto");
        }
        else
            System.out.println("Has fallado");
    }

    private static void muestra(int sudoku[][]){
        for(int i=0;i<MAX;i++){
            System.out.print("[ ");
            for(int j=0;j<MAX;j++)
                System.out.print(sudoku[i][j]+" ");
            System.out.println("]");
        }
    }
    private static int[] pregunta(int sudoku[][]){
        int pos[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.printf("Dime la posicion de Fila");
        pos[0]= sc.nextInt()-1;
        System.out.printf("Dime la posicion de Columna");
        pos[1]= sc.nextInt()-1;
        System.out.printf("Dime el número que quieres ingresar");
        pos[2]=sc.nextInt();

        return pos;
    }
    private static void coloca(int sudoku[][],int valores[]){
        int fila,col,valor;
        fila=valores[0];
        col=valores[1];
        valor=valores[2];
        sudoku[fila][col]=valor;
    }

    private static boolean comprueba(int sudoku[][], int valor) {
        boolean correcto = true;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (sudoku[i][j] == valor) {
                    return correcto = false;
                }
            }
        }
        return correcto = true;


    }
}
