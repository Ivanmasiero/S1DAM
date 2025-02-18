package ivan.tema5;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio6tresRaya {
    private static boolean combrobar(char tablero[][]){
        boolean termina=false;
        if(tablero[0][0]=='x' && tablero[0][1]=='x' && tablero[0][2]=='x') termina=true;
        if(tablero[1][0]=='x' && tablero[1][1]=='x' && tablero[1][2]=='x') termina=true;
        if(tablero[2][0]=='x' && tablero[2][1]=='x' && tablero[2][2]=='x') termina=true;
        if(tablero[0][0]=='x' && tablero[1][0]=='x' && tablero[2][0]=='x') termina=true;
        if(tablero[0][1]=='x' && tablero[1][1]=='x' && tablero[2][1]=='x') termina=true;
        if(tablero[0][2]=='x' && tablero[1][2]=='x' && tablero[2][2]=='x') termina=true;
        if(tablero[0][0]=='x' && tablero[1][1]=='x' && tablero[2][2]=='x') termina=true;
        if(tablero[0][2]=='x' && tablero[1][1]=='x' && tablero[2][0]=='x') termina=true;

        if(tablero[0][0]=='O' && tablero[0][1]=='O' && tablero[0][2]=='O') termina=true;
        if(tablero[1][0]=='O' && tablero[1][1]=='O' && tablero[1][2]=='O') termina=true;
        if(tablero[2][0]=='O' && tablero[2][1]=='O' && tablero[2][2]=='O') termina=true;
        if(tablero[0][0]=='O' && tablero[1][0]=='O' && tablero[2][0]=='O') termina=true;
        if(tablero[0][1]=='O' && tablero[1][1]=='O' && tablero[2][1]=='O') termina=true;
        if(tablero[0][2]=='O' && tablero[1][2]=='O' && tablero[2][2]=='O') termina=true;
        if(tablero[0][0]=='O' && tablero[1][1]=='O' && tablero[2][2]=='O') termina=true;
        if(tablero[0][2]=='O' && tablero[1][1]=='O' && tablero[2][0]=='O') termina=true;

        return termina;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char tablero[][]=new char[3][3];
        boolean termina=false;

        for(int i=0;i<9;i++) {
            System.out.println("X Escoge fila y columna");
            tablero[sc.nextInt()-1][sc.nextInt()-1]='x';
            termina=combrobar(tablero);
            if (termina) {
                System.out.println("gana X!");
                break;
            }
            mostrar(tablero);
            System.out.println("O Escoge fila y columna");
            tablero[sc.nextInt()-1][sc.nextInt()-1]='O';
            termina=combrobar(tablero);
            if (termina) {
                mostrar(tablero);
                System.out.println("gana X!");
                break;
            }
            mostrar(tablero);
        }
        if(!termina)
            System.out.println("Empate");
    }

    private static void mostrar(char a[][]){
        for(int i=0;i<3;i++){
            System.out.print("|");
            for(int j=0;j<3;j++){
                System.out.print(a[i][j] +"|");
            }
            System.out.println();
        }
    }
}
