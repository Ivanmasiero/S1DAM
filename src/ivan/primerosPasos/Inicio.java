package ivan.primerosPasos;

public class Inicio {
    public static void main(String[]args) {

       int a = 1834984, b = 3434;
       int c = 0, cd = 0;
       
       while (a >= b ) {
    	   a = a - b;
    	   c++;
       }
       if ( a < b) {
    	   a = a * 100;
    	   while (a >= b) {
    		   a = a - b;
    		   cd++;
    	   }
       }
       
        
        System.out.println("el resultado es " + c + "." + cd);
        
    }

}

