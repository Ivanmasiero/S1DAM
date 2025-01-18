package ivan.pruebas;

import java.util.Arrays;
import java.util.Random;

public class borrar {

    public static void main(String[] args){
        char tablero[][]={{'x','x','x'},{'w','w','w'},{'s','s','s'}};
        boolean termina=false;



        if(tablero[0][0]=='x' && tablero[0][1]=='x' && tablero[0][2]=='x') termina=true;
        if(termina)
            System.out.println("si");
    }
    }
