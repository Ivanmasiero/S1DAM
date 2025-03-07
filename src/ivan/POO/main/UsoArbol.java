package ivan.POO.main;

import ivan.POO.arbol.Arbol;

public class UsoArbol {
    public static void main(String[] args) {
        //Declaro las operaciones
        String operacion1="3+3";
        String operacion2="5-2";
        String operacion3="2*3";
        String operacion4="10/2";
        //Realizo las operacione
        int resultado1=Arbol.opera(operacion1);
        //int resultado2=Arbol.opera(operacion2);
        //int resultado3=Arbol.opera(operacion3);
        //int resultado4= Arbol.opera(operacion4);
        //imprimo los resultados
        System.out.println(operacion1+" es "+resultado1);
        //System.out.println(operacion2+" es "+resultado2);
        //System.out.println(operacion3+" es "+resultado3);
        //System.out.println(operacion4+" es "+resultado4);



    }
}
