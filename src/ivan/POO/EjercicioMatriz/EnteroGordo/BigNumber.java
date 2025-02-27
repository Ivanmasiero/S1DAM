package ivan.POO.EjercicioMatriz.EnteroGordo;

import java.math.BigInteger;

public class BigNumber {

    private String value;
    /**
     * Constructor para un numero grande, guardo el value alreves para poder hacer operaciones después
     * @param in en que numero lo vamos a inicializar
     */
    public BigNumber(int in){
        this.value=new StringBuilder(in+"").reverse().toString();
    }
    /**
     *Constructor para crear una instancia de la clase sin ningun valor
     */
    public BigNumber(){
    }

    /**
     * Multiplico un BigNumber por n
     * @param bn El bigNumber a multiplicar
     * @param n el numero entero por el cual lo quiero multiplicar
     * @return bnFinal el bigNumber que devuelvo
     */
    public static String multiplica(BigNumber bn, int n){
        //bn+bn n veces
        BigNumber bnFinal=new BigNumber();
        bnFinal.value="";
        int aux;
        int llevo=0;
        StringBuilder sb=new StringBuilder(bnFinal.value);

            for(int j=0;j<bn.value.length();j++){
                aux =Character.getNumericValue(bn.value.charAt(j))*n;
                if(llevo==1) {
                    aux += 1;
                    llevo =0;
                    if (aux > 9) {
                        aux -= 10;
                        llevo =1;
                        sb.insert(j,Integer.toString(aux).charAt(0));
                    }
                    else sb.insert(j,Integer.toString(aux).charAt(0));
                }
                else {
                    if (aux>9) {
                        aux -=10;
                        llevo =1;
                        sb.insert(j,Integer.toString(aux).charAt(0));
                    }
                    else sb.insert(j,Integer.toString(aux).charAt(0));
                }
                aux=0;
                if (j==(bn.value.length()-1) && llevo==1)
                        sb.append(1);



            }

        bnFinal.value=sb.toString();
        return sb.reverse().toString();
    }

    /**
     * Cojo un bignumber y lo multiplico por n
     * @param bn devuelvo el mismo bignumber despues de las operaciones
     * @param n el numero por el cual lo quiero multiplicar
     */
    public void multiplicaa(BigNumber bn,int n){
        BigNumber auxBn=bn;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<auxBn.value.length();i++){
            BigNumber.suma(bn.getChar(i),auxBn.getChar(i))*n;
        }

    }

    /**
     * Funcion para devolver el caracter de un bigNumber
     * @param i posicion de caracter a devolver
     * @return
     */
    private  char getChar(int i){
        return this.value.charAt(i);
    }
    private void suma

    public String getValue() {
        return this.value;
    }

}
