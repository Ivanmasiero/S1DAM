package ivan.tema6;

public class ejercicioClase {
    public static void main(String[] args) {

        StringBuilder a=new StringBuilder("123AbCdE63712Fs62degeggsgtasDSAFa");
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i)))
                System.out.println(a.charAt(i)+" es digito");
            if(Character.isLowerCase(a.charAt(i))) {
                a.insert(i,Character.toUpperCase(a.charAt(i)));
                a.deleteCharAt(i+1);
            }
            else {
                a.insert(i, Character.toLowerCase(a.charAt(i)));
                a.deleteCharAt(i + 1);
            }
        }
        System.out.println(a);


     /*Dado un String recorrelo para todos los digitos tienes que decir que es digito y para todos lo que sea minuscula
                lo pasas a mayusculas*/
    }
}