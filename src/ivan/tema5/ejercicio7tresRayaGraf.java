package ivan.tema5;

import tema5.ejerciciosFinales.Punto5_Ejercicio7_unPocoGraficos.Tablero;

import javax.swing.*;

public class ejercicio7tresRayaGraf{
    public final static int MAX=3;
    public static void main(String[] args) {
            Tablero t = new Tablero(MAX);
            int col, fila;
            char turno = 'X';
            boolean hayganador = false;
            boolean hayespacio = true;
            t.setTitulo("Juego de machos");
            do {
                t.setTitulo("Es turno del farlopero " + turno);
                hayespacio = t.nextCasilla(10);
                fila = t.getFila();
                col = t.getColumna();
                t.writeCasilla(fila, col, turno);
                hayganador = comprueba(t, turno);
                turno = turno == 'X' ? 'O' : 'X';
            } while (!hayganador && hayespacio);

            if (hayganador) {
                turno = turno == 'X' ? 'O' : 'X';
                t.setTitulo("El ganador es el periquista " + turno);
            } else
                t.setTitulo("Tablas");

        }
        //comprueba hardcodeado a 3x3
    /*public static boolean comprueba(Tablero t, char turno){
        return  (t.readCasilla(1,1)==turno&&t.readCasilla(1,2)==turno&&t.readCasilla(1,3)==turno)||
                (t.readCasilla(2,1)==turno&&t.readCasilla(2,2)==turno&&t.readCasilla(2,3)==turno)||
                (t.readCasilla(3,1)==turno&&t.readCasilla(3,2)==turno&&t.readCasilla(3,3)==turno)||
                (t.readCasilla(1,1)==turno&&t.readCasilla(2,1)==turno&&t.readCasilla(3,1)==turno)||
                (t.readCasilla(1,2)==turno&&t.readCasilla(2,2)==turno&&t.readCasilla(3,2)==turno)||
                (t.readCasilla(1,3)==turno&&t.readCasilla(2,3)==turno&&t.readCasilla(3,3)==turno)||
                (t.readCasilla(1,1)==turno&&t.readCasilla(2,2)==turno&&t.readCasilla(3,3)==turno)||
                (t.readCasilla(1,3)==turno&&t.readCasilla(2,2)==turno&&t.readCasilla(3,1)==turno);
    }*/
    //comprueba sin hardcodeo
    private static boolean comprueba(Tablero t,char valor) {
        boolean ganador = false;
        //fila
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                if (t.readCasilla(i, j) == valor)
                    ganador = true;
                else {
                    ganador = false;
                    break;
                }
            }
            if (ganador) return true;
        }

        //columna
        for (int i = 1; i <= MAX; i++) {
            for (int j = 1; j <= MAX; j++) {
                if (t.readCasilla(j, i) == valor)
                    ganador = true;
                else {
                    ganador = false;
                    break;
                }
            }
            if (ganador) return true;
        }
        //diagonal1
        for (int i = 1; i <= MAX; i++) {
            if (t.readCasilla(i, i) == valor) {
                ganador = true;
            } else {
                ganador = false;
                break;
            }
        }
            if (ganador)return true;

        //diagonal2
        int aux = 4;
        for (int i = 1; i <= MAX; i++) {
            aux--;
            if (t.readCasilla(i, aux) == valor) {
                ganador = true;
            } else {
                ganador = false;
                break;
            }
        }
        if (ganador) return true;

    return false;
    }

}

