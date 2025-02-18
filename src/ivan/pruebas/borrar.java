package ivan.pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class borrar {
    public static void main(String[] args) {
        int edad = 0;
        boolean b=false;
        System.out.println("Introduce tu edad");

            try (Scanner sc = new Scanner(System.in)) {
                do {
                    edad = sc.nextInt();
                    b = comprobar(edad);
                    if (!b)
                        throw new EdadNoValidaException("edad no valida, introduce otra edad");
                }while (!b);
            } catch (InputMismatchException e) {
                System.out.println("Dato intrudocido no válido");
            } catch (EdadNoValidaException t) {
                System.out.println(t.toString());
            }



    }
    private static boolean comprobar(int edad){
        return edad > 17;
    }
}





