package ivan.tema5;
public class EjercicioVueltaArray {
    public static void  mostrar(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println("]");
        }
    }
    public static void  mostrarString(String a[][]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println("]");
        }
    }
    public static String[][] vuelta( int a[][] ){
        int iMax = a.length;
        int jMax = 0;
        String valor;
        //para saber la longitud maxima
        for (int i = 0; i < a.length; i++) {
            if (a[i].length > jMax)
                jMax = a[i].length;
        }
        //Crear un Array regular y pasar los datos de int a String y del antiguo Array al nuevo regular
        String aRegular[][] = new String[iMax][jMax];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                valor = Integer.toString(a[i][j]);
                aRegular[i][j]=valor;
            }
        }
        //Creamos un nuevo array en el que metemos los datos dando la vuelta y de paso metemos espacio en blanco en
        //donde no hay información
        String b[][] = new String[jMax][iMax];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < iMax; j++) {
                b[i][j] = aRegular[j][i];
                if(b[i][j]==null)
                    b[i][j]=" ";
            }
        }
        return b;
    }
        public static void main(String[] args) {
            int a[][] = {{2, 3, 5, 4,}, {1, 4, 6, 7, 8}, {1, 3, 3, 6,}};
            mostrar(a);
            System.out.println();
            String b[][] = new String[6][6];
            b = vuelta(a);
            mostrarString(b);

        }
    }

