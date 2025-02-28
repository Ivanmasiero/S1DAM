package ivan.POO.EnteroGordo;

/**
 * Clase que nos permitira crear enteros de los digitos que queramos y nos permitira sumarlos y multiplicarlos
 */
public class BigNumber {
    /**
     * El contenido de BigNumber
     */
    private String value;
    /**
     * Constructor para un numero grande, guardo el value alreves para poder hacer operaciones después
     * @param in en que numero lo vamos a inicializar
     */
    public BigNumber(int in){
        this.value=new StringBuilder(in+"").reverse().toString();
    }
    public BigNumber(String in){
        this.value=new StringBuilder(in).reverse().toString();
    }
    /**
     *Constructor para crear una instancia de la clase sin ningun valor
     */
    public BigNumber(){
    }
    /**
     * Cojo un bignumber y lo multiplico por n
     * @param n el numero por el cual lo quiero multiplicar
     */
    public static BigNumber multiplica(BigNumber bn,int n){
        String aux=bn.value;
        for(int i=1;i<n;i++) { //empiezo desde 1 porque quiero que repita la suma n-1 veces
            bn.suma(bn, aux);
        }
        return bn;
    }
    /**
     * Funcion para sumar un BigNumber y un String, (he escogido sumar un String porque son estáticos, en caso de sumar
     * 2 BigNumbers tendría problemas a la hora de multiplicar ya que son dinámicos, funcionarian como potencia
     * ej(2,4,8,16) al hacerlo con String de forma estatica será (2,4,6,8,10)
     * @param bn Primer bigNumber
     * @param auxBn String estatico
     */
    public void suma(BigNumber bn,String auxBn){
        StringBuilder sb=new StringBuilder(); //me permite ir guardando el valor de la suma char a char

        int aux=0; //variable para ir guardando la suma de los 2 char de las posicion i
        for(int i=0;i<auxBn.length();i++){ //para recorrer todo el contenido de mi bigNumber
            auxBn=BigNumber.rellena(bn.value,auxBn); //relleno de 0 el numero estatico para poder operar de forma correcta
            if(BigNumber.comprueba(aux)) { //comprobamos si me tengo que llevar una o no
                aux = 0;
                aux = BigNumber.sumaChar(bn, i, auxBn); //suma dos digitos pero puede dar mas de 10
            }
            else {
                aux = 0;
                aux = BigNumber.sumaCharLlevando(bn,i,auxBn); //en caso de que aux sea mas de 10 tengo que sumar 1 mas
            }
            if(BigNumber.comprueba(aux))
                BigNumber.add(sb,aux); // añado de forma correcta la suma al sb, si es un digito
            else
                BigNumber.addLlevando(sb,aux, i); // añado la suma al sb, si son 2 digitos
        }
        if(!comprueba(aux)) //compruebo si tengo que añadir un ultimo digito (1) en caso de llevarme en la ultima suma
            sb.append('1');
        bn.value=sb.toString(); //cambio el valor del contenido de mi bigNumber
        sb=null;
    }
    /**
     * metodo necesario para sumar 2 bigNumbers, sumamos 2 char
     * @param bn bigNumber principal
     * @param i posicion del char a sumar
     * @param auxBn bigNumber segundario
     * @return la suma en entero, puede dar dos digitos
     */
    private static int sumaChar(BigNumber bn, int i, String auxBn){
        /*int a= bn.getChar(i);
        int b= BigNumber.getCharS(auxBn,i);
        return a+b;*/
        return bn.getChar(i)+BigNumber.getCharS(auxBn,i);
    }
    /**
     * metodo necesario para sumar 2 bigNumbers, sumamos 2 char en caso de que la anterior suma haya dado mas de 10
     * @param bn bigNumber principal
     * @param auxBn bigNumber segundario
     * @return la suma en entero, puede dar dos digitos
     */
    private static int sumaCharLlevando(BigNumber bn,int i,String auxBn){
        /*int a= bn.getChar(i);
        int b= BigNumber.getCharS(auxBn,i);
        return a+b+1;*/
        return bn.getChar(i)+BigNumber.getCharS(auxBn,i)+1;
    }
    /**
     * Añado la suma de dos char a la posicion correcta, en caso de que la suma total sea solo 1 digito
     * @param sb donde lo voy a guardar
     * @param aux suma de los dos char
     */
    private static void add(StringBuilder sb,int aux) {
        sb.append(aux);
    }
    /**
     * Añado la suma de dos char a la posicion correcta, en caso de que la suma total sean 2 digitos
     * @param sb donde lo voy a guardar
     * @param aux suma de los dos char
     * @param i posicion
     */
    private static void addLlevando(StringBuilder sb,int aux,int i) {
        sb.append(Integer.toString(aux).charAt(1));
    }
    /**
     * Funcion para devolver el caracter de un bigNumber
     * @param i posicion de caracter a devolver
     * @return el digito en entero
     */
    private int  getChar(int i){
        //return Integer.valueOf(this.value.charAt(i).toString()); <<<<<< preguntar por que no funciona esto
        Character a=this.value.charAt(i);
        return Integer.valueOf(a.toString());
    }
    /**
     * Funcion para devolver el caracter de un Sting
     * @param i posicion de caracter a devolver
     * @return el digito en entero
     */
    private static int getCharS(String aux,int i){
        Character a=aux.charAt(i);
        return Integer.valueOf(a.toString());
    }
    /**
     * comprueba si es un digito o dos digitos para saber como sumar
     * @param aux entero a analizar
     * @return si es un digito devuelve true
     */
    private static boolean comprueba(int aux){
        if (aux<10)return true;
        else return false;
    }
    /**
     * funcion para rellenar de 0 el string "estatico" para que se pueda sumar de forma correcta con el bignumber
     * @param bn valor de bignumber para saber la longitud
     * @param aux string que quiero aumentar su tamaño
     * @return
     */
    private static String rellena(String bn,String aux){
        StringBuilder sc=new StringBuilder(aux);
        for(int i=aux.length();i<bn.length();i++){
            sc.append(0);
        }
        return sc.toString();
    }

    /**
     * función para devolver el contenido del BigNumber
     * @return contenido
     */
    public String getValue() {
        StringBuilder sb=new StringBuilder(this.value);
        return sb.reverse().toString();
    }
}