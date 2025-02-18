package ivan.EjercicioMatriz;

/**
 * @author ivanmasiero
 * version 1
 */

public class Matriz {
    private int []length;

    /**
     * Crea una matriz de solo una dimension con los espacios especificados por parametros
     * @param length
     */
    public Matriz(int length) {

    }

    /**
     * Crea una matriz de solo un espacio con solo una dimension
     */
    public Matriz() {

    }

    /**
     * Constructor para matrices bidimensionales
     * @param row
     * @param col
     */
    public Matriz(int row, int col) {
    }

    /**
     * Primer parametro es la posicion donde lo quiero insertar y el segundo es el valor que quiero insertar, en caso de saltarte una posicion dara error.
     * @param indice
     * @param valor
     */
    public void setNum(int indice, int valor) {
    }

    /**
     * Pido por teclado numeros y voy rellenando hasta que no hay espacios o al poner una letra
     */
    public void setNums() {
    }

    /**
     * Pongo tamaño nuevo si es mas grande relleno con 0, si es menos pierdo datos
     * @param indice
     */
    public void setSize(int indice) {
    }

    /**
     * Borro el numero de la posicion especificada por parametro
     * @param indice
     */
    public void delNum(int indice) {
    }

    /**
     * Me devuelve el valor de la posicion especificada
     * @param indice
     */
    public int  getValor(int indice) {
        return 0;
    }

    /**
     * Devuelve el numero de dimensiones
     * @return
     */
    public int dimensiones() {
        return 0;
    }

    /**
     * Especifico fila, columna y número. Coloca el numero que queramos en la posición especificada, si nos saltamos algun indice dara error
     * @param row
     * @param col
     * @param valor
     */
    public void setNum(int row, int col, int valor) {
    }

    /**
     * Pido por teclado numeros y voy rellenando hasta que no hay espacios o al poner una letra. En caso de poner 2 en parametros el metodo se hara para
     * matrices bidimensionales
     * @param dimensiones
     */
    public void setNums(int dimensiones){

    }

    /**
     * Pongo el numero de columnas nuevo, si es mas grande lo relleno con 0 si es mas pequeño pierdo los datos
     * @param col
     */
    public void setCol(int col) {
    }

    /**
     * Pongo el numero de filas nuevo, si es mas grande lo relleno con 0 si es mas pequeño pierdo los datos
     * @param row
     */
    public void setFila(int row) {
    }

    /**
     * Borro el valor de la posicion diciendole que fila y columna. Muevo todos los numeros a una posicion anterior
     * @param row
     * @param col
     */
    public void delNum(int row, int col) {
    }

    /**
     * Devuelvo el valor de la posicion especificada
     * @param row
     * @param col
     */
    public int getValor(int row, int col) {
        int valor=0;
        return valor;
    }
}
