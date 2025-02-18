package ivan.tema7;

public class Coche {
        private int numRueda;
        private int  numMatricula;
        private int numPuerta;
        private String letraMatricula;
        private int getNumRueda;
        private static int cuantosCoches;



        public int getNumRueda() {
            return numRueda;
        }

        public String getMatricula() {
            String matricula=String.valueOf(numMatricula)+"-"+letraMatricula;
            return matricula;
        }

        public void setNumMatricula(int numMatricula) {
            this.numMatricula = numMatricula;
        }

        public void setLetraMatricula(String letraMatricula) {
            this.letraMatricula = letraMatricula;
        }
        public int getNumPuerta() {
            return numPuerta;
        }
         public void setNumPuerta(int numPuerta) {
            this.numPuerta = numPuerta;
        }
        public static int getCuantosCoches(){
            return cuantosCoches;
        }

    public Coche() {
        this.numRueda = 4;
        cuantosCoches++;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Número de ruedas=" + getNumRueda() +
                ",Matricula=" + getMatricula() +
                ", Número de puertas=" + getNumPuerta() +
                '}';
    }
}


