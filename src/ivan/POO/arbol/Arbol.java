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
        switch (aux){
            case 1:return Arbol.suma(op);
         //   case 2:result=Arbol.resta(op);break;
           // case 3:result=Arbol.multiplica(op);break;
           // case 4:result=Arbol.divide(op);break;
            default:return 0;
        }
    }

    /**
     * permite comprobar el tipo de operacion que es
     * @param op operacion a comprobar
     * @return tipo de operacion que es 1-suma, 2-resta, 3-multiplica, 4-divide
     */
    private static int comprueba(String op){
        StringBuilder sc=new StringBuilder(op);
        return 1;
    }

    /**
     * permite sumar
     * @param op operacion a sumar
     * @return el valor de la suma
     */
    public static int suma(String op){
        return Arbol.getValor1(op)+Arbol.getValor2(op);
    }

    /**
     * permite conseguir el valor del primer numero antes del operador
     * @param op operacion a buscar
     * @return el primer operador
     */
    private static int getValor1(String op) {
        StringBuilder sb = new StringBuilder(op);
        for (int i = 0; i < compruebaOp(op); i++) {
                sb.append(op.charAt(i));
            }
        return Integer.valueOf(sb.toString());
    }
    private static int getValor2(String op) {
        StringBuilder sb = new StringBuilder(op);
        for(int i=compruebaOp(op);i<op.length();i++){
            sb.append(op.charAt(i));
        }
        return Integer.valueOf(sb.toString());
    }
    private static int compruebaOp(String op) {
        int pos = 0;
        for (int i = 0; i < op.length(); i++) {
            if (op.charAt(i) != '+' || op.charAt(i) != '-' || op.charAt(i) != '*' || op.charAt(i) != '/')
                pos = i;
        }
        return pos;
    }
}
