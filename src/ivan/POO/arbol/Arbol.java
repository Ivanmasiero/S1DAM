package ivan.POO.arbol;
/**
 * Clase estática que me permitira leer una operacion y dar el resultado
 */
public class Arbol {
    /**
     * Permite recoger una operacion y dar el resultado, solo permite operar con enteros positivos
     * @param op en tipo string formato valor1 | operador | valor2
     * @return resultado en formato entero
     */
    public static int opera(String op){
        int aux=Arbol.comprueba(op);
        int result;
        switch (aux){
            case 1:result=Arbol.suma(op);break;
            case 2:result=Arbol.resta(op);break;
            case 3:result=Arbol.multiplica(op);break;
            case 4:result=Arbol.divide(op);break;
            default:return 0;
        }
        return result;
    }
    private static int comprueba(String op){
        StringBuilder sc=new StringBuilder(op);
    }


    public static int suma(String op){
        StringBuilder sb=new StringBuilder(op);
        result=Arbol.valor1+Arbol.valor2;
    }
}
