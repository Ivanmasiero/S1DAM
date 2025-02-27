package ivan.POO.main;

import ivan.POO.EjercicioMatriz.MatrizD;

public class UsoMatrizD {
    public static void main(String[] args) {
        MatrizD matriz=new MatrizD();
        matriz.setNum(1,10);//asigno el valor 1 en la posicion 10
        matriz.setNum(10,-120);//asigno el valor 10 en la posicion -120
        matriz.setNum(134,123);//asigno el valor 134 en la posicion 123
        System.out.println(matriz.getNum(10)); //devuelvo el valor de la posicion 10
        System.out.println(matriz); //devuelvo el valor de todos los indices con su valor

    }
}
