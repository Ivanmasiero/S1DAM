package ivan.POO.main;

import ivan.POO.EjercicioMatriz.Matriz;

public class UsoMatriz {
    public static void main(String[] args) {
        Matriz e = new Matriz();
        Matriz e1 = new Matriz(4);
        e1.setNum(1, 10);
        e1.setNums();
        e1.setSize(5);
        e1.delNum(3);
        System.out.println(e1.getValor(1));
        System.out.println(e1.dimensiones());
        System.out.println(e1);


        Matriz a = new Matriz(3, 3);
        a.setNum(1, 1, 10);
        a.setNums();
        a.setCol(4);
        a.setFila(4);
        a.delNum(1, 1);
        System.out.println(a.getValor(1, 2));
        System.out.println(a.dimensiones());
        System.out.println(a);
    }

}
