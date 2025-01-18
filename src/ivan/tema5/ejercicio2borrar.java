package ivan.tema5;
//Se pide la realización de este ejercicio en ejerciciosFinales (ejercicio 2)
import java.util.Arrays;

// La clase Array no dispone de un método específico para borrar un elemento
// la razón es sencilla ya que una estructura estática no es la mejor opción
// para hacer un borrado.

public class ejercicio2borrar {
    //Distinguiremos de borrados:
    // CASO 1: Borrar un elemento en una posición concreta.
    //  El nuevo array tendrá un elemento menos

    // La siguiente función devuelve un nuevo array en el que se ha borrado
    // el elemento en posicion (de 0 a n-1)
    private static int[] borradoPosicion(int inicio[],int posicion) {
        int resultado[]=new int[inicio.length-1];
        // Te toca programarlo a tí
        for(int i=0;i<posicion;i++)
            resultado[i]=inicio[i];
        for(int i=posicion;i<resultado.length;i++)
            resultado[i]=inicio[i+1];
        return resultado;
    }

    // CASO 2: Borrar la primera ocurrencia de valor en inicio.
    //  para mejorar la eficiencia de la función, inicio estará ordenado ascendente

    // La siguiente función devuelve un nuevo array en el que se ha borrado
    // valor (la primera ocurrencia)
    private static int[] borradoValor(int inicio[],int valor) {
        int resultado[]=new int[inicio.length-1];
        // Te toca programarlo a tí
        boolean flag=true;
        int posicion=0;
        for(int i=0;i<inicio.length;i++){
            if(inicio[i]==valor) {
                posicion = i;
                flag=false;
            }
        }
        if(flag)
            resultado=inicio;
        else
            resultado=borradoPosicion(inicio,posicion);
        return resultado;
    }

    // Idem que la anterior pero todas las ocurrencias
    private static int[] borradoValorTodos(int inicio[],int valor) {
        // Te toca programarlo a tí
        int contador=0;
        int j=0;
        for(int i=0;i< inicio.length;i++){
            if(inicio[i]==valor)
                contador++;
        }
        int resultado[] = new int[inicio.length - contador];
        for(int i=0;i< inicio.length;i++){
            if(inicio[i]!=valor){
                resultado[j]=inicio[i];
                j++;
            }
        }




        return resultado;
    }
    public static void main(String[] args) {
        // Array no ordenado
        int valores[]= {1,10,2,4,-3};
        int resultado[]=borradoPosicion(valores,3);
        System.out.println("Ya borrado posicion 0  "+Arrays.toString(resultado));
        // Array ordenado
        int valores2[]= {1,2,3,5,6,7};
        int resultado2[]=borradoValor(valores2,3);
        System.out.println("Ya borrado valor 3     "+Arrays.toString(resultado2));
        int valores3[]={4,2,1,2,2,1,2,1,2,4,2,2,2,2};
        int resultado3[]=borradoValorTodos(valores3,2);
        System.out.println("hemos borrado los 2    "+Arrays.toString(resultado3));


    }
}
