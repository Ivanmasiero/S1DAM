package ivan.POO.main;

import ivan.POO.EjercicioMatriz.Matriz;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz matriz=new Matriz(3);//inicializo una matriz de 3 espacios y los relleno de 0
        matriz.setNum(1,1);
        matriz.setNum(2,2);
        matriz.setNum(3,3);
        matriz.toString();
        //matriz.setNum(3,7);// pongo un 3 en la posicion 7, relleno con 0 los espacios en blanco
        //matriz.amplio(8);//cambio el tamaño del array de 7 a 8
        //System.out.println(matriz.toString());// devuelvo la matriz de forma bonita




    }

}
