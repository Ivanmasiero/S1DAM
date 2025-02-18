package ivan.tema7;

public class UsoCoche {
    public static void main(String[] args) {
        Coche c = new Coche();
        c.setLetraMatricula("abc");
        c.setNumMatricula(1234);
        c.setNumPuerta(4);
        System.out.println(c.toString());
        Coche c2=new Coche();
        Coche c3=new Coche();
        System.out.println(Coche.getCuantosCoches());
    }
}
