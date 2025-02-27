package ivan.POO.EnteroGordo;

public class BigNumber {

    private String value;
    private BigNumber nextNote;
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
     * Cojo un bignumber y lo multiplico por n
     * @param n el numero por el cual lo quiero multiplicar
     */
    public void multiplica(int n){    // <<<<<<< probar de forma estatica si me deja cambiar el value de bn
        String aux=this.value;
        for(int i=0;i<n;i++) {
            this.suma(this, aux);
        }
        StringBuilder sc=new StringBuilder(this.value);
        this.value=sc.reverse().toString();



        /*BigNumber auxBn=new BigNumber(Integer.valueOf(this.getValue()));
        for(int i=0;i<n;i++){
            this.suma(this,auxBn);
        }/*
        /*BigNumber auxBn=new BigNumber();
        auxBn=this;
        for(int i=0;i<n;i++){
            this.suma(this,auxBn);
        }*/
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
     * Funcion para sumar dos bigNumbers
     * @param bn Primer bigNumber
     * @param auxBn Segundo bigNumber a sumar
     */
    public void suma(BigNumber bn,BigNumber auxBn){
        StringBuilder sb=new StringBuilder(); //me permite ir guardando el valor de la suma char a char
        int aux=0;
        for(int i=0;i<auxBn.value.length();i++){
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
        if(!comprueba(aux))
            sb.append('1');
        bn.value=sb.toString();
    }

    /**
     * Añado la suma de dos char a la posicion correcta, en caso de que la suma total sea solo 1 digito
     * @param sb donde lo voy a guardar
     * @param aux suma de los dos char
     */
    private static void add(StringBuilder sb,int aux){
        sb.append(aux);
    }
    /**
     * Añado la suma de dos char a la posicion correcta, en caso de que la suma total sean 2 digitos
     * @param sb donde lo voy a guardar
     * @param aux suma de los dos char
     * @param i posicion
     */
    private static void addLlevando(StringBuilder sb,int aux,int i){
        sb.append(Integer.toString(aux).charAt(1));
    }


    /**
     * metodo necesario para sumar 2 bigNumbers, sumamos 2 char en caso de que la anterior suma haya dado mas de 10
     * @param bn bigNumber principal
     * @param auxBn bigNumber segundario
     * @return la suma en entero, puede dar dos digitos
     */
    private static int sumaCharLlevando(BigNumber bn,int i,BigNumber auxBn){
        int a= bn.getChar(i);
        int b= auxBn.getChar(i);
        return a+b+1;
           //return bn.getChar(i)+auxBn.getChar(i)+1;
    }
    /**
     * metodo necesario para sumar 2 bigNumbers, sumamos 2 char
     * @param bn bigNumber principal
     * @param i posicion del char a sumar
     * @param auxBn bigNumber segundario
     * @return la suma en entero, puede dar dos digitos
     */
    private static int sumaChar(BigNumber bn, int i, BigNumber auxBn){
        int a= bn.getChar(i);
        int b=bn.getChar(i);
        return a+b;
        //return bn.getChar(i)+auxBn.getChar(i);
    }

    /**
     * comprueba si es un digito o dos digitos para saber como sumar
     * @param aux entero a analizar
     * @return
     */
    private static boolean comprueba(int aux){
        if (aux<9)return true;
        else return false;
    }
    /*
    537434
    6878
    1
     */
    public String getValue() {
        return this.value;
    }
}
