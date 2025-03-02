package ivan.POO.EjercicioMatriz;
/**
 * @author ivanmasiero
 * version 1
 */
public class Matriz {
    private int[] contenido;
    private int length;
    private int[][] contenidoB;

    /**
     * Contructor para crear un array de un numero de espacios determinado
     *
     * @param row numero de espacios
     */
    public Matriz(int row) {
        contenido = new int[row + 1];
    }

    /**
     * Cambio el valor de una posicion determinada
     * @param row   posicion a guardar
     * @param valor a poner
     */
    public void setNum(int row, int valor) {
        this.contenido[row] = valor;
    }
    /**
     * amplio el numero de espacios a ampliar, debe ser mas grande que la longitud que ya tiene, si no da error
     *
     * @param row
     */
    public int[] amplio(int row) {
        if (row <= contenido.length) throw new IllegalArgumentException("error, espacios demasiado pequeños");
        int[] aux = new int[row + 1];
        return Matriz.cambia(aux, this);
    }
    private static int[] cambia(int[] aux, Matriz matriz) {
        for (int i = 1; i <= aux.length + 1; i++) {
            aux[i] = matriz.contenido[i];
        }
        return aux;
    }
    public String toString() {
        Integer aux;
        String result = "";
        for (int i = 0; i < contenido.length; i++) {
            aux = contenido[i];
            result = aux.toString();
        }
        return result;
    }
    public int getNum(int row){
        return 0;
    }
}
